package com.si56baqi.mapper;

import com.si56baqi.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    //调用xml方式
    String find="select * from user";
    @Select(find)
    public List<User> find();
    //调用注解方式
    @Select("select * from user where id=#{id}")
    public User get(@Param("id") Integer id);

    //新增用户
    @Insert("insert into user (name,birthday,address)"
            + " values(#{name},#{birthday},#{address})")
    public void insert(User user);

    //修改用户信息
    @Update("update user"
            + " set name=#{name},birthday=#{birthday},address=#{address}"
            + " where id=#{id}")
    public void update(User user);

    //删除某个用户
    @Delete("delete from user where id = #{id}")
    public void delete(Integer id);


}
