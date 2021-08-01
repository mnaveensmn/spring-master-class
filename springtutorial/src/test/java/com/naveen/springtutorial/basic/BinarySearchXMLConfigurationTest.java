package com.naveen.springtutorial.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.naveen.springtutorial.SpringBasicApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/testContext.xml")
class BinarySearchXMLConfigurationTest {

	@Autowired
	BinarySearch binarySearch;
	
	@Test
	void testBasicScenario() {
		int actualResult = binarySearch.sortAndSearch(new int[] {}, 5);
		assertEquals(5, actualResult);
	}

}
