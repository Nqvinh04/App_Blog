package com.codegym.casestudy.service.Category;


import com.codegym.casestudy.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findBlogById(Long id);

    void save(Category category);

    void remove(Long id);
}
