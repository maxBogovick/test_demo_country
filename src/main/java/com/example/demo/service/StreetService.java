package com.example.demo.service;

import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;

import java.util.Collection;

public interface StreetService {
    void createOrUpdate(StreetEntity streetEntity);
    Collection<StreetEntity> findAll();
    StreetEntity findById(int id);
}
