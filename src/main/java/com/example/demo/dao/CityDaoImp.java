package com.example.demo.dao;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

@Repository
@Qualifier("cityDao")
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
    public void delete(final CityEntity entity) {
        if (Objects.isNull(entity)) throw new IllegalArgumentException("entity must be a set");
        entityManager.remove(entity);
    }

    @Override
    public Collection<CityEntity> findAll() {

        Collection<CityEntity> cityEntities =
//                entityManager.createNativeQuery("SELECT ID as ID,"+
//                        "COUNTRY_ID as COUNTRY_ID,"+
//                        "NAME as NAME,"+
//                        "CITY_TYPE as CITY_TYPE,"+
//                        "FOUNDATION_DATE as FOUNDATION_DATE,"+
//                        "SQUARE as SQUARE,"+
//                        "CAPITAL as CAPITAL"+
//                        "POPULATION, DESCRIPTION"+
//                        "FROM CITY",
//                        CityEntity.class).getResultList();
        //HQL
                entityManager.createQuery("select c from CityEntity c").getResultList();

        return CollectionUtils.isEmpty(cityEntities) ? Collections.emptyList() : cityEntities;
    }

    @Override
    public Optional<CityEntity> findById(Integer id) {
        final CityEntity cityEntity=
                entityManager.find(CityEntity.class,id);
        if(Objects.isNull(cityEntity)) throw  new RuntimeException("city.not.found");
        return Optional.ofNullable(cityEntity);
    }

}
