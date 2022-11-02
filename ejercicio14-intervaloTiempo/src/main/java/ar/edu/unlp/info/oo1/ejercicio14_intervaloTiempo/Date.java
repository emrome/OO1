package ar.edu.unlp.info.oo1.ejercicio14_intervaloTiempo;

import java.time.LocalDate;

public abstract class Date {
	
	public abstract LocalDate getTo();

	public abstract LocalDate getFrom();

	public abstract int sizeInDays();
	
	public boolean includesDate(LocalDate date) {
		return (date.isAfter(this.getFrom()) && date.isBefore(this.getTo()) )
				|| date.equals(this.getTo()) 
				|| date.equals(this.getFrom());
	}
	
}
