package com.codegym.casestudy.service.Blog;

import com.codegym.casestudy.model.Blog;
import com.codegym.casestudy.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findBlogById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.delete(id);
    }
}
