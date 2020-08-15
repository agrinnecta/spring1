package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link RestController} that provides endpoints for demo data
 * 
 */
@RestController
public class RestDemoController {
		
	/**
	 * Return the predefined set of names
	 * 
	 * @return the {Set<String>} predefined set of names
	 * 
	 */
	@GetMapping ("/names")
	public Set<String> getNames() {
		return new HashSet<>(Arrays.asList("Peter","Ana"));
	}
		
}
