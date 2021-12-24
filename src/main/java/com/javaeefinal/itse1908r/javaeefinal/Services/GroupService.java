package com.javaeefinal.itse1908r.javaeefinal.Services;

import com.javaeefinal.itse1908r.javaeefinal.Models.Group;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.GroupRepository;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.List;

@Stateful
@RunWith(JUnit4.class)
public class GroupService {
    @Inject
    GroupRepository groupRepository;

    //    @Test
    public List<Group> findAll() {return groupRepository.findAll();}

    //    @Test
    public Group findById(int id) {return groupRepository.findById(id);}

//    @Test
    public Group updateNameById(int id, String name) {return groupRepository.updateNameById(id, name);}

//    @Test
    public Group insertGroup(String name) {return groupRepository.insertGroup(name);}
}
