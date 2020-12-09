package com.example.demo.repositories;

import com.example.demo.models.Movies;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface MovieRepository extends CrudRepository<Movies, Long> {

//    @Query("select * from movies where year between $min and $max")
//    public Set<Movies> selectMoviesByYear(@Param("min") int min, @Param("max")  int max) ;

    public List<Movies> findMoviesByYearBetween(int min , int max);

}
