package com.example.demo.service;

import com.example.demo.model.CityEntity;

import java.util.Collection;
import java.util.Collections;

public interface CityService {
    void createOrUpdate (CityEntity cityEntity);
    Collection<CityEntity> findAll();
    CityEntity findById(int id);
}
