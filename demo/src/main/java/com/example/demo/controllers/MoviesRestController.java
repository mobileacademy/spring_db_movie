package com.example.demo.controllers;

import com.example.demo.Finals;
import com.example.demo.models.Genres;
import com.example.demo.models.Movies;
import com.example.demo.models.Stars;
import com.example.demo.repositories.GenresRepository;
import com.example.demo.repositories.MovieRepository;
import com.example.demo.repositories.StarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/movies")
public class MoviesRestController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    StarsRepository starsRepository;

    @Autowired
    GenresRepository genresRepository;
    //view all moviies on the platform

    Stars star = new Stars(1, Finals.STARS_RATING.oscar_wins.name(), "Movie star");
    Genres genre = new Genres(1L, Finals.GENRES_TYPE.comedy.name());

    //get movies list --> asdasd
    @GetMapping()
    public List<Movies> getMoviesList(){
        return (List<Movies>) movieRepository.findAll();
    }

    @GetMapping("/byYear")
    public List<Movies> getMoviesByYear (@PathParam("minYear") int minYear, @PathParam("maxYear") int maxYear) {
        //return movieRepository.selectMoviesByYear(minYear, maxYear);
        return movieRepository.findMoviesByYearBetween(minYear, maxYear);
    }

    @PostMapping("/addStar")
    public void addStar(){
        starsRepository.save(star);
    }

    @PostMapping("/addGenre")
    public void addGenre() {
        genresRepository.save(genre);
    }

    @PostMapping("/addMovie")
    public void addMovie() {
        List<Stars> starsList = new ArrayList<>();
        starsList.add(star);
        List<Genres> genresList = new ArrayList<>();
        genresList.add(genre);
        Movies movies = new Movies(1L,"Movie Title", 2020,  new HashSet<>(starsList), new HashSet<>(genresList));
        movieRepository.save(movies);
    }

}
