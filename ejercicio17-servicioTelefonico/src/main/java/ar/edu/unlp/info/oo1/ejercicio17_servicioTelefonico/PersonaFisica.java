package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;

public class PersonaFisica extends Cliente {
	
	private int DNI;
	
	public PersonaFisica(String nombre, String direccion, String numero, int DNI) {
		super(nombre, direccion, numero);
		this.DNI = DNI;
	}
	
	@Override
	public double calcularMontoTotal(LocalDateTime inicio, LocalDateTime fin) {
		double monto = super.calcularMontoTotal(inicio, fin);
		return monto - (monto * 0.1);
	}
	
	public int getDNI() {
		return DNI;
	}

}
