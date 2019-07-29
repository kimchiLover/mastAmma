package com.amma.service;

import com.amma.UserDetails;
import com.amma.UserDetailsDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class FindUserService {
    public UserDetails find(String un,String up ) {

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        UserDetailsDao dao = (UserDetailsDao) factory.getBean("d");
        return dao.finduser(new UserDetails(un,up));
    }
}