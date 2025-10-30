package com.Springjpa.learnjpamapping.Entities;

import jakarta.persistence.*;

@Entity

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private AadharCard aadharCard;

    // getters and setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public AadharCard getAadharCard() { return aadharCard; }
    public void setAadharCard(AadharCard aadharCard) {
        this.aadharCard = aadharCard;
        if (aadharCard != null) {
            aadharCard.setPerson(this);
        }
    }
}
