package com.webapp.user.dao;

import com.webapp.user.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface UserDao extends CrudRepository<User, Integer> {
    List<User> findAll();
    User findById(int id);
}
