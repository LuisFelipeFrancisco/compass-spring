package com.compass.course.services;

import com.compass.course.entities.Category;
import com.compass.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public List<Category> findAll() {
        return repo.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repo.findById(id);
        return obj.get();
    }

}
