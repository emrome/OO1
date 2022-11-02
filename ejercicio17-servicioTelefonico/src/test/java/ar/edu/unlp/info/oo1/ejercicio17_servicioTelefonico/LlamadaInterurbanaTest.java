package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LlamadaInterurbanaTest {
	
	private LlamadaInterurbana llamada1;
	private LlamadaInterurbana llamada2;
	private LlamadaInterurbana llamada3;
	private LlamadaInterurbana llamada4;
	private LlamadaInterurbana llamada5;
	private LlamadaInterurbana llamada6;
	private LlamadaInterurbana llamada7;
	
	@BeforeEach
	void setUp() throws Exception {
		//particion 1
		llamada1 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "141 94682",50);
		
		//bordes particion 1 y 2
		llamada2 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "711 415387",99);
		llamada3 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "181 45872",100);
		
		//particion 2
		llamada4 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "119 654587",125);
		
		//bordes particion 2 y 3
		llamada5 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "1121 14587",500);
		llamada6 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "7141 794587",501);
		
		//particion 3
		llamada7 = new LlamadaInterurbana(LocalDateTime.now(), 1, "2211254", "9811 42587",600);
	}

	@Test
	void calcularCostoTest() {
		assertEquals(7, llamada1.calcularCosto());
		assertEquals(7, llamada2.calcularCosto());
		assertEquals(7.5, llamada3.calcularCosto());
		assertEquals(7.5, llamada4.calcularCosto());
		assertEquals(7.5, llamada5.calcularCosto());
		assertEquals(8, llamada6.calcularCosto());
		assertEquals(8, llamada7.calcularCosto());
	}

}
