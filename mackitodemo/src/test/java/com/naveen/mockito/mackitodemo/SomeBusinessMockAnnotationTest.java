package com.naveen.mockito.mackitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationTest {

	@Mock
	DataService dataService;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	void testFindTheGreatestFromAllData() {
		when(this.dataService.retrieveAllData()).thenReturn(new int[] {24,6,15});
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
	}
	
	@Test
	void testFindTheGreatestFromAllData_TwoValue() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {1,2});
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(2,result);
	}
	
	@Test
	void testFindTheGreatestFromAll_NoValue() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {});
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(Integer.MIN_VALUE,result);
	}
	
}
