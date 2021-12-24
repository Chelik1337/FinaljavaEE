package com.javaeefinal.itse1908r.javaeefinal.Services;

import com.javaeefinal.itse1908r.javaeefinal.Models.Group;
import com.javaeefinal.itse1908r.javaeefinal.Models.StudentDetail;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.StudentDetailRepository;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.List;

@Stateful
@RunWith(JUnit4.class)
public class StudentDetailService {
    @Inject
    StudentDetailRepository studentDetailRepository;

    //    @Test
    public List<StudentDetail> getAllStudentDetails() {return studentDetailRepository.findAll();}

    //    @Test
    public StudentDetail findById(int id) {return studentDetailRepository.findById(id);}

    //    @Test
    public StudentDetail updateGroupById(int id, Group group) {return studentDetailRepository.updateGroupById(id, group);}
}
