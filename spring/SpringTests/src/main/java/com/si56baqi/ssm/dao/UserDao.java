package com.si56baqi.ssm.dao;

import com.si56baqi.ssm.entity.MyUser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userDao")
public interface UserDao {
    public List<MyUser> selectUserByUname(MyUser user);
}
