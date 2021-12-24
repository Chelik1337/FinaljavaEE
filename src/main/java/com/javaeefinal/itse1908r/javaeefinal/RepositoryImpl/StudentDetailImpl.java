package com.javaeefinal.itse1908r.javaeefinal.RepositoryImpl;

import com.javaeefinal.itse1908r.javaeefinal.EntityManager;
import com.javaeefinal.itse1908r.javaeefinal.Models.Group;
import com.javaeefinal.itse1908r.javaeefinal.Models.StudentDetail;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.StudentDetailRepository;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

public class StudentDetailImpl implements StudentDetailRepository {
    @Inject
    EntityManager em;

    @Override
    public List<StudentDetail> findAll() {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT s FROM StudentDetail s");
            List<StudentDetail> result = query.getResultList();
            return result;
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public StudentDetail findById(int id) {
        javax.persistence.EntityManager entityManager = em.manager();
        StudentDetail result = entityManager.find(StudentDetail.class, id);
        return result;
    }

    @Override
    public StudentDetail updateGroupById(int id, Group group) {
        javax.persistence.EntityManager entityManager = em.manager();
        StudentDetail studentDetail = entityManager.find(StudentDetail.class, id);
        Group group1 = entityManager.find(Group.class, group.getId());
        studentDetail.setGroup(group1);
        entityManager.persist(studentDetail);
        return studentDetail;
    }

    @Override
    public StudentDetail insertDetail(String name) {
        javax.persistence.EntityManager entityManager = em.manager();
        StudentDetail studentDetail = new StudentDetail();
        return studentDetail;
    }
}
