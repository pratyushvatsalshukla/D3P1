package com.stackroute.service;

import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service

public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;

    /**
     * Constructor based Dependency injection to inject BlogRepository here
     */
    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    /**
     * save a new blog
     */

    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        List<Blog> blogs = (List<Blog>) blogRepository.findAll();
        return blogs;
    }

    @Override
    public Blog getBlogById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Blog deleteBlog(int id) {
        Blog delBlog = blogRepository.findById(id).get();
        blogRepository.deleteById(id);
        return delBlog;
    }

    @Override
    public Blog updateBlog(Blog blog) {

        return null;
    }


    /**
     * retrieve all blogs
     */


    /**
     * retrieve blog by id
     */

    /**
     * delete blog by id
     */

    /**
     * update blog
     */
}

