package ar.edu.unlp.info.oo1.ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	

	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		fecha = LocalDate.now();
		this.montoEnergiaActiva=montoEnergiaActiva;
		this.descuento=descuento;
		this.usuario=usuario;
	}
	
	public double montoTotal() {
		return montoEnergiaActiva - (montoEnergiaActiva * descuento)/100;
	}
	
	//Getters
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public double getDescuento() {
		return descuento;
	}
}
