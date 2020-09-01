package com.si56baqi.sso.service.impl;

import com.si56baqi.common.service.RedisService;
import com.si56baqi.common.vo.SysResult;
import com.si56baqi.sso.mapper.UserMapper;
import com.si56baqi.sso.pojo.User;
import com.si56baqi.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisService redisService;
    @Override
    public SysResult check(String param, Integer type) {
        return null;
    }

    @Override
    public boolean register(User user) {
        return false;
    }

    @Override
    public String login(String userName, String passwd) {
        return null;
    }

    @Override
    public String queryUserByTicket(String ticket) {
        return null;
    }
}
