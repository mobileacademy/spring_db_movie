package com.example.demo.repositories;

import com.example.demo.models.Movies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movies, Long> {
}
