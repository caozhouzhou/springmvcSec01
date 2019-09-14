package cn.jdwa.controller;

import cn.jdwa.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    /**
     * 原生API实现转发
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid... ... ... ...");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //加return为了结束程序
        return;
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView ... ... ... ...");
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("zhh");
        user.setPassword("4321");
        user.setAge(30);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/testForWard")
    public String testForWard(){
        System.out.println("testForWard... ... ... ...");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("testRedirect... ... ... ...");
        return "redirect:../index.jsp";
    }

}
