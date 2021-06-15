package com.bucket.travelrestrictions;

import com.bucket.travelrestrictions.models.Restriction;
import com.bucket.travelrestrictions.repositories.RestrictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelRestrictionsApplication {
//
//	@Autowired
//	public static RestrictionRepository restrictionRepository;
	public static void main(String[] args) {
		SpringApplication.run(TravelRestrictionsApplication.class, args);
//		Restriction restriction = new Restriction("Orc Invasion", "Middle Earth");
//		Restriction restriction1 = new Restriction("Intelligent Lion Outbreak", "Narnia");
//		restrictionRepository.save(restriction);
//		restrictionRepository.save(restriction1);



	}

}
