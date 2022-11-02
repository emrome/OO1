package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public double valorActual() {
		long dias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), LocalDate.now());
		double gananciaPorDia = (montoDepositado * porcentajeDeInteresDiario)/100;
		return montoDepositado + (dias * gananciaPorDia);
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	
	public double getMontoDepositado() {
		return montoDepositado;
	}
	
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
}
