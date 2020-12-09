package com.example.demo.controllers;

import com.example.demo.models.Movies;
import com.example.demo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/movies")
public class MoviesRestController {

    @Autowired
    MovieRepository movieRepository;
    //view all moviies on the platform

    @GetMapping()
    public List<Movies> getMoviesList(){
        return (List<Movies>) movieRepository.findAll();
    }

    @GetMapping("/byYear")
    public Set<Movies> getMoviesByYear (@PathParam("minYear") int minYear, @PathParam("maxYear") int maxYear) {
        return movieRepository.selectMoviesByYear(minYear, maxYear);
    }
}
