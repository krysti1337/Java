package com.mkyong.impl;

import com.mkyong.service.GenericDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    private final Class<T> persistentClass;
    protected SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public GenericDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.persistentClass = (Class<T>) ((ParameterizedType)
                getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public void save(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(entity);
        tx.commit();
        session.close();
    }

    @Override
    public void update(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
        session.close();
    }

    @Override
    public void delete(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(ID id) {
        Session session = sessionFactory.openSession();
        T entity = (T) session.get(persistentClass, id);
        session.close();
        return entity;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        Session session = sessionFactory.openSession();
        List<T> list = session.createQuery("FROM " + persistentClass.getSimpleName()).list();
        session.close();
        return list;
    }
}
