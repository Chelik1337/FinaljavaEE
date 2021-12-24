package com.javaeefinal.itse1908r.javaeefinal.Services;

import com.javaeefinal.itse1908r.javaeefinal.Models.Institution;
import com.javaeefinal.itse1908r.javaeefinal.Models.Role;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.InstitutionRepository;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.RoleRepository;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.List;

@Stateful
@RunWith(JUnit4.class)
public class InstitutionService {
    @Inject
    InstitutionRepository institutionRepository;

    //    @Test
    public List<Institution> getAllInstitutions() {return institutionRepository.findAll();}

    //    @Test
    public Institution getInstitutionByName(String name) {return institutionRepository.findByName(name);}

    //    @Test
    public Institution getInstitutionById(int id) {return institutionRepository.findById(id);}

    //    @Test
    public Institution updateAddressById(int id, String newAddress) {return institutionRepository.updateAddressById(id, newAddress);}

    //    @Test
    public Institution updateNumberById(int id, String newNumber) {return institutionRepository.updateNumberById(id, newNumber);}
}
