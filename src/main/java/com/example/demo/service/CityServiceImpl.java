package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.model.CityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    @Transactional
    public Collection<CityEntity> findAll() {
        return cityDao.finAll();
    }

    @Override
    public CityEntity findById(int id) {
        Optional<CityEntity> city = cityDao.findById(id);
        return city.orElse(new CityEntity());
    }
}
