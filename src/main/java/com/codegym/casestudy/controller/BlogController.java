package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Blog;
import com.codegym.casestudy.service.Blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blog")
    public ModelAndView listBlog(){
        Iterable<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/blog/create")
    public ModelAndView showCreateBlog(){
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blogs", new Blog());
        return modelAndView;
    }

    @PostMapping("/blog/create")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blogs", new Blog());
        return modelAndView;
    }

    @GetMapping("blog/edit/{id}")
    public ModelAndView showEditBlog(@PathVariable Long id){
        Blog blog = blogService.findBlogById(id);
        ModelAndView modelAndView = new ModelAndView("blog/update");
        modelAndView.addObject("blogs", blog);
        return modelAndView;
    }

    @PostMapping("/blog/edit")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/update");
        modelAndView.addObject("blogs", new Blog());
        return modelAndView;
    }

    @GetMapping("/blog/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blog blog = blogService.findBlogById(id);
            ModelAndView modelAndView = new ModelAndView("blog/delete");
            modelAndView.addObject("blogs", blog);
            return modelAndView;
    }


    @PostMapping("/blog/delete")
    public String deleteCustomer(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:blog";
    }
}
