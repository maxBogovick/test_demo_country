package com.example.demo.dao;

import com.example.demo.model.CountryEntity;

import java.util.Collection;
import java.util.Optional;

public interface CountryDao {

    void save(CountryEntity country);

    Collection<CountryEntity> findAll();

    Optional<CountryEntity> findById(int id);
}
