package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;

public class LlamadaLocal extends Llamada {
	
	public LlamadaLocal(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor) {
		super(fechaHora, duracion, nroEmisor, nroReceptor);
	}
	
	@Override
	public double calcularCosto() {
		return this.getDuracion();
	}

}
