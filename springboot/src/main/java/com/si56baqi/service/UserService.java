package com.si56baqi.service;

import com.si56baqi.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> find();
    public User get(Integer id);

    void update(User user);

    void delete(Integer id);

    void insert(User user);
}
