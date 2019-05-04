package com.example.demo.dao;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

@Repository
public class CityDaoImp implements CityDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(CityEntity city) {
     if(Objects.isNull(city)) throw new IllegalArgumentException("Please set a city");
     if(Objects.isNull(city.getId())){
         entityManager.persist(city);
     }
     else{
         entityManager.merge(city);

     }
    }

    @Override
    public Collection<CityEntity> finAll() {
        //HQL
        Collection<CityEntity> cityEntities =
                entityManager.createQuery("select c from CityEntity c").getResultList();
        return CollectionUtils.isEmpty(cityEntities)? Collections.emptyList():cityEntities;
    }

    @Override
    public Optional<CityEntity> findById(int id) {
        final CityEntity cityEntity=
                entityManager.find(CityEntity.class,id);
        if(Objects.isNull(cityEntity)) throw  new RuntimeException("city not found");
        return Optional.ofNullable(cityEntity);
    }

}
