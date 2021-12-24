package com.javaeefinal.itse1908r.javaeefinal.Repositories;

import com.javaeefinal.itse1908r.javaeefinal.Models.Group;

import java.util.List;

public interface GroupRepository {
    List<Group> findAll();
    Group findById(int id);
    Group updateNameById(int id, String name);
    Group insertGroup(String name);
}
