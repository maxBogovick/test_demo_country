package com.example.demo.service;

import com.example.demo.model.StreetEntity;
import com.example.demo.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
public class StreetServiceImpl implements StreetService {
    @Autowired
    private StreetRepository streetCrudRepository;

    @Transactional
    public void testStreetCrudRepository(Integer id) {
        Optional<StreetEntity> street = streetCrudRepository.findById(id);
        street.ifPresent(item -> System.out.println(item));
        //     Optional<StreetEntity> streetOptional = streetCrudRepository.findById(id);
    }

    @Transactional
    public void findByHouse(Integer number) {
        Optional<StreetEntity> streetOptional =
                streetCrudRepository.findByHouse(number);
    }

   /* @Override
    public List<StreetEntity> getHouseMaxNumber() {
        return entityManager.createNativeQuery
                ("SELECT ID as ID," +
                        "HOUSE as HOUSE," +
                        "CITY_ID as CITY_ID," +
                        "STREET_NAME as STREET_NAME "+
                        "FROM STREET "+
                        "WHERE HOUSE BETWEEN 20 AND 80", StreetEntity.class).getResultList();
    }*/


    @Override
    @Transactional
    public void createOrUpdate(StreetEntity streetEntity) {
        streetCrudRepository.save(streetEntity);
    }

    @Override
    @Transactional
    public Collection<StreetEntity> findAll() {
        return streetCrudRepository.findAll();
    }

    @Override
    public StreetEntity findById(int id) {
        Optional<StreetEntity> street = streetCrudRepository.findById(id);
        return street.orElse(new StreetEntity());
    }

    @Override
    @Transactional
    public void remove(int id) {
        StreetEntity streetEntity = findById(id);
        streetCrudRepository.delete(streetEntity);
    }

    @Override
    public Collection<StreetEntity> getAllByFilter2(int first, int second) {
        return streetCrudRepository.getAllByFilter2(first, second);
    }

    @Override
    @Transactional
    public void delete(int id) {
        streetCrudRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void delete(StreetEntity streetEntity) {
        final StreetEntity streetEntity1 = streetCrudRepository.findById(streetEntity.getId()).get();
        streetCrudRepository.delete(streetEntity1);
    }

    @Override
    public Collection<StreetEntity> findAllByHouseBetweenAndCityIdIsNotNull(int first, int second) {
        return streetCrudRepository.findAllByHouseBetweenAndCityIdIsNotNull(first,second);
    }


}
//}
