package com.test.bu.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(fetch = FetchType.EAGER, targetEntity = Basket.class)
    private Basket basket;
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
    private User customer;
    private Timestamp time;
    private boolean status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }
}
