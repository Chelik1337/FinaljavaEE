package com.javaeefinal.itse1908r.javaeefinal.RepositoryImpl;

import com.javaeefinal.itse1908r.javaeefinal.EntityManager;
import com.javaeefinal.itse1908r.javaeefinal.Models.Institution;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.InstitutionRepository;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class InstitutionRepositoryImpl implements InstitutionRepository {
    @Inject
    EntityManager em;


    @Override
    public List<Institution> findAll() {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT i FROM Institution i");
            List<Institution> result = query.getResultList();
            return result;
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Institution findByName(String name) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT i FROM Institution i WHERE i.name = '" + name + "'");
            Institution institution = (Institution) query.getSingleResult();
            return institution;
        } catch (NoResultException e){
            return null;
        }

    }

    @Override
    public Institution findById(int id) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Query query = entityManager.createQuery("SELECT i FROM Institution i WHERE i.id = " + id);
            Institution institution = (Institution) query.getSingleResult();
            return institution;
        } catch (NoResultException e){
            return null;
        }

    }

    @Override
    public Institution updateNumberById(int id, String newNumber) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Institution institution = entityManager.find(Institution.class, id);
            institution.setPhoneNumber(newNumber);
            entityManager.persist(institution);
            return institution;
        } catch (NoResultException e){
            return null;
        }

    }

    @Override
    public Institution updateAddressById(int id, String newAddress) {
        javax.persistence.EntityManager entityManager = em.manager();
        try {
            Institution institution = entityManager.find(Institution.class, id);
            institution.setAddress(newAddress);
            entityManager.persist(institution);
        } catch (NoResultException e){
            return null;
        }
        return new Institution();
    }
}
