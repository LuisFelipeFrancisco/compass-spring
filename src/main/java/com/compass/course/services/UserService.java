package com.compass.course.services;

import com.compass.course.entities.User;
import com.compass.course.repositories.UserRepository;
import com.compass.course.services.exceptions.DatabaseException;
import com.compass.course.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

    public User findById(Long id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repo.save(obj);
    }

    public void delete(Long id) {
        try {
            if (!repo.existsById(id)) throw new ResourceNotFoundException(id);
            repo.deleteById(id);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        try {
            User entity = repo.getReferenceById(id);
            updateData(entity, obj);
            return repo.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(@NotNull User entity, @NotNull User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
