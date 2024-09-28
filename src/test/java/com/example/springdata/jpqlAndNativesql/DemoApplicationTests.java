package com.example.springdata.jpqlAndNativesql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdata.jpqlAndNativesql.entities.User;
import com.example.springdata.jpqlAndNativesql.repo.SubscriptionRepository;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	SubscriptionRepository repo;

	@Test
	void testSubcriptionCreate() {
		User user = new User();
		user.setMsisdn("8655501911");
		user.setPlanType(1);
		user.setServiceId(1);
		user.setSource("test");
		repo.save(user);
	}

}
