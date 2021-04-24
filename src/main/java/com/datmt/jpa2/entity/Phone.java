package com.datmt.jpa2.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "PHONE")
@Entity
@Data
public class Phone {
    @Column(name = "PHONE_ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private Float price;
    private Float screenSize;
    private Float weight;
}