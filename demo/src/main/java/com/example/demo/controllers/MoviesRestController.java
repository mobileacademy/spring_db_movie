package com.example.demo.controllers;

import com.example.demo.models.Movies;
import com.example.demo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviesRestController {

    @Autowired
    MovieRepository movieRepository;
    //view all moviies on the platform

    //get movies list --> asdasd
    @GetMapping()
    public List<Movies> getMoviesList(){
        return (List<Movies>) movieRepository.findAll();
    }
}
