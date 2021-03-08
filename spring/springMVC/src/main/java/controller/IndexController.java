package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
        @RequestMapping("/login")
        public String login() {
           // return "login"; // 跳转到/WEB-INF/jsp下的login.jsp
            return "forward:/index/register";
        }
        @RequestMapping("/register")
        public String register() {
            return "redirect:/user/login";
        }
}
