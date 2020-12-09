package com.example.demo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity

public class Stars {
    @Id
    private Long id;
    private String name;
    private String about;


}
