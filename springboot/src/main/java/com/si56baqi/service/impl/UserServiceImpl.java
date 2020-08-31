package com.si56baqi.service.impl;

import com.si56baqi.mapper.UserMapper;
import com.si56baqi.pojo.User;
import com.si56baqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> find() {
        return userMapper.find();
    }

    @Override
    public User get(Integer id) {
        return userMapper.get(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
