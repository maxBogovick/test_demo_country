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

@Service
public class TravelFacadeImpl implements TravelFacade {
    @Autowired
    @Qualifier("countryDao")
    private GenericDao<CountryEntity, Integer> countryDao;
    @Autowired
    @Qualifier("cityDao")
    private CityDao cityDao;

    @Autowired
    @Qualifier("streetDao")
    private StreetDao streetDao;


    @Override
    public void createFullInfo(CountryEntity country, CityEntity city, StreetEntity street) {

    }

    @Override
    public void save(CityEntity city) {
    cityDao.save(city);
    }

    @Override
    public void save(CountryEntity country) {
    countryDao.save(country);
    }

    @Override
    public void save(StreetEntity street) {
    streetDao.save(street);
    }


}


    // @Override
  //  public void createFullInfo(CountryEntity country, CityEntity city, StreetEntity street) {
        //cityService.createOrUpdate(city);
        //save country
        //save street
        //save city



