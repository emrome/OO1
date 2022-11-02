package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {

	private ClienteDeCorreo cliente;
	private Carpeta carpeta;
	private Email email;
	
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new ClienteDeCorreo();
		carpeta = new Carpeta("Documentos");
		email = new Email("Facultad", "Buenos dias, xxxxxx");
		cliente.addCarpeta(carpeta);
		cliente.recibir(email);
		
	}
	
	@Test
	void testRecibir() {
		Email email2 = new Email("SoyUnEmail","1234");
		cliente.recibir(email2);
		assertTrue(cliente.getInbox().getEmails().contains(email2));
	}
	
	@Test
	void testMover() {
		cliente.mover(email, cliente.getInbox(), carpeta);
		assertFalse(cliente.getInbox().getEmails().contains(email));
		assertTrue(carpeta.getEmails().contains(email));
	}
	
	
	@Test
	void testBuscar() {
		assertEquals(email,cliente.buscar("Facultad"));
		assertNull(cliente.buscar("Docentes"));
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(27.00,cliente.espacioOcupado());
	}
	
}
