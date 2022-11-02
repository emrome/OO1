package ar.edu.unlp.info.oo1.ejercicio14_intervaloTiempo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	DateLapse lapso1;
	DateLapse lapso2;
	DateLapseA lapso3;
	
	@BeforeEach
	void setUp() throws Exception {
		lapso1 = new DateLapse(LocalDate.of(2022, 01, 01),LocalDate.of(2022, 01, 25)) ;
		lapso2 = new DateLapse(LocalDate.of(2022, 11, 01),LocalDate.of(2022, 11, 20)) ;
		lapso3 = new DateLapseA(LocalDate.of(2020, 8, 20), 20);
	}
	
    @Test
    public void testSizeInDays() {
        assertEquals(24, lapso1.sizeInDays());
        assertEquals(19, lapso2.sizeInDays());
        assertEquals(20, lapso3.sizeInDays());
    }
    
    @Test
    void testIncludesDate() {
    	assertTrue(lapso1.includesDate(LocalDate.of(2022, 01, 10)));
    	assertFalse(lapso1.includesDate(LocalDate.of(2020, 12, 24)));
    	
    	assertTrue(lapso2.includesDate(LocalDate.of(2022, 11, 10)));
    	assertFalse(lapso2.includesDate(LocalDate.of(2022, 11, 24)));
    	
    	assertTrue(lapso3.includesDate(LocalDate.of(2020, 8, 25)));
    	assertFalse(lapso3.includesDate(LocalDate.of(2020, 7, 24)));
    	
    }
}
