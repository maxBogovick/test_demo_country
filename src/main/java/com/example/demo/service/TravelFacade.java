package com.example.demo.service;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;

public interface TravelFacade {
    void createFullInfo(CountryEntity country, CityEntity city, StreetEntity street);
    public void save(CityEntity city);
    public void save(CountryEntity country);
    public void save(StreetEntity street);

}
