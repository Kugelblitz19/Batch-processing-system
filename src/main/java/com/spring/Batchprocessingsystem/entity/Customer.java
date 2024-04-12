package com.spring.Batchprocessingsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "customer_Info")
public class Customer {
    @Id
    @Column(name = "Customer_Id")
    private int index;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "Company")
    private String company;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;
    @Column(name = "primaryPhone")
    private Long phone1;
    @Column(name = "Alternate Number")
    private Long phone2;
    @Column(name = "Email")
    private String email;
    @Column(name = "Subscription_Date")
    private Date subscriptionDate;
    @Column(name = "Website")
    private String website;

}
