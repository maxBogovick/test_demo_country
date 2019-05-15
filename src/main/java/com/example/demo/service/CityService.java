package com.example.demo.service;

import com.example.demo.model.CityEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;

public interface CityService {
    void createOrUpdate (CityEntity cityEntity);
    Collection<CityEntity> findAll();

    Collection<CityEntity> findCitiesWithCountry();

    CityEntity findById(int id);
    void remove (int cityEntity);
}
