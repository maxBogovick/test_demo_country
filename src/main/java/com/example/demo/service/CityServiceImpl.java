package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.dao.GenericDao;
import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    @Qualifier("cityDao")
    private GenericDao cityDao;

    @Override
    @Transactional
    public void createOrUpdate(CityEntity cityEntity) {
        cityDao.save(cityEntity);

    }

    @Override
    @Transactional()
    public Collection<CityEntity> findAll() {


        Collection<CityEntity> cities=cityDao.findAll();
//        for(CityEntity item:cities){
//            item.getCountry();
//        }
        //cityDao.findAll().stream().forEach(CityEntity::getCountry);
        //cityDao.findAll().stream().forEach(item->item.getCountry());


     List<CityEntity> list= cities.stream().peek(item -> {
            if (Objects.nonNull(item.getCountry())) {
               item.getCountry().getName();
            }
        }).collect(Collectors.toList());
        System.out.println(list);

        return cities;
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
    public void remove(int id) {
        final CityEntity cityEntity = (CityEntity) cityDao.findById(id).get();
        cityDao.delete(cityEntity);
    }
}
