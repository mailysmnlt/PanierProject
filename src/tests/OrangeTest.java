package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import source.Orange;


public class OrangeTest {
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void test() throws Exception {
		Orange o1 = new Orange(0.5,"France");
		Orange o2 = new Orange(0.5,"Espagne");
		Orange o3 = new Orange(0.6,"France");
		Orange o4 = new Orange(0.5,"France");
		assertEquals(o1.equals(o2), false);
		assertEquals(o1.equals(o3), false);
		assertEquals(o1.equals(o4), true);	
	}
	

	@After
	public void fin() {
		
	}

}
