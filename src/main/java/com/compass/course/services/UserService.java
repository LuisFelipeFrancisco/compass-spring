package com.compass.course.services;

import com.compass.course.entities.User;
import com.compass.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repo.findById(id);
        return obj.get();
    }

}
