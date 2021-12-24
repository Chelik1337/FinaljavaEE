package com.javaeefinal.itse1908r.javaeefinal.Repositories;

import com.javaeefinal.itse1908r.javaeefinal.Models.Group;
import com.javaeefinal.itse1908r.javaeefinal.Models.StudentDetail;

import java.util.List;

public interface StudentDetailRepository {
    List<StudentDetail> findAll();
    StudentDetail findById(int id);
    StudentDetail updateGroupById(int id, Group group);
}
