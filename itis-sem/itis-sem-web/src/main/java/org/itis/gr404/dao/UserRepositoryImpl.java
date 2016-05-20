package org.itis.gr404.dao;

import org.hibernate.SessionFactory;
import org.itis.gr404.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void createUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Transactional
    public User getUser(Integer id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Transactional
    public List<User> getUsers() {
        List<User> users = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).list();
        return users;
    }

    @Transactional
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Transactional
    public void dropUser(Integer id) {
        User user = getUser(id);
        sessionFactory.getCurrentSession().delete(user);
    }
}
