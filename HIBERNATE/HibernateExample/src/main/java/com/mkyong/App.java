package com.mkyong;

import com.mkyong.user.DBUser;
import com.mkyong.user.UserDAO;
import com.mkyong.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("Maven + Hibernate + Oracle");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        UserDAO userDAO = new UserDAO(sessionFactory);

        // CREATE
        DBUser user = new DBUser();
        user.setUserId(101);
        user.setUsername("cristian");
        user.setCreatedBy("system");
        user.setCreatedDate(new Date());
        userDAO.save(user);

        // READ
        DBUser dbUser = userDAO.findById(1);
        System.out.println("READ: " + dbUser.getUsername());

        // UPDATE
        dbUser.setUsername("updated_name");
        userDAO.update(dbUser);

        // LIST
        List<DBUser> users = userDAO.findAll();
        System.out.println("ALL USERS:");
        users.forEach(u -> System.out.println(u.getUserId() + ": " + u.getUsername()));

        // DELETE
        userDAO.delete(dbUser);

        sessionFactory.close();
    }
}