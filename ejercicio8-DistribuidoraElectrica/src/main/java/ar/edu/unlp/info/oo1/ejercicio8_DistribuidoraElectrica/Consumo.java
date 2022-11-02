package ar.edu.unlp.info.oo1.ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo (LocalDate fecha, double energiaActiva, double energiaReactiva ) {
		this.fecha=fecha;
		this.consumoEnergiaActiva=energiaActiva;
		this.consumoEnergiaReactiva=energiaReactiva;
	}
	
	public double factorDePotencia() {
		return consumoEnergiaActiva /
				Math.sqrt(
				(Math.pow(this.consumoEnergiaActiva, 2)+ Math.pow(this.consumoEnergiaReactiva, 2))
				);
	}
	
	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getConsumoEnergiaActiva(){
		return consumoEnergiaActiva;
	}
	public double getConsumoEnergiaReactiva(){
		return consumoEnergiaReactiva;
	}
}
