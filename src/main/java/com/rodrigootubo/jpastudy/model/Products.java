package com.rodrigootubo.jpastudy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "products")
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "products", fetch = FetchType.EAGER)
    private List<Customer> customers;

    public Products(String name, Double price, Company company, List<Customer> customers) {
        this.name = name;
        this.price = price;
        this.company = company;
        customers.forEach(customer -> customer.setProducts(this));
        this.customers = customers;
    }
}


