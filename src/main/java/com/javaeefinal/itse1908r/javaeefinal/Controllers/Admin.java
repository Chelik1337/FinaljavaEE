package com.javaeefinal.itse1908r.javaeefinal.Controllers;

import com.javaeefinal.itse1908r.javaeefinal.Models.ERole;
import com.javaeefinal.itse1908r.javaeefinal.Models.User;
import com.javaeefinal.itse1908r.javaeefinal.Services.UserService;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.ExceptionMapper;


@Path("/admin")
@RolesAllowed({"ADMIN"})
public class Admin implements ExceptionMapper {
    @EJB
    UserService userService;


    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    @Context
    HttpHeaders httpHeaders;



    @DELETE
    @Path("/deleteUser/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUser(
            @DefaultValue("0")
            @PathParam("Id") int id){
        String userLogin = userService.getUserById((long) id).getLogin();
        userService.deleteUserById(id);
        return Response.ok().entity("User " + userLogin + " was removed").build();
    }


    @PUT
    @Path("/updatePassowrd/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response updateUserPassword(@DefaultValue("0")
                                           @PathParam("id") int id, String newPassword){
        User user = userService.getUserById((long) id);
        if (user.getRole().getName() == ERole.Admin){
            return Response.serverError().entity("You can not change admin's role").build();
        } else {
            userService.updatePasswordById(id, newPassword);
            return Response.ok().entity("Password has been changed").build();
        }
    }


    @PUT
    @Path("/updatePasswordByLogin/{login}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response updateUserPasswordByLogin(@PathParam("login") String login, String newPassword){
        User user = userService.getUserByLogin(login);
//        boolean test = user.getRole().getName().equals("Admin");
        if (user.getRole().getName() == ERole.Admin){
            return Response.serverError().entity("You can not change admin's role").build();
        } else {
            userService.updatePasswordByLogin(login,newPassword);
            return Response.ok().entity("Password has been changed").build();
        }

    }



    @Override
    public Response toResponse(Throwable throwable) {
        return Response.status(500)
                .entity("ATTENTION! ERROR HANDLER IS FOUND A NEW ERROR")
                .build();
    }


}
