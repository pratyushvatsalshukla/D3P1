package com.stackroute.service;

import com.stackroute.domain.Blog;

import com.stackroute.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */

public class BlogServiceImpl implements BlogService {
    private BlogRepository blogRepository;

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
    	return blogRepository.save(blog) ;
    }

    /**
     * retrieve all blogs
     */
    public List<Blog> getAllBlogs() {
    	return  blogRepository.findAll() ;
    }

    /**
     * retrieve blog by id
     */
    public List<Blog> getBlog(int id) {
    	return  blogRepository.findById(id).get() ;
    }

    /**
     * delete blog by id
     */
	public void deleteBlog(Long id) {
		try {
			
			blogRepository.deleteById(id);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

    /**
     * update blog
     */
	public Blog updateBlog(Blog blog, Long id) {
		try {

			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			return department ; 
		}
	}
}

