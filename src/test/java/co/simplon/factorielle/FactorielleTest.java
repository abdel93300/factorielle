package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import co.simplon.factorielle.Factorielle;

public class FactorielleTest {

	@Ignore
	@Test
	public void calculer_1() {
	//Given
		Long nombre=1L;
	//When
		Factorielle f=new Factorielle();
	//Then	
		assertEquals(1L,f.calculer(nombre));
	}
	@Test
	public void calculer_0() {
	//Given
		Long nombre=0L;
	//When
		Factorielle f=new Factorielle();
	//Then	
		assertEquals(1L,f.calculer(nombre));
	}
	@Test
	public void calculer_19() {
	//Given
		Long nombre=19L;
	//When
		Factorielle f=new Factorielle();
	//Then	
		assertEquals(121645100408832000L,f.calculer(nombre));
	}
	
}
