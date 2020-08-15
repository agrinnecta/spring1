package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void getNamesShouldReturnExpectedNames() {
		Set<String> resultNames = new HashSet<String>(Arrays.asList("Ana","Peter"));
		RestDemoController restDemoController = new RestDemoController();
		assertArrayEquals(resultNames.toArray(), restDemoController.getNames().toArray());
	}
}
