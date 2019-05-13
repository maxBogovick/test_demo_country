package com.example.demo.dao;

import com.example.demo.model.CountryEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;

@Repository
@Qualifier("countryDao")// bean
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
        /*Collection<CountryEntity> countryEntities = entityManager.
            createQuery("select c from CountryEntity c").getResultList();*/

//        Collection<CountryEntity> countryEntities = entityManager
//                .createNativeQuery("SELECT ID as ID," +
//                                " COUNTRY_NAME as COUNTRY_NAME," +
//                                " MOTHER_TONGUE as MOTHER_TONGUE," +
//                                " currency as CURRENCY," +
//                                " SQUARE as SQUARE," +
//                                " CITY as CITY," +
//                                " POPULATION, DESCRIPTION "+
//                                " FROM COUNTRIES",
//
//                        CountryEntity.class).getResultList();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<CountryEntity> query = cb.createQuery(CountryEntity.class);
        Root<CountryEntity> root = query.from(CountryEntity.class);
        query.select(root);

        List<CountryEntity> countryList = entityManager.createQuery(query).getResultList();
        for (CountryEntity country : countryList) {
            System.out.println(country.getName());

        /*if (CollectionUtils.isEmpty(countryEntities)) return Collections.emptyList();
        return countryEntities;*/

        }
        return countryList.size() == 0 ? Collections.emptyList() : countryList;
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
