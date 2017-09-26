package factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import co.simplon.factorielle.Factorielle;

public class Test1 {

	@Ignore
	@Test
	public void le_Resultat1_Doit_etre_1() {
	//Given
		Long nombre=1L;
	//When
		Factorielle f=new Factorielle();
	//Then	
		assertEquals(1L,f.calculer(nombre));
	}
	@Test
	public void le_Resultat2_Doit_etre_1() {
	//Given
		Long nombre=0L;
	//When
		Factorielle f=new Factorielle();
	//Then	
		assertEquals(1L,f.calculer(nombre));
	}
	@Test
	public void le_Resultat3_Doit_etre_121645100408832000() {
	//Given
		Long nombre=19L;
	//When
		Factorielle f=new Factorielle();
	//Then	
		assertEquals(121645100408832000L,f.calculer(nombre));
	}
	
}
