package cn.jdwa.controller;

import cn.jdwa.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by czz on 2019/9/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString ... ... ... ...");
        User user = new User();
        user.setUsername("czz");
        user.setPassword("123456");
        user.setAge(30);
        model.addAttribute("user",user);
        return "success";
    }
}
