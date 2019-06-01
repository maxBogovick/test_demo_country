package com.example.demo;

import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import com.example.demo.model.enumeration.CityType;
import com.example.demo.model.enumeration.Currency;
import com.example.demo.model.enumeration.MotherTongue;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CityService;
import com.example.demo.service.CountryService;
import com.example.demo.service.StreetService;
import com.example.demo.service.TravelFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest4 {
  @Autowired
  private StreetService streetService;

  @Autowired
  private TravelFacade travel;

  @Autowired
  private CountryService countryService;

  @Autowired
  private CityService cityService;

  @Autowired
  private CountryRepository countryRepository;

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

    CountryEntity countryEntity  = new CountryEntity();
    CityEntity cityEntity= new CityEntity();
    StreetEntity streetEntity = new StreetEntity();

    //streetEntity.setCityId(9);
    //streetEntity.setId(8);
    streetEntity.setName("Central_street");
    streetEntity.setHouse(55);


    countryEntity.setName("Japan5");
    //countryEntity.setId(10);
    countryEntity.setMotherTongue(MotherTongue.ENGLISH);
    countryEntity.setCurrency(Currency.USD);
    countryEntity.setSquare(203.25);
    countryEntity.setPopulation(268);
    countryEntity.setDescription("Greece is located at the crossroads of Europe, Asia, and Africa.");
    countryEntity.setCity("Athens");

    cityEntity.setName("Tokyo118");
    cityEntity.setType(CityType.metropolis);
    cityEntity.setSquare(25.6);
    Calendar calendar = new GregorianCalendar(158, 4 , 16);
    Date date = calendar.getTime();
    cityEntity.setFoundationDate(date);
    cityEntity.setCountry(countryEntity);
    countryEntity.getCities().add(cityEntity);

    streetEntity.setCity(cityEntity);
    cityEntity.getStreets().add(streetEntity);

    //streetEntity.setCity(cityEntity);
    //cityService.createOrUpdate(cityEntity);
    //countryService.createOrUpdate(countryEntity);

    travel.createFullInfo(countryEntity,cityEntity,streetEntity);

    streetService.createOrUpdate(streetEntity);

    countryService.remove(countryEntity.getId());

    /*System.out.println("country id = " + countryService.findById(countryEntity.getId()));
    System.out.println("street id = " + streetService.findById(streetEntity.getId()));

    System.out.println("city id = " + cityService.findById(cityEntity.getId()));

    System.out.println(countryService.findById(countryEntity.getId()));
    System.out.println(countryRepository.findAllByCountryPopulation());*/
  }
}
