package com.example.demo.dao;

import com.example.demo.model.CityEntity;

import java.util.Collection;
import java.util.Optional;

public class CityExtDao implements CityDao {

    @Override
    public void save(CityEntity entity) {

    }

    @Override
    public Collection<CityEntity> findAll() {
        return null;
    }

    @Override
    public Optional<CityEntity> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(CityEntity entity) {

    }
}
