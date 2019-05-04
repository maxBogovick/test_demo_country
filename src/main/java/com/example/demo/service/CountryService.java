package com.example.demo.service;

        import com.example.demo.model.CountryEntity;

        import java.util.Collection;

public interface CountryService {
    void createOrUpdate(CountryEntity countryEntity);
    Collection<CountryEntity> findAll();
    CountryEntity findById(int id);
}
