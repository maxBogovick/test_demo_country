package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.dao.GenericDao;
import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.repository.CityRepository;
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
    /*@Autowired
    @Qualifier("cityDao")
    private CityDao cityDao;*/

// the same as 21-23
    @Autowired
    private CityRepository cityDao;

    @Override
    @Transactional
    public void createOrUpdate(CityEntity cityEntity) {
        cityDao.save(cityEntity);

    }

    @Override
    @Transactional()
    public Collection<CityEntity> findAll() {


        Collection<CityEntity> cities = cityDao.findAll();
        //     for(CityEntity item:cities){
//            item.getCountry();
//        }
        //cityDao.findAll().stream().forEach(CityEntity::getCountry);
        //cityDao.findAll().stream().forEach(item->item.getCountry());
        return cities;

    }

    @Override
    @Transactional
    public Collection<CityEntity> findCitiesWithCountry() {
        Collection<CityEntity> cities = cityDao.findCitiesWithCountry();
                //cityDao.findCitiesWithCountry();
        cities.forEach(item->item.getCountry().getName());
        /*List<CityEntity> list = cities.stream()
                .filter(item ->
                        Objects.nonNull(item.getCountry()) && Objects.nonNull(item.getCountry().getName()))
                .collect(Collectors.toList());*/

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
