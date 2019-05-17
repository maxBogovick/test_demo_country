package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomizedHouse<T>  {

    List<T> getHouseMaxNumber();

}
