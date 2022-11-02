package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.edu.unlp.info.oo1.ejercicio14_intervaloTiempo.Date;

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

	public boolean overlaps(DateLapse anotherDateLapse) {

		return this.getFrom().isBefore(anotherDateLapse.getFrom()) && this.getTo().isAfter(anotherDateLapse.getFrom())
				|| this.getFrom().isBefore(anotherDateLapse.getTo()) && this.getTo().isAfter(anotherDateLapse.getTo())
				|| this.getFrom().isBefore(anotherDateLapse.getFrom()) && this.getTo().isAfter(anotherDateLapse.getTo())
				|| this.getFrom().isAfter(anotherDateLapse.getFrom()) && this.getTo().isBefore(anotherDateLapse.getTo())
				;
	}
	
	public boolean fechaInicioEsPosterior(LocalDate fecha) {
		return this.getFrom().isAfter(fecha);
	}

}
