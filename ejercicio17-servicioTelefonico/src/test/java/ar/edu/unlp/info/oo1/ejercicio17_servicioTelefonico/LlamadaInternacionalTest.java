package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LlamadaInternacionalTest {
	
	private LlamadaInternacional llamada1;
	private LlamadaInternacional llamada2;
	private LlamadaInternacional llamada3;
	private LlamadaInternacional llamada4;
	private LlamadaInternacional llamada5;
	
	@BeforeEach
	void setUp() throws Exception {
		//borde 8 am
		llamada1 = new LlamadaInternacional(LocalDateTime.of(2022, 10, 9, 8, 0), 1, "2211254", "141 94682", "Argentina", "Brasil");
		
		//particion mas 8, menos 20
		llamada2 = new LlamadaInternacional(LocalDateTime.of(2022, 10, 9, 15, 0), 1, "2211254", "141 94682", "Argentina", "Brasil");
		
		//borde 19:59 
		llamada3 = new LlamadaInternacional(LocalDateTime.of(2022, 10, 9, 19, 59), 1, "2211254", "141 94682", "Argentina", "Brasil");
		
		//particion mas 20, menos 8
		llamada4 = new LlamadaInternacional(LocalDateTime.of(2022, 10, 10, 1, 0), 1, "2211254", "141 94682", "Argentina", "Brasil");
		
		//borde 7:59
		llamada5 = new LlamadaInternacional(LocalDateTime.of(2022, 10, 10, 7, 59), 1, "2211254", "141 94682", "Argentina", "Brasil");
		
	}

	@Test
	void test() {
		assertEquals(4,llamada1.calcularCosto());
		assertEquals(4,llamada2.calcularCosto());
		assertEquals(4,llamada3.calcularCosto());
		assertEquals(3,llamada4.calcularCosto());
		assertEquals(3,llamada5.calcularCosto());
	}

}
