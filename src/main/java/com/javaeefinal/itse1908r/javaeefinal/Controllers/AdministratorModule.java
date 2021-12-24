package com.javaeefinal.itse1908r.javaeefinal.Controllers;

import com.javaeefinal.itse1908r.javaeefinal.Services.InstitutionService;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.ExceptionMapper;


@Path("/admin")
@RolesAllowed({"ADMIN"})
public class AdministratorModule implements ExceptionMapper {
    @EJB
    InstitutionService institutionService;

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    @Context
    HttpHeaders httpHeaders;



    @GET
    @Path("/getAllInstitutions")
    @Produces("application/json")
    public Response getAllInstitutions() throws JMSException {
        return  Response.ok()
                .entity(institutionService.getAllInstitutions())
                .build();
    }

    @GET
    @Path("/getInstitutionByName/{name}")
    @Produces("application/json")
    public Response getInstitutionByName(@PathParam("name") String name) throws JMSException {
        return  Response.ok()
                .entity(institutionService.getInstitutionByName(name))
                .build();
    }

    @GET
    @Path("/getInstitutionById/{id}")
    @Produces("application/json")
    public Response getInstitutionById(@PathParam("id") int id) throws JMSException {
        return  Response.ok()
                .entity(institutionService.getInstitutionById(id))
                .build();
    }

    @PUT
    @Path("/getAllInstitutions{id}")
    @Produces("application/json")
    public Response updateAddressById(@PathParam("id") int id, @FormParam("address") String address) throws JMSException {
        return  Response.ok()
                .entity(institutionService.updateAddressById(id, address))
                .build();
    }

    @PUT
    @Path("/getAllInstitutions{id}")
    @Produces("application/json")
    public Response updateNumberById(@PathParam("id") int id, @FormParam("number") String number) throws JMSException {
        return  Response.ok()
                .entity(institutionService.updateNumberById(id, number))
                .build();
    }

@Override
    public Response toResponse(Throwable throwable) {
        return Response.status(500)
                .entity("ATTENTION! ERROR HANDLER IS FOUND A NEW ERROR")
                .build();
    }


}
