package com.naveen.mockito.mackitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,6,15});
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
	}
	
	@Test
	void testFindTheGreatestFromAllData_twovalue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2});
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(2,result);
	}

}
