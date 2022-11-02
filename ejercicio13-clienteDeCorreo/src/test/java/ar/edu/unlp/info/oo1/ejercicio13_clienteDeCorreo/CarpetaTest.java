package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
	
	Email email1;
	Email email2;
	Archivo archivo;
	Carpeta carpeta;
	Carpeta carpetaSin;
	
	@BeforeEach
	void setUp() throws Exception {
		archivo = new Archivo ("imagen.pgn");
		email1 = new Email("Parcial", "Envio el parcial");
		email1.adjuntar(archivo);
		carpeta = new Carpeta("Documentos");
		carpeta.addEmail(email1);
		carpetaSin = new Carpeta("SinAdjuntos");
	}

	
	@Test
	void testAddEmail() {
		email2= new Email("123","456");
		carpeta.addEmail(email2);
		assertTrue(carpeta.getEmails().contains(email2));
	}
	
	@Test
	void testRemoveEmail() {
		carpeta.removeEmail(email1);
		assertFalse(carpeta.getEmails().contains(email1));
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(33.00,carpeta.espacioOcupado());
		assertEquals(0,carpetaSin.espacioOcupado());
	}
	
	@Test
	void testBuscar() {
		assertNull(carpeta.buscar("123"));
		assertEquals(email1,carpeta.buscar("Parcial"));
		assertNull(carpetaSin.buscar("HOLA"));
	}
	
	
}
