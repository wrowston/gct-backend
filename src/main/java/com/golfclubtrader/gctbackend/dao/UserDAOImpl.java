package com.golfclubtrader.gctbackend.dao;

import com.golfclubtrader.gctbackend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAll() {
        Query theQuery= (Query) entityManager.createQuery("from User");
        List<User> users = theQuery.getResultList();

        return users;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User save(User object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
