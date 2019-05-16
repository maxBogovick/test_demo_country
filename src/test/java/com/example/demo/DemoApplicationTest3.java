package com.example.demo;

import com.example.demo.model.StreetEntity;
import com.example.demo.repository.StreetRepository;
import com.example.demo.service.StreetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest3 {
  @Autowired
  // private StreetService streetService;
  private StreetRepository streetRepository;

  @Test
  public void contextLoads() {
    final StreetEntity streetEntity = new StreetEntity();
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
  @Transactional
  public void testStreetRepository() {
    final StreetEntity streetEntity = new StreetEntity();
    // System.out.println(streetRepository.findAll());
    List<Integer> list = new ArrayList();
    list.add(1);
    System.out.println(streetRepository.findAllById(list));
    System.out.println(streetRepository.existsById(1));
   // System.out.println(streetRepository.equals());???
streetRepository.deleteById(1);  //Do NOT WOKR:(
    System.out.println(streetRepository.findByHouse(20));


  }
}
