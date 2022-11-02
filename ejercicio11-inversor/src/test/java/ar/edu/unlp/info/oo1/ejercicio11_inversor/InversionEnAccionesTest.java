package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {
	
	private Inversion inversion;
	
	@BeforeEach
	void setUp() throws Exception {
		inversion = new InversionEnAcciones("Pajarito", 10, 500);
	}

	@Test
	void testValorActual() {
		assertEquals(5000, inversion.valorActual());
	}

}
