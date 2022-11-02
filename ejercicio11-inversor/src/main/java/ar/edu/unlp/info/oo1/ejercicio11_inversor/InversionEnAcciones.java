package ar.edu.unlp.info.oo1.ejercicio11_inversor;

public class InversionEnAcciones implements Inversion{
	
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadAcciones() {
		return cantidad;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public double valorActual() {
		return cantidad * valorUnitario;
	}

}
