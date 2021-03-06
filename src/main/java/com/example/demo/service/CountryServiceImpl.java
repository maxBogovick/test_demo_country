package com.example.demo.service;

import com.example.demo.dao.CountryDao;
import com.example.demo.dao.GenericDao;
import com.example.demo.model.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    @Qualifier("countryDao")
    private GenericDao<CountryEntity, Integer> countryDao;
    //the same - polim
    /*@Autowired
    private CountryDao countryDao;*/


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void createOrUpdate(CountryEntity countryEntity) {
        countryDao.save(countryEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<CountryEntity> findAll() {

        return countryDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CountryEntity findById(int id) {
        Optional<CountryEntity> country = countryDao.findById(id);
        country = countryDao.findById(id);
      CountryEntity entity = country.get();
        entity.setName("new Name");
        //countryDao.save(country);
        //return country.isPresent() ? country.get() : null;
        //return country.orElseThrow(throw new IllegalArgumentException("country not found by id"));
        return country.orElse(new CountryEntity());
    }

    @Override
    @Transactional
    public void remove(int id) {
        CountryEntity countryEntity = findById(id);
        countryDao.delete(countryEntity);
    }


}
