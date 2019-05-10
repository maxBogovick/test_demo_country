package com.example.demo.dao;

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
public class CountryDaoImpl implements CountryDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(CountryEntity country) {
        if (Objects.isNull(country)) throw new IllegalArgumentException("Country must be a set");
        if (Objects.isNull(country.getId())) {
            entityManager.persist(country);
        } else {
            entityManager.merge(country);
        }
    }

    @Override
    public Collection<CountryEntity> findAll() {
        //HQL
        Collection<CountryEntity> countryEntities = entityManager.
            createQuery("select c from CountryEntity c").getResultList();

        //Collection<CountryEntity> countryEntities = entityManager.createNativeQuery("SELECT * FROM COUNTRIES").getResultList();
        /*if (CollectionUtils.isEmpty(countryEntities)) return Collections.emptyList();
        return countryEntities;*/
        return CollectionUtils.isEmpty(countryEntities) ? Collections.emptyList() : countryEntities;
    }

    @Override
    public Optional<CountryEntity> findById(Integer id) {
        final CountryEntity countryEntity = entityManager.find(CountryEntity.class, id);
        //entityManager.detach(countryEntity);
        if (Objects.isNull(countryEntity)) throw new RuntimeException("country not found");
        return Optional.ofNullable(countryEntity);
    }

    @Override
    public void delete(final CountryEntity entity) {
        if (Objects.isNull(entity))throw new IllegalArgumentException("entity must be set");
    entityManager.remove(entity);
    }
}
