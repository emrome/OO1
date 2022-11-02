package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
	
	private Archivo archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		archivo = new Archivo ("hola.png");
	}

	@Test
	void testTamaño() {
		assertEquals(8.00,archivo.tamaño());
	}

}
