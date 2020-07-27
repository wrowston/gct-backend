package com.golfclubtrader.gctbackend.services.map;

import com.golfclubtrader.gctbackend.models.User;
import com.golfclubtrader.gctbackend.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServcieMap extends AbstractMapService<User, Long> implements UserService {

    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User create() {
        return null;
    }

    @Override
    public User update(User user) {
        return super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
