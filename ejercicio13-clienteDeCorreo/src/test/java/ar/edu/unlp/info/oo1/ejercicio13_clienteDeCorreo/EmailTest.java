package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
	
	private Email email;
	private Email email2;
	private Archivo adjunto;
	
	@BeforeEach
	void setUp() throws Exception {
	
		email = new Email("HOLA","CHAU");
		adjunto = new Archivo("yanose.jpg");
		email.adjuntar(adjunto);
		email2 = new Email("EMAIL2","2");
	
	}

	@Test
	void testEspacioOcupado() {
		assertEquals(18.00,email.espacioOcupado());
		assertEquals(7.00,email2.espacioOcupado());
	}
	
	@Test
	void testContiene() {
		assertFalse(email.contiene("Eail"));
		assertTrue(email.contiene("HOL"));
		assertTrue(email2.contiene("2"));
	}
	
}
