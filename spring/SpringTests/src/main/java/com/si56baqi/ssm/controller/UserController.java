package com.si56baqi.ssm.controller;

import com.si56baqi.ssm.entity.MyUser;
import com.si56baqi.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /*private UserDao userService;*/
    @RequestMapping("/select")
    public String select(MyUser user, Model model){
        List<MyUser> list=userService.selectUserByUname(user);
        model.addAttribute("userlist",list);
        return "userList";
    }
}
