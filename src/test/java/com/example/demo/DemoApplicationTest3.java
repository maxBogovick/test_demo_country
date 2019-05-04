package com.example.demo;

import com.example.demo.model.StreetEntity;
import com.example.demo.service.StreetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest3 {
  @Autowired
    private StreetService streetService;
  @Test
    public void contextLoads(){
      final StreetEntity streetEntity= new StreetEntity();
      streetEntity.setName("Oxford");
      streetEntity.setHouse(20);
      streetEntity.setId(7);
      streetEntity.setCityId(2);

  }


    }


