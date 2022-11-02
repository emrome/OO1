package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {
	
	private Usuario usuario;
	private Usuario usuario2;
	private Propiedad propiedad;
	private Propiedad propiedad2;
	private DateLapse periodo;
	private Reserva reserva;
	private Reserva reserva2;
	
	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario ("Mario", "123", 1254);
		usuario2 = new Usuario ("Mar", "123", 1254);
		propiedad = new Propiedad ("Prop","Muybuena",1,"135 n78",usuario);
		propiedad2 = new Propiedad ("Prop 2","Muybuena",1,"135 n78",usuario);
		periodo = new DateLapse (LocalDate.now(),LocalDate.now().plusDays(10));
		reserva = new Reserva (periodo, propiedad, usuario2);
		propiedad.hacerReserva(reserva);
		reserva2 = new Reserva (new DateLapse(LocalDate.of(2022,11,7),LocalDate.of(2022, 11, 10)), propiedad, usuario2);
		propiedad.hacerReserva(reserva);
	}

	@Test
	void testEstaDisponible() {
		assertFalse(propiedad.estaDisponible(periodo));
		assertTrue(propiedad2.estaDisponible(periodo));
	}
	
	@Test
	void testCalcularIngresos() {
		assertEquals(13,propiedad2.calcularIngresos(new DateLapse(LocalDate.of(2022,10,7),LocalDate.of(2022, 11, 11))));
		assertEquals(0,propiedad2.calcularIngresos(periodo));
	}

}
