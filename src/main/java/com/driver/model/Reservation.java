package com.driver.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int numberOfHours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }


    @ManyToOne
    @JoinColumn
    Spot spot;

    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Payment payment;

}
