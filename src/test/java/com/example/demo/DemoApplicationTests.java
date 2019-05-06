package com.example.demo;

import com.example.demo.dao.CityDao;
import com.example.demo.dao.CountryDao;
import com.example.demo.model.CityEntity;
import com.example.demo.model.CountryEntity;
import com.example.demo.model.StreetEntity;
import com.example.demo.model.enumeration.Currency;
import com.example.demo.model.enumeration.MotherTongue;
import com.example.demo.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private CountryService countryService;

	@Test//example for Optional
	public void testOptional() {
		Optional<StreetEntity> streetEntity = Optional.empty();
		if (streetEntity.isPresent()) {
			streetEntity.get();
		}
		StreetEntity street = streetEntity.orElse(new StreetEntity());

		streetEntity.orElseThrow(() -> new IllegalArgumentException("Street is empty"));
		/*streetEntity.orElseThrow(() -> {
			throw new IllegalArgumentException("Street is empty");
		});*/
	}


	@Test
	public void contextLoads() {
		final CountryEntity countryEntity = new CountryEntity();//transient class
		//countryEntity.setId(120000);
		countryEntity.setName("Russia");
		countryEntity.setMotherTongue(MotherTongue.RU);
		countryEntity.setCurrency(Currency.USD);
		//System.out.println("id from new country entity = " + countryEntity.getId());
		System.out.println("call createOrUpdate");
		countryService.createOrUpdate(countryEntity);//
		System.out.println("call find by id");
		countryService.findById(countryEntity.getId());
//		System.out.println("id from new country entity = " + countryEntity.getId());
//		countryEntity.setName("new Name");
//		countryService.createOrUpdate(countryEntity);
//		System.out.println("id from new country entity = " + countryEntity.getId());
//		System.out.println();
//		System.out.println(countryService.findById(8));
//		System.out.println(countryService.findById(80));
	}





}
