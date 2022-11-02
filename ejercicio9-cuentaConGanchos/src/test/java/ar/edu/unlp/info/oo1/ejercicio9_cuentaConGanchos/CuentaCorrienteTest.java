package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	private CuentaCorriente cuentaCorriente;
	
	@BeforeEach
	void setUp() throws Exception {
		cuentaCorriente = new CuentaCorriente();
		
	}

	@Test
	void testCreacion() {
		assertEquals(0,cuentaCorriente.getSaldo());
		assertEquals(0,cuentaCorriente.getLimiteDescubierto());
	}
	
	@Test
	void testDepositar() {
		cuentaCorriente.depositar(500);
		assertEquals(500,cuentaCorriente.getSaldo());
	}
	
	@Test 
	void testExtraer() {
		assertFalse(cuentaCorriente.extraer(100));
		cuentaCorriente.depositar(100);
		cuentaCorriente.setLimiteDescubierto(50);
		assertTrue(cuentaCorriente.extraer(150));
		assertEquals(-50,cuentaCorriente.getSaldo());
		
	}
	
	@Test
	void testTransferir() {
		CuentaCorriente otraCuenta = new CuentaCorriente();
		assertFalse(cuentaCorriente.transferirACuenta(100, otraCuenta));
		cuentaCorriente.depositar(100);
		assertTrue(cuentaCorriente.transferirACuenta(100, otraCuenta));
		assertEquals(100,otraCuenta.getSaldo());
		assertEquals(0,cuentaCorriente.getSaldo());
	}
}
