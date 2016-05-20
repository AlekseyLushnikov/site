package org.itis.gr404.dao;

import org.hibernate.SessionFactory;
import org.itis.gr404.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void createOrder(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Transactional
    public Order getOrder(Integer id) {
        return (Order) sessionFactory.getCurrentSession().get(Order.class, id);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Order> getOrders() {
        List<Order> orders = (List<Order>) sessionFactory.getCurrentSession().createCriteria(Order.class).list();
        return orders;
    }

    @Transactional
    public void updateOrder(Order order) {
        sessionFactory.getCurrentSession().update(order);
    }

    @Transactional
    public void dropOrder(Integer id) {
        Order order = getOrder(id);
        sessionFactory.getCurrentSession().delete(order);
    }
}
