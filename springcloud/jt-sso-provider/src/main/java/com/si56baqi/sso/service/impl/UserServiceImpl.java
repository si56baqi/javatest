package com.si56baqi.sso.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.si56baqi.common.service.RedisService;
import com.si56baqi.common.vo.SysResult;
import com.si56baqi.sso.mapper.UserMapper;
import com.si56baqi.sso.pojo.User;
import com.si56baqi.sso.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisService redisService;
    //把java对象转成json串，ObjectMapper
    private static final ObjectMapper mapper=new ObjectMapper();
    //根据type=1:username，2:phone，3:email
    private static final Map<Integer, String> PARAM_TYPE = new HashMap<Integer, String>();
    //初始化

    static {
        PARAM_TYPE.put(1, "username");
        PARAM_TYPE.put(2, "phone");
        PARAM_TYPE.put(3, "email");
    }

    @Override
    public SysResult check(String param, Integer type) {
        int i=userMapper.check(PARAM_TYPE.get(type), param);
        if(i==0) {
            return SysResult.ok("false");	//数据库没有，可用
        }else {
            return SysResult.build(201, "OK", "true");	//数据库值已经存在，不可用
        }
    }

    @Override
    public boolean register(User user) {
        //密码加密
        String newpassword = DigestUtils.md5Hex(user.getPassword());
        user.setPassword(newpassword);

        //判断，如果此用户已经存在，返回不能注册
        int i = userMapper.check(PARAM_TYPE.get(1), user.getUsername());
        if(i>0) {	//用户已经存在
            return false;
        }else {
            userMapper.save(user);
            return true;
        }
    }



    @Override
    public String login(String userName, String passwd) {
        return null;
    }

    @Override
    public String queryUserByTicket(String ticket) {
        return null;
    }

    @Override
    public List<User> find() {
        return  userMapper.find();
    }
}
