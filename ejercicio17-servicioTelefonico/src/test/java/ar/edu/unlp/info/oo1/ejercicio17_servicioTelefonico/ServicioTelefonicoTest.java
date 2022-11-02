package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTelefonicoTest {
	
	private ServicioTelefonico servicio;
	private ServicioTelefonico servicioVacio;
	private Cliente fisica;
	private Cliente fisica2;
	private Cliente juridica;

	@BeforeEach
	void setUp() throws Exception {
		servicio = new ServicioTelefonico();
		servicioVacio = new ServicioTelefonico();
		servicio.agregarNumero("221232232");
		servicio.agregarNumero("221234232");
		servicio.agregarNumero("221654824");
		
		fisica = servicio.altaPersonaFisica("Pepito", "Avenida Siempre Viva 742", 4421);
		fisica2 = servicio.altaPersonaFisica("Jose", "Avenida Siempre Viva 762", 2212);
		juridica = servicio.altaPersonaJuridica("Holas", "Dir1", 145, "tipo");
	}

	@Test
	void altaPersonaTest() {
		assertEquals(3,servicio.getClientes().size());
		assertTrue(servicio.getClientes().contains(juridica));
		assertTrue(servicio.getClientes().contains(fisica));
		assertTrue(servicio.getClientes().contains(fisica2));
		assertEquals(0,servicioVacio.getClientes().size());
	}
	
	@Test
	void agregarNumeroTest() {
		servicio.agregarNumero("11234");
		assertEquals(1,servicio.getNumerosDisponibles().size());
		assertTrue(servicio.getNumerosDisponibles().contains("11234"));
		assertEquals(0,servicioVacio.getNumerosDisponibles().size());
	}
	
	@Test
	void asignarNumeroTest() {
		assertEquals("221232232",fisica.getNumero());
		assertFalse(servicio.getNumerosDisponibles().contains("221232232"));
	}
	
	@Test
	void registrarLlamadaTest() {
		Llamada llamadaInt = servicio.registrarLlamadaInternacional(LocalDateTime.now(), 1, "221232232", "0314579", "Argentina", "Brasil");
		Llamada llamadaInteru = servicio.registrarLlamadaInterurbana(LocalDateTime.now(), 1, "221232232", "11458796", 50);
		Llamada llamadaLocal = servicio.registrarLlamadaLocal(LocalDateTime.now(), 1, "221232232", "22147856");
		
		assertTrue(fisica.getLlamadas().contains(llamadaLocal));
		assertTrue(fisica.getLlamadas().contains(llamadaInt));
		assertTrue(fisica.getLlamadas().contains(llamadaInteru));
	}

}
