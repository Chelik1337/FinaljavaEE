package com.javaeefinal.itse1908r.javaeefinal.RepositoryImpl;

import com.javaeefinal.itse1908r.javaeefinal.EntityManager;
import com.javaeefinal.itse1908r.javaeefinal.Models.Group;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.GroupRepository;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

public class GroupRepositoryImpl implements GroupRepository {
    @Inject
    EntityManager em;

    @Override
    public List<Group> findAll() {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT g FROM Group g");
            List<Group> result = query.getResultList();
            return result;
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Group findById(int id) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Group result = entityManager.find(Group.class, id);
            return result;
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Group updateNameById(int id, String name) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Group result = entityManager.find(Group.class, id);
            result.setName(name);
            entityManager.persist(result);
            return result;
        }catch (NoResultException e){
            return null;
        }

    }

    @Override
    public Group insertGroup(String name) {
        javax.persistence.EntityManager entityManager = em.manager();
        Group group = new Group();
        group.setName(name);
        entityManager.persist(group);
        return null;
    }
}
