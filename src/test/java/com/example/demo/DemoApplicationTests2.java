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
        cityEntity.setName("Venice");
        cityEntity.setSquare(253.25);
        cityEntity.setType(CityType.city);
       Calendar calendar = new GregorianCalendar(513, 2 , 25);
        Date date = calendar.getTime();
        cityEntity.setFoundationDate(date);
        cityEntity.setDescription("marvelous city2");
        cityEntity.setCapital(0);

        System.out.println();
    }

}
