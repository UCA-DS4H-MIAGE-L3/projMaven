package exemple1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.* ;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoiteTest {
	static Boite b1, b2;
	static Jouet pokemon = mock(Jouet.class);
	static Jouet barbie = mock(Jouet.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		b1 = new Boite();
		b2 = new Boite(1, 4, 9);
		when(pokemon.nom()).thenReturn("Pikachu");
		when(pokemon.prix()).thenReturn(20);
		when(barbie.nom()).thenReturn("Stéréotypée");
		when(barbie.prix()).thenReturn(50);
	}



	@Test
	void testBoite() {
		assertEquals(b1.getHauteur(),1);
		assertEquals(b1.getLargeur(),1);
		assertEquals(b1.getLongueur(),1);	
	}

	@Test
	void testGetLargeur() {
		assertEquals(b2.getLargeur(),1);
	}

	@Test
	void testSetLargeur() {
		b2.setLargeur(12);
		assertEquals(b2.getLargeur(),12);
		assertEquals(b2.getHauteur(),9);
		assertEquals(b2.getLongueur(),4);
	}

	@Test 
	void testNouveauJouet() {
		assertEquals(b1.nbJouet, 0);
		b1.ajouteJouet(pokemon);
		assertEquals(b1.nbJouet, 1);
		b1.ajouteJouet(pokemon);
		assertEquals(b1.nbJouet, 2);
		assertEquals(b1.typeJouet.nom(), "Pikachu");
	}

	@Test
	void testDeuxJouets() {
		assertEquals(b1.nbJouet, 0);
		b1.ajouteJouet(pokemon);
		assertEquals(b1.nbJouet, 1);
		b1.ajouteJouet(pokemon);
		assertEquals(b1.nbJouet, 2);
		b1.ajouteJouet(barbie);
		assertEquals(b1.nbJouet, 1);
	}

}
