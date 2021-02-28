package com.si56baqi.ssm.service;

import com.si56baqi.ssm.entity.MyUser;

import java.util.List;

public interface UserService {
    public List<MyUser> selectUserByUname(MyUser user);
}
