package com.example.demo;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import com.example.demo.model.enumeration.CityType;
import com.example.demo.model.enumeration.Currency;
import com.example.demo.model.enumeration.MotherTongue;
import com.example.demo.repository.StreetRepository;
import com.example.demo.service.StreetService;
import com.example.demo.service.StreetServiceImpl;
import com.example.demo.service.TravelFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest3 {
  @Autowired
  private StreetService streetService;

  @Autowired
  private TravelFacade travel;

  @Test
  public void contextLoads() {
  //  final StreetEntity streetEntity = new StreetEntity();
//      streetEntity.setName("Oxford");
//      streetEntity.setHouse(20);
//      streetEntity.setId(7);
//      streetEntity.setCityId(2);
//      streetService.createOrUpdate(streetEntity);
//    System.out.println("STREET WAS FOUND: "+streetService.findById(9));
//   streetService.remove(15);
//    streetService.remove(17);
    //  System.out.println(streetService.findAll());


  }

  @Test
  public void testStreetRepository() {
    /*final StreetEntity streetEntity = new StreetEntity();
    // System.out.println(streetRepository.findAll());
    List<Integer> list = new ArrayList();
    list.add(1);
    System.out.println(streetRepository.findAllById(list));
    System.out.println(streetRepository.existsById(1));
   // System.out.println(streetRepository.equals());???
streetRepository.deleteById(1);  //Do NOT WOKR:(
    System.out.println(streetRepository.findByHouse(20));*/
//    Collection<StreetEntity> streets = streetService.getAllByFilter2(20, 80);
//    System.out.println("before delete Size = "+streets.size());
//    streets.forEach(System.out::println);
//    //streetService.delete(1);
//    streets = streetService.getAllByFilter2(20, 80);
//    System.out.println("after delete Size = "+streets.size());
//    streets.forEach(System.out::println);
//    streetService.findAllByHouseBetweenAndCityIdIsNotNull(20,60);


    StreetEntity streetEntity = new StreetEntity();
    CountryEntity countryEntity  = new CountryEntity();
    CityEntity cityEntity= new CityEntity();
    streetEntity.setCityId(9);
    streetEntity.setId(8);
    streetEntity.setName("Central_street");
    streetEntity.setHouse(55);


    countryEntity.setName("Greece");
    countryEntity.setId(10);
    countryEntity.setMotherTongue(MotherTongue.Spanish);
    countryEntity.setCurrency(Currency.USD);
    countryEntity.setSquare(203.25);
    countryEntity.setPopulation(268);
    countryEntity.setDescription("Greece is located at the crossroads of Europe, Asia, and Africa.");
    countryEntity.setCity("Athens");

    cityEntity.setName("Tokyo");
    cityEntity.setType(CityType.metropolis);
    cityEntity.setSquare(25.6);
    Calendar calendar = new GregorianCalendar(158, 4 , 16);
    Date date = calendar.getTime();
    cityEntity.setFoundationDate(date);

    travel.createFullInfo(streetEntity,countryEntity, cityEntity);

  }
}
