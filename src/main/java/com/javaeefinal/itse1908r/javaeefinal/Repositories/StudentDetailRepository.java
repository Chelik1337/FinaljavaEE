package com.javaeefinal.itse1908r.javaeefinal.Repositories;

import com.javaeefinal.itse1908r.javaeefinal.Models.StudentDetail;

import java.util.List;

public interface StudentDetailRepository {
    List<StudentDetail> findAll();
    StudentDetail findById(int id);
    StudentDetail updateGroupByIdandGroupName(int id, int group);
}
