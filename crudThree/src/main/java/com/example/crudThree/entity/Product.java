package com.example.crudThree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private  int id;
    private String name;
    private int quantiy;
    private double price;

}
