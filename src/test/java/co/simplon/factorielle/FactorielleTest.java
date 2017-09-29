package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import co.simplon.factorielle.Factorielle;

public class FactorielleTest {

	@Ignore
	@Test
	public void factorielle_de_1_doit_donner_le_resultat_1() {
	//Given
		Long nombre=1L;
		Factorielle f=new Factorielle();
	//When
		long resultat=f.calculer(nombre);
	//Then	
		assertEquals(1L,resultat);
	}
	@Test
	public void factorielle_de_0_doit_donner_le_resultat_1() {
	//Given
		Long nombre=0L;
		Factorielle f=new Factorielle();
	//When
		long resultat=f.calculer(nombre);
	//Then	
		assertEquals(1L,resultat);
	}
	@Ignore
	@Test
	public void factorielle_de_19_doit_donner_le_resultat_121645100408832000() {
	//Given
		Long nombre=19L;
		Factorielle f=new Factorielle();
	//When
		long resultat=f.calculer(nombre);
	//Then	
		assertEquals(121645100408832000L,resultat);
	}
	
	@Test
	public void factorielle_de_3_doit_donner_le_resultat_6() {
	//Given
		Long nombre=3L;
		Factorielle f=new Factorielle();
	//When
		long resultat=f.calculer(nombre);
	//Then	
		assertEquals("Le factorielle de 3 doit être 6",6L,resultat);
	}
	
	@Test
	public void factorielle_de_4_doit_donner_le_resultat_6b() {
	//Given
		Long nombre=3L;
		Long attendu=5L;
		Factorielle f=new Factorielle();
	//When
		
		long resultat=f.calculer(nombre);
	//Then	
		assertTrue("Le factorielle de 3 doit être 6",attendu==resultat);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void factorielle_de_Moins_1_doit_genere_une_Exception() {
	//Given
		Long nombre=-1L;
		Long attendu=5L;
		Factorielle f=new Factorielle();
	//When
		
		long resultat=f.calculer(nombre);
	//Then	
		assertTrue("Le factorielle de -1 doit générer une exception",attendu==resultat);
	}
		
	@Test(timeout=1)
	public void test_timeout() {
	while (true) {
		assertTrue("Test du timeout",2==2);
	}
	}
}
