package com.example.demo.repository;

import com.example.demo.model.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Integer> {

    @Query("select c from CountryEntity c join c.cities w where w.population > 100")
    List<CountryEntity> findAllByCountryPopulation();
}
