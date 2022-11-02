package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LlamadaLocalTest {
	
	private LlamadaLocal llamada;
	
	@BeforeEach
	void setUp() throws Exception {
		llamada = new LlamadaLocal(LocalDateTime.now(), 3, "2211254", "11 4587");
	}

	@Test
	void calcularCostoTest() {
		assertEquals(3, llamada.calcularCosto());
	}

}
