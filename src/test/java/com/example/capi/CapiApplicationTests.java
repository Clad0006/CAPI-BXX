package com.example.capi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CapiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void greetings() {
		CapiApplication app = new CapiApplication();
		String greeting = app.hello("Test");
		assert(greeting.equals("Hello Test!"));
	}

}
