package com.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ordernumber")
    private int orderNumber;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "personid")
    private Person person;
}
