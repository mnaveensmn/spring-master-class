package com.naveen.mockito.mackitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindTheGreatestFromAllData() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
	}

}

//Stub
class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {24,6,15};
	}
	
}