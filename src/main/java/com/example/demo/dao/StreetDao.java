package com.example.demo.dao;

import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;

import java.util.Collection;
import java.util.Optional;

public interface StreetDao {

    void save(StreetEntity street);

    Collection<StreetEntity> findAll();

    Optional<StreetEntity> findById(int id);

}
