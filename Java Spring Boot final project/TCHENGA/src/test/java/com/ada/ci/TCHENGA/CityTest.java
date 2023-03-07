package com.ada.ci.TCHENGA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ada.ci.TCHENGA.models.CityEntity;
import com.ada.ci.TCHENGA.repository.CityRepository;

@SpringBootTest
public class CityTest {
	
	@Autowired
	private CityRepository cityRepository;
	
	@Test
	private void saveCity() {
		
		CityEntity city = new CityEntity();
		cityRepository.save(city);
	}

}
