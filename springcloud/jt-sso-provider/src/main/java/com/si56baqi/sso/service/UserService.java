package com.si56baqi.sso.service;

import com.si56baqi.common.vo.SysResult;
import com.si56baqi.sso.pojo.User;

import java.util.List;

public interface UserService {
    public SysResult check(String param, Integer type);
    public boolean register(User user);
    public String login(String userName, String passwd);
    public String queryUserByTicket(String ticket);
    public List<User> find();

}
