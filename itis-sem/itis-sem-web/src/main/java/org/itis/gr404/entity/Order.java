package org.itis.gr404.entity;

import javax.persistence.*;

@Entity
@Table(name= "orders")
public class Order {

    public Order(){};

    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "PRODUCT")
    private String product;
    @Column(name = "PRICE")
    private int price;

    @ManyToOne
    @JoinColumn(name = "USER_ID",referencedColumnName = "USER_ID")
    private User user;

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {

        return id;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}