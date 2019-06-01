package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.dao.GenericDao;
import com.example.demo.dao.StreetDao;
import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TravelFacadeImpl implements TravelFacade {
    @Autowired
    private StreetService streetService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private CityService cityService;

    @Override
    @Transactional
    public void createFullInfo(CountryEntity country, CityEntity city, StreetEntity street) {
        countryService.createOrUpdate(country);
        cityService.createOrUpdate(city);
        street.setCity(city);
        //streetService.createOrUpdate(street);


    }
}









