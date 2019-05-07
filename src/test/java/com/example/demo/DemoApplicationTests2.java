package com.example.demo;

import com.example.demo.model.CityEntity;
import com.example.demo.model.enumeration.CityType;
import com.example.demo.service.CityService;
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
public class DemoApplicationTests2 {

    @Autowired
    private  CityService cityService;


    @Test
    public void contextLoads() {
        final CityEntity cityEntity = new CityEntity();
//        cityEntity.setSquare(93.25);
//        cityEntity.setType(CityType.city);
//       Calendar calendar = new GregorianCalendar(251, 3 , 16);
//        Date date = calendar.getTime();
//        cityEntity.setFoundationDate(date);
//        cityEntity.setDescription("beautiful and magnificent");
//        cityEntity.setCapital(1);
//        cityEntity.setPopulation(365);
//        cityService.createOrUpdate(cityEntity);

//        System.out.println("THE CITY WAS FOUND: "+cityService.findById(9));
//     System.out.println("ALL CITIES:"+cityService.findAll());
    }

}
