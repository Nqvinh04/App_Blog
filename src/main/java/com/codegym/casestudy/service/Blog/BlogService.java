package com.codegym.casestudy.service.Blog;

import com.codegym.casestudy.model.Blog;

public interface BlogService {
    Iterable<Blog> findAll();

    Blog findBlogById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
