package org.itis.gr404.dao;

import org.hibernate.SessionFactory;
import org.itis.gr404.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private SessionFactory sessionFactory;

    public void createUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public User getUser(Integer id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }

    public List<User> getUsers() {
        List<User> users = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).list();
        return users;
    }

    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    public void dropUser(Integer id) {
        User user = getUser(id);
        sessionFactory.getCurrentSession().delete(user);
    }
}
