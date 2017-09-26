package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import co.simplon.factorielle.Factorielle;

public class FactorielleTest2 {
	public boolean factorielleTest2(Long input, Long resultat) {
		Factorielle test=new Factorielle();
		return(resultat.equals(test.calculer(input)));
	}


	@Test
	public void factorielle_de_0_doit_donner_le_resultat_1() {
	//Given -When -Then
		assertTrue("Factorielle de 0 doit être 1",factorielleTest2(0L,1L));
		
	
	}
	@Ignore
	@Test
	public void factorielle_de_1_doit_donner_le_resultat_1() {
		//Given -When -Then
		assertTrue("Factorielle de 1 doit être 1",factorielleTest2(1L,1L));
	}
	@Test
	public void factorielle_de_19_doit_donner_le_resultat_121645100408832000() {
		//Given -When -Then
		assertTrue("Factorielle de 19 doit être 121645100408832000",factorielleTest2(1L,121645100408832000L));
	}
	
	@Test
	public void factorielle_de_3_doit_donner_le_resultat_6() {
	//Given
		Long nombre=3L;
		Long attendu=5L;
		Factorielle f=new Factorielle();
	//When
		long resultat=f.calculer(nombre);
	//Then	
		assertTrue("Le factiorielle de 3 doit être 6",attendu==resultat);
	}
	
	
}
