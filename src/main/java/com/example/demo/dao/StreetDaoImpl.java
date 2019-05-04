package com.example.demo.dao;

import com.example.demo.model.StreetEntity;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

@Repository
public class StreetDaoImpl implements StreetDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void save(StreetEntity street) {
if(Objects.isNull(street)) throw new IllegalArgumentException("Street must be set");
if(Objects.isNull(street.getId())){
    entityManager.persist(street);
}
else{entityManager.merge(street);
}
    }

    @Override
    public Collection<StreetEntity> findAll() {
        Collection<StreetEntity> streetEntities=
                entityManager.createQuery(("select c from StreetEntity c"))
                        .getResultList();
       return CollectionUtils.isEmpty(streetEntities)? Collections.emptyList():streetEntities;
    }

    @Override
    public Optional<StreetEntity> findById(int id) {
        final StreetEntity streetEntity=
                entityManager.find(StreetEntity.class,id);
if(Objects.isNull(streetEntity)) throw new RuntimeException("street not found");
        return Optional.ofNullable(streetEntity);
    }
}
