package com.Springjpa.learnjpamapping.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {

    @Id
    private int laptopid;
    private String modelname;
    private String brand;


}
