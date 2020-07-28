package com.golfclubtrader.gctbackend.dao;

import com.golfclubtrader.gctbackend.models.User;

import java.util.Set;

public interface UserDAO {
    Set<User> findAll();

    User findById(Long id);

    User save(User object);

    void deleteById(Long id);
}
