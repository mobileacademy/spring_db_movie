package com.example.demo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Genres {
    @Id
    private Long id;
    private String name;

    public Genres(){}

    public Genres(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
