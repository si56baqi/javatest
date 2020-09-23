package com.si56baqi.sso.controller;

import com.si56baqi.common.vo.SysResult;
import com.si56baqi.sso.pojo.User;
import com.si56baqi.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 检测数据是否可用
     *
     * @param param 用户输入的参数
     * @param type type为类型，可选参数1、2、3分别代表username、phone、email
     * @return
     */
    @RequestMapping(value = "/check/{param}/{type}", method = RequestMethod.GET)
    @ResponseBody
    public SysResult check(@PathVariable("param") String param, @PathVariable("type") Integer type) {
        return userService.check(param, type);
    }

    /**
     * 用户注册
     *
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public SysResult register(User user) {
        boolean boo = userService.register(user);
        if (boo) {
            return SysResult.ok();
        }
        return SysResult.build(201, "注册失败!");
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public void find() {
        List<User> users = userService.find();
        System.out.println(users.size());
    }


}
