package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;

public abstract class Llamada {
	
	private LocalDateTime fechaHora;
	private int duracion;
	private String nroEmisor;
	private String nroReceptor;
	
	public Llamada(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor) {
		this.fechaHora = fechaHora;
		this.duracion = duracion;
		this.nroEmisor = nroEmisor;
		this.nroReceptor = nroReceptor;
	}
	
	public boolean incluidaEnPeriodo(LocalDateTime inicio, LocalDateTime fin) {
		return this.getFechaHora().isAfter(inicio) && this.getFechaHora().isBefore(fin)
				||this.getFechaHora().equals(fin) || this.getFechaHora().equals(inicio);
	}
	
	public abstract double calcularCosto();

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getNroEmisor() {
		return nroEmisor;
	}

	public String getNroReceptor() {
		return nroReceptor;
	}
	
}
