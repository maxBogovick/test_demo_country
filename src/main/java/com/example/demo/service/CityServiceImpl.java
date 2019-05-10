package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.model.CityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    @Transactional
    public void createOrUpdate(CityEntity cityEntity) {
        cityDao.save(cityEntity);

    }

    @Override
    @Transactional()
    public Collection<CityEntity> findAll() {
        return cityDao.findAll();
    }

    @Override
    @Transactional
    public CityEntity findById(int id) {
        Optional<CityEntity> city = cityDao.findById(id);
        System.out.println(city.get().getCountry());
        return city.orElse(new CityEntity());
    }

    @Override
    @Transactional
    public void  remove( int id) {
        final CityEntity cityEntity = cityDao.findById(id).get();
        cityDao.delete(cityEntity);
    }
}
