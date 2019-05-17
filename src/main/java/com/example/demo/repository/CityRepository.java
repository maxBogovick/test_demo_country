package com.example.demo.repository;

import com.example.demo.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

    @Query("select c from CityEntity c where c.country.id is not null")
    Collection<CityEntity> findCitiesWithCountry();


}
