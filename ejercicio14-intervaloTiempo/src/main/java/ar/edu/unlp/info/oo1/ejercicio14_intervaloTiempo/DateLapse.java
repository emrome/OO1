package ar.edu.unlp.info.oo1.ejercicio14_intervaloTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse extends Date{

	private LocalDate to;
	private LocalDate from;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.getFrom(), this.getTo());
		// return (int) this.getFrom().until(this.getTo(), ChronoUnit.DAYS);
	}

}
