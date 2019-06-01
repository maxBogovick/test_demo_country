package com.example.demo.service;

import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface StreetService {
    void createOrUpdate(StreetEntity streetEntity);
    Collection<StreetEntity> findAll();
    StreetEntity findById(int id);
    void remove (int streetEntity);
    Collection<StreetEntity> getAllByFilter2(int first, int second);
    void delete(int id);

    void delete(StreetEntity streetEntity);

    Collection<StreetEntity> findAllByHouseBetweenAndCityIdIsNotNull(int first, int second);
}
