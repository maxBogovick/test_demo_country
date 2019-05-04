package com.example.demo;

import com.example.demo.dao.CountryDao;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.enumeration.MotherTongue;
import com.example.demo.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private CountryService countryService;


	@Test
	public void contextLoads() {
//		final CountryEntity countryEntity = new CountryEntity();//transient class
//		countryEntity.setId(120000);
//		countryEntity.setName("Russia");
//		countryEntity.setMotherTongue(MotherTongue.RU);
//		countryEntity.setCurrency("RUB");
//		System.out.println("id from new country entity = " + countryEntity.getId());
//		countryService.createOrUpdate(countryEntity);//
//		System.out.println("id from new country entity = " + countryEntity.getId());
//		countryEntity.setName("new Name");
//		countryService.createOrUpdate(countryEntity);
//		System.out.println("id from new country entity = " + countryEntity.getId());
//		System.out.println();
//		System.out.println(countryService.findById(8));
//		System.out.println(countryService.findById(80));
	}





}
