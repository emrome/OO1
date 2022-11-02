package ar.edu.unlp.info.oo1.ejercicio7_methodLookupEmpleados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GerenteTest {
	
	private Gerente alan;
	
	@BeforeEach
	void setUp() {
		alan = new Gerente("Alan Turing");
	}
	
	@Test
	void testAportes() {
		assertEquals(2850,alan.aportes());
	}
	
	@Test 
	void testSueldoBasico() {
		assertEquals(67850,alan.sueldoBasico());
	}

}
