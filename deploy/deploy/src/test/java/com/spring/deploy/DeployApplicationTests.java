package com.spring.deploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach((key,value) ->System.out.println(key +" = " + value));
	}

}
