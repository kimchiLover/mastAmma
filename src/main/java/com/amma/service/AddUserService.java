package com.amma.service;

import com.amma.UserDetails;
import com.amma.UserDetailsDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AddUserService {
    public void add(String uname, String pswd) {

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        UserDetailsDao dao = (UserDetailsDao) factory.getBean("d");

        UserDetails e = new UserDetails(uname, pswd);
        dao.saveuser(e);
    }
}