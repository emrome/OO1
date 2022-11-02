package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;

public class Factura {
	
	private Cliente cliente;
	private LocalDateTime fechaFacturacion;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private double montoTotal;
	
	public Factura(Cliente cliente, LocalDateTime fechaFacturacion, LocalDateTime fechaInicio, LocalDateTime fechaFin,
			double montoTotal) {
		this.cliente = cliente;
		this.fechaFacturacion = fechaFacturacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.montoTotal = montoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDateTime getFechaFacturacion() {
		return fechaFacturacion;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
	
	
}
