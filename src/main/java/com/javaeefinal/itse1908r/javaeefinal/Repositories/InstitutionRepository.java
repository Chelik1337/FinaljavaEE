package com.javaeefinal.itse1908r.javaeefinal.Repositories;

import com.javaeefinal.itse1908r.javaeefinal.Models.Institution;
import com.javaeefinal.itse1908r.javaeefinal.Models.Role;

import java.util.List;

public interface InstitutionRepository {
    List<Institution> findAll();
    Institution findByName(String name);
    Institution findById(int id);
    Institution updateNumberById(int id, String newNumber);
    Institution updateAddressById(int id, String newAddress);

}
