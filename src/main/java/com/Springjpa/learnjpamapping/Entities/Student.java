package com.Springjpa.learnjpamapping.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_student")
public class Student {
    @Id

    private  int studentid;
    private  String studentName;
    private String about;

    @OneToOne
    private Laptop laptop;
}
