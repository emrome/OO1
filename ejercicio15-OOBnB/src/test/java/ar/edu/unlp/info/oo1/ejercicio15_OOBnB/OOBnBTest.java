package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OOBnBTest {
	private OOBnB sistema;
	private Usuario propietario;
	private Usuario usuario2;
	private Propiedad propiedad;
	private Propiedad propiedad2;
	private Propiedad propiedad3;
	private DateLapse periodo;
	private DateLapse periodo2;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new OOBnB();
		
		propietario = sistema.registrarUsuario("Maria","122",44587);
		usuario2 = sistema.registrarUsuario("Emilia","232",45487);
		propiedad = sistema.registrarPropiedad("Prop 1","Muy buena",1,"138 768",propietario);
		propiedad2 = sistema.registrarPropiedad("Prop 2","Muy mala",1,"140 568",propietario);

		
		periodo = new DateLapse(LocalDate.of(2022,10,20), LocalDate.of(2022, 10, 30));
		periodo2 = new DateLapse(LocalDate.of(2022,11,25), LocalDate.of(2022, 11, 28));
		sistema.hacerReserva(propiedad, periodo, usuario2);
		sistema.hacerReserva(propiedad2, periodo2, usuario2);
	}
	
	
	@Test
	void testRegistrarUsuario() {
		OOBnB sistema2 = new OOBnB();
		assertEquals(0,sistema2.getUsuarios().size());
		sistema2.registrarUsuario("Mar", "null", 44);
		assertEquals(1,sistema2.getUsuarios().size());
	}
	
	@Test
	void testRegistrarPropiedad() {
		//sin propiedades y despues de agregar
		OOBnB sistema2 = new OOBnB();
		assertEquals(0,sistema2.getPropiedades().size());
		sistema2.registrarUsuario("Mar", "null", 44);
		assertEquals(1,sistema2.getUsuarios().size());
		assertTrue(sistema.getPropiedades().contains(propiedad));
		assertTrue(sistema.getPropiedades().contains(propiedad2));
		assertTrue(sistema.getPropiedades().contains(propiedad3));
	}
	
	@Test
	void testPropiedadesDisponibles() {
		//Ninguna propiedad registrada
		//Ninguna propiedad disponible
		//Alguna propiedad disponible
		List<Propiedad> propiedades = sistema.propiedadesDisponibles(periodo2);
		assertEquals(2,propiedades.size());
		assertFalse(propiedades.contains(propiedad2));
		assertTrue(propiedades.contains(propiedad3));
	}
	
	@Test
	void hacerReserva() {
		//Si tengo varios conocimientos, que se guarde en todas
		assertFalse(propiedad2.estaDisponible(periodo2));
		assertEquals(1,propiedad2.getReservas().size());
		assertNull(sistema.hacerReserva(propiedad, periodo, usuario2));
	}
	
	@Test
	void calcularIngresosPropietario() {
		//No necesario en esta clase
		assertEquals(23,sistema.calcularIngresosPropietario(propietario, periodo));
		assertEquals(0,sistema.calcularIngresosPropietario(usuario2, periodo2));
	}
}
