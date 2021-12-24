package com.javaeefinal.itse1908r.javaeefinal.Services;

import com.javaeefinal.itse1908r.javaeefinal.Models.Category;
import com.javaeefinal.itse1908r.javaeefinal.Models.Role;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.CategoryRepository;
import com.javaeefinal.itse1908r.javaeefinal.Repositories.RoleRepository;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.List;

@Stateful
@RunWith(JUnit4.class)
public class CategoryService {
    @Inject
    CategoryRepository categoryRepository;

    //    @Test
    public List<Category> getAllCategories() {return categoryRepository.findAll()}

    //    @Test
    public Category getCategoryById(int id) {return categoryRepository.findById();}
}
