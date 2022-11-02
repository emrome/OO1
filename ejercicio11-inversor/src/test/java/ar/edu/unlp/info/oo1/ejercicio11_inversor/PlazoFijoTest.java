package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {
	
	private Inversion plazoFijo;

	@BeforeEach
	void setUp() throws Exception {
		plazoFijo = new PlazoFijo(LocalDate.now().minusDays(4), 100, 5);
	}

	@Test
	void testValorActual() {
		assertEquals(120, plazoFijo.valorActual());
	}

}
