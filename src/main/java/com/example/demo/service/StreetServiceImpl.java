package com.example.demo.service;

import com.example.demo.dao.StreetDao;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import com.example.demo.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
public class StreetServiceImpl  {
    @Autowired
//private StreetDao streetDao;
// my changes
    private StreetRepository streetCrudRepository;


    @Transactional
    public void testStreetCrudRepository(Integer id) {
//        Optional<StreetEntity> street = streetCrudRepository.findById(id);
//        street.ifPresent(item -> System.out.println(item));
        Optional<StreetEntity> streetOptional = streetCrudRepository.findById(id);
    }
}

//    @Override
//    @Transactional
//    public void createOrUpdate(StreetEntity streetEntity) {
//      streetDao.save(streetEntity);
//    }
//
//    @Override
//    @Transactional
//    public Collection<StreetEntity> findAll() {
//        return streetDao.findAll();
//    }
//
//    @Override
//    public StreetEntity findById(int id) {
//        Optional<StreetEntity> street =streetDao.findById(id);
//        return street.orElse(new StreetEntity());
//    }
//
//    @Override
//    @Transactional
//    public void remove (int id)
//    {
//        StreetEntity streetEntity =findById(id);
//        streetDao.delete(streetEntity);
//    }
//}
