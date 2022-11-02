package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(Integer cantidadDeProductos, double pesoTotal, double precioTotal) {
		fecha=LocalDate.now();
		this.cantidadDeProductos=cantidadDeProductos;
		this.pesoTotal=pesoTotal;
		this.precioTotal=precioTotal;
	}
	
	public double impuesto() {
		return (this.precioTotal*21)/100;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
}

