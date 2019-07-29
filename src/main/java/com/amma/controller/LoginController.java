package com.amma.controller;

import com.amma.UserDetails;
import com.amma.service.FindUserService;
import com.amma.service.AddUserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(HttpSession session, @RequestParam("uname") String i, @RequestParam("pswd") String j)
    {
        FindUserService fu = new FindUserService();
        UserDetails loggedUser =fu.find(i,j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("validLogin.jsp");

        if(loggedUser != null) {
            session.setAttribute("MEMBER", loggedUser);
            mv.addObject("result", i + " successfully logged in.");
        }
        else
            mv.addObject("result", "Invalid User Credentials.");

        return mv;
    }
}