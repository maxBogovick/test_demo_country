package com.example.demo.repository;

import com.example.demo.model.StreetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StreetRepository extends CrudRepository<StreetEntity,Integer> {
        Optional<StreetEntity> findByHouse(Integer number);
        }

