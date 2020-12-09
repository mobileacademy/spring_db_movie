package com.example.demo.repositories;

import com.example.demo.models.Genres;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends CrudRepository<Genres, Long> {

}
