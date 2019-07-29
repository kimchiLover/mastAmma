package com.amma;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UserDetailsDao
{
    HibernateTemplate template;

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    //method to save user
    public void saveuser(UserDetails e){
        template.save(e);
    }

    //method to find user
    public UserDetails finduser(UserDetails e){
        List<UserDetails> list= new ArrayList<UserDetails>();
        list = template.loadAll(UserDetails.class);

        //ListIterator<UserDetails> listItr = list.listIterator();

        for(UserDetails l : list) {
            if( e.equals(l) )
                return l;
        }

        return null;
    }

    //method to update user
    public void updateuser(UserDetails e){
        template.update(e);
    }

    //method to delete user
    public void deleteuser(UserDetails e){
        template.delete(e);
    }

    //method to return one employee of given id
    public UserDetails getById(int id){
        UserDetails e=(UserDetails) template.get(UserDetails.class,id);
        return e;
    }
    //method to return all employees
    public List<UserDetails> getuser(){
        List<UserDetails> list=new ArrayList<UserDetails>();
        return template.loadAll(UserDetails.class);
    }
}