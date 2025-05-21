package com.mkyong.user;

import com.mkyong.impl.GenericDAOImpl;
import com.mkyong.service.GenericDAO;
import com.mkyong.user.DBUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO extends GenericDAOImpl<DBUser, Integer> implements GenericDAO<DBUser, Integer> {

    public UserDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    //  Metoda personalizata: cauta un user dupa nume
    public DBUser findByUsername(String username) {
        Session session = sessionFactory.openSession();
        DBUser user = (DBUser) session.createQuery("FROM User WHERE username = :username")
                .setParameter("username", username)
                .uniqueResult();
        session.close();
        return user;
    }
}
