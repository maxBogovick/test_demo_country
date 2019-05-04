package com.example.demo.service;

import com.example.demo.dao.StreetDao;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
public class StreetServiceImpl implements StreetService{
@Autowired
private StreetDao streetDao;

    @Override
    @Transactional
    public void createOrUpdate(StreetEntity streetEntity) {
      streetDao.save(streetEntity);
    }

    @Override
    @Transactional
    public Collection<StreetEntity> findAll() {
        return streetDao.findAll();
    }

    @Override
    public StreetEntity findById(int id) {
        Optional<StreetEntity> street =streetDao.findById(id);
        return street.orElse(new StreetEntity());
    }
}
