package com.example.demo.repository;

import com.example.demo.model.StreetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends CrudRepository<StreetEntity,Integer> {
}
