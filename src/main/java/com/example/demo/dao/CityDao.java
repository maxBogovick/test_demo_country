package com.example.demo.dao;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;

import java.util.Collection;
import java.util.Optional;

public interface CityDao {
    void save(CityEntity city);
        Collection<CityEntity> finAll();
    Optional<CityEntity> findById(int id);
}
