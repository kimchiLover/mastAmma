package com.amma.controller;

import com.amma.UserDetails;
import com.amma.service.AddUserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class SignUpController {

    @RequestMapping("/signup")
    public ModelAndView add(HttpSession session, @RequestParam("uname") String i, @RequestParam("pswd") String j)
    {
        UserDetails user = new UserDetails(i,j);
        AddUserService au = new AddUserService();
        au.add(i,j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("validSignUp.jsp");
        mv.addObject("result","New User Created.");

        return mv;
    }

}
