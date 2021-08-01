package com.naveen.springtutorial.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest { 

	@InjectMocks
	SomeCdiBusiness business;
	
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4, business.findGreatest());
	}
	
	@Test
	void testBasicScenario2() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,5,6,1});
		assertEquals(6, business.findGreatest());
	}

}
