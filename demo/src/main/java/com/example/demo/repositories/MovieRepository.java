package com.example.demo.repositories;

import com.example.demo.models.Movies;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface MovieRepository extends CrudRepository<Movies, Long> {

    @Query("select * from Movies where year between :min and :max")
    public Set<Movies> selectMoviesByYear(@Param("year") int min, @Param("year")  int max) ;

}
