package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void le_Resultat_Doit_etre_1() {
	//Given
		Long nombre=1L;
	//When
		Factorielle f=new Factorielle();
		
	//Then	
		assertEquals(1L,f.calculer(nombre));
	}
	
}
