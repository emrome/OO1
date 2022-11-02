package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;

public class LlamadaInterurbana extends Llamada {
	
	private double distancia;
	
	public LlamadaInterurbana(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor, double distancia) {
		super(fechaHora, duracion, nroEmisor, nroReceptor);
		this.distancia = distancia;
	}
	
	@Override
	public double calcularCosto() {
		if (this.getDistancia()<100) {
			return (this.getDuracion()*2) + 5;
		}
		if ((this.getDistancia()>=100)&&(this.getDistancia()<=500)) {
			return (this.getDuracion()*2.5) + 5;
		}
		return (this.getDuracion()*3) + 5;
	}
	
	public double getDistancia() {
		return distancia;
	}

}
