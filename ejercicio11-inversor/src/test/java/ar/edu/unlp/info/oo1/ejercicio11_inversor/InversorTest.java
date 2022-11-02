package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {

	private Inversor inversor;
	private Inversion inversion1;
	private Inversion enAcciones;
	
	@BeforeEach
	void setUp() throws Exception {
		inversor = new Inversor("Juan");
		inversion1 = new PlazoFijo(LocalDate.now(), 100, 5);
		enAcciones = new InversionEnAcciones("Pajarito", 100, 50);
	}
	
	@Test
	void testCreacion() {
		assertEquals(0,inversor.getInversiones().size());
	}
	
	@Test
	void testAgregarInversion() {
		inversor.agregarInversion(inversion1);
		inversor.agregarInversion(enAcciones);
		assertEquals(2,inversor.getInversiones().size());
	}
	
	@Test
	void testValorActual() {
		inversor.agregarInversion(enAcciones);
		assertEquals(5000, inversor.valorActual());
	}
	
	

}
