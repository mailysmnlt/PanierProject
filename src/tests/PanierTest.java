package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import source.Orange;
import source.Panier;

public class PanierTest {
	
		
	@Before
	public void setup() {
		
	}
	
	@Test
	public void testEqual() throws Exception {		
		
		Orange o1 = new Orange(0.5,"France");
		Orange o2 = new Orange(0.7,"Espagne");
		Orange o3 = new Orange(0.8,"France");
		Orange o4 = new Orange(0.5,"France");
		
		//Même contenu mais taille différente
		Panier p1 = new Panier(5);
		Panier p2 = new Panier(6);
		
		p1.ajouteOrange(o1);
		p1.ajouteOrange(o2);
		
		p2.ajouteOrange(o1);		
		p2.ajouteOrange(o2);
				
		assertEquals(p1.equals(p2), false);
		
		//Même taille mais contenu différent
		Panier p3 = new Panier(5);
		
		p3.ajouteOrange(o1);
		p3.ajouteOrange(o3);
				
		assertEquals(p1.equals(p3), false);
		
		//Même taille même contenu
		Panier p4 = new Panier(5);	
		
		p4.ajouteOrange(o4);
		p4.ajouteOrange(o2);
				
		assertEquals(p1.equals(p4), true);
	
	}
	
	@Test
	public void testPrix() throws Exception {		
		
		Orange o1 = new Orange(0.5,"France");
		Orange o2 = new Orange(0.7,"Espagne");
		Orange o3 = new Orange(0.8,"France");
		Orange o4 = new Orange(0.5,"France");
		
		Panier p1 = new Panier(5);
		
		p1.ajouteOrange(o1);
		p1.ajouteOrange(o2);
		p1.ajouteOrange(o3);
		p1.ajouteOrange(o4);		
				
		assertEquals(p1.getPrix(), 2.5, 0.001);

	
	}
	

	@After
	public void fin() {
	}


}
