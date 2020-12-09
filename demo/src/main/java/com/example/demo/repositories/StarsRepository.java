package com.example.demo.repositories;

import com.example.demo.models.Stars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarsRepository extends CrudRepository<Stars, Long> {

}
