package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;

public class LlamadaInternacional extends Llamada {
	
	private String paisOrigen;
	private String paisDestino;
	
	public LlamadaInternacional(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor,
			String paisOrigen, String paisDestino) {
		super(fechaHora, duracion, nroEmisor, nroReceptor);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}
	
	@Override
	public double calcularCosto() {
		if((this.getFechaHora().getHour()>=8)&&(this.getFechaHora().getHour()<20)){
			return (4 * this.getDuracion());
		}
		return (3 * this.getDuracion());
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public String getPaisDestino() {
		return paisDestino;
	}
	
}
