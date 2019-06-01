package com.example.demo.service;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import org.springframework.beans.factory.annotation.Autowired;

public interface TravelFacade {

    void createFullInfo(CountryEntity country, CityEntity city, StreetEntity street);

}