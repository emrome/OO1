package ar.edu.unlp.info.oo1.ejercicio14_intervaloTiempo;

import java.time.LocalDate;

public class DateLapseA extends Date{
	
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseA(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getTo() {
		return this.getFrom().plusDays(this.sizeInDays());
	}

	public LocalDate getFrom() {
		return this.from;
	}

	public int sizeInDays() {
		return this.sizeInDays;
	}


}
