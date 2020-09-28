package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface  BlogRepository extends PagingAndSortingRepository<Blog, Long> {
}
