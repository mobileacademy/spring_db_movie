package com.example.demo.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int year;
    private String image_url;
    private Float imdb_rating;
    private String description;
    private int votes;
    @ManyToMany(targetEntity = Stars.class)
    Set<Stars> stars;
    @ManyToMany(targetEntity = Genres.class)
    Set<Genres> genres;

    public Movies(){}

    public Movies(Long id, String title, int year, Set<Stars> stars, Set<Genres> genres) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.stars = stars;
        this.genres = genres;
    }
}
