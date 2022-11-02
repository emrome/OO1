package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaDeAhorroTest {
	private CuentaDeAhorro cuentaDeAhorro;
	
	@BeforeEach
	void setUp() throws Exception {
		cuentaDeAhorro = new CuentaDeAhorro();
	}

	@Test
	void testCreacion() {
		assertEquals(0,cuentaDeAhorro.getSaldo());
	}
	
	@Test
	void testDepositar() {
		cuentaDeAhorro.depositar(100);
		assertEquals(98,cuentaDeAhorro.getSaldo());
	}
	
	@Test
	void testExtraer() {
		assertFalse(cuentaDeAhorro.extraer(100));
		cuentaDeAhorro.depositar(200);
		assertEquals(196, cuentaDeAhorro.getSaldo());
		assertTrue(cuentaDeAhorro.extraer(100));
		assertEquals(94,cuentaDeAhorro.getSaldo());
	}
	
	@Test
	void testTransferir() {
		CuentaDeAhorro cuentaDestino = new CuentaDeAhorro();
		assertFalse(cuentaDeAhorro.transferirACuenta(100, cuentaDestino));
		
		cuentaDeAhorro.depositar(200);
		assertEquals(196,cuentaDeAhorro.getSaldo());
		assertTrue(cuentaDeAhorro.transferirACuenta(100, cuentaDestino));
		assertEquals(94,cuentaDeAhorro.getSaldo());
		assertEquals(98,cuentaDestino.getSaldo()); //CONSULTAR como hacer para que se deposita 100 efectivamente

	}

}
