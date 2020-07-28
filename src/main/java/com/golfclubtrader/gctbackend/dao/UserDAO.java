package com.golfclubtrader.gctbackend.dao;

import com.golfclubtrader.gctbackend.models.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();

    User findById(Long id);

    User save(User object);

    void deleteById(Long id);
}
