package com.naveen.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after () {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test 1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with2numbers() {
		System.out.println("Test 2");
		assertEquals(3, myMath.sum(new int[] {1,2}));
	}
	
	@Test
	public void sum_with4numbers() {
		System.out.println("Test 3");
		assertEquals(10, myMath.sum(new int[] {1,2,3,4}));
	}
	
	@Test
	public void otherAssertMethods() {
		System.out.println("Test 4");
		boolean cond = true;
		assertEquals(true, cond);
		assertEquals(true, cond);
		assertTrue(cond);
		assertFalse(false);
		assertArrayEquals(new int[] {1}, new int[] {1});
	}
}
