package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	
	private DateLapse periodo;
	private DateLapse periodo2;
	private DateLapse periodo3;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		periodo = new DateLapse(LocalDate.of(2022, 10, 1),LocalDate.of(2022, 10, 20));
		periodo2 = new DateLapse(LocalDate.of(2022, 9, 25),LocalDate.of(2022, 10, 5));
		periodo3 = new DateLapse(LocalDate.of(2022, 11, 1),LocalDate.of(2022, 11, 10));
	}

	@Test
	void testOverlaps() {
		assertTrue(periodo.overlaps(periodo2));
		assertTrue(periodo2.overlaps(periodo));
		assertFalse(periodo3.overlaps(periodo));
	}
	
	@Test 
	void testSizeInDays() {
		assertEquals(19,periodo.sizeInDays());
		assertEquals(10,periodo2.sizeInDays());
		assertEquals(9,periodo3.sizeInDays());
	}

}
