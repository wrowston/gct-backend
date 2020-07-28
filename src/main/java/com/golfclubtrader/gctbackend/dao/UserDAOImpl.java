package com.golfclubtrader.gctbackend.dao;

import com.golfclubtrader.gctbackend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Set;

@Repository
public class UserDAOImpl implements UserDAO {

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Set<User> findAll() {
        Query theQuery= (Query) entityManager.createQuery("from User");
        Set<User> users = (Set<User>) theQuery.getResultList();

        return users;
    }

    @Override
    public User findById(Long id) {
        User user = entityManager.find(User.class, id);

        return user;
    }

    @Override
    public User save(User object) {
        User user = entityManager.merge(object);
        object.setId(user.getId());
        return object;
    }

    @Override
    public void deleteById(Long id) {
        Query theQuery = (Query) entityManager.createQuery("delete from User where id=:userId");
        theQuery.setParameter("userId", id);
        theQuery.executeUpdate();
    }
}
