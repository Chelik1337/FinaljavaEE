package com.javaeefinal.itse1908r.javaeefinal.RepositoryImpl;

import com.javaeefinal.itse1908r.javaeefinal.EntityManager;
import com.javaeefinal.itse1908r.javaeefinal.Models.Category;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.CategoryRepository;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Inject
    EntityManager em;


    @Override
    public List<Category> findAll() {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT c FROM Category c");
            List<Category> result = query.getResultList();
            return result;
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Category findById(int id) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT c FROM Category c WHERE c.id = " + id);
            Category result = (Category) query.getSingleResult();
            return result;
        } catch (NoResultException e){
            return null;
        }
    }
}
