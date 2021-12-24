package com.javaeefinal.itse1908r.javaeefinal.Repositories;

import com.javaeefinal.itse1908r.javaeefinal.Models.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    Category findById(int id);
}
