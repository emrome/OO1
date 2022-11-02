package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	

	public double costo() {
		return cantidad * costoUnitario;
	}
	
	//Setters
	public Item cantidad(int cantidad) {
		this.cantidad=cantidad;
		return this;
	}
	public Item costoUnitario(double costo) {
		costoUnitario=costo;
		return this;
	}
	public Item detalle(String detalle) {
		this.detalle=detalle;
		return this;
	}
	
	//Getters
	public int getCantidad() {
		return cantidad;
	}	
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	public String getDetalle() {
		return detalle;
	}
	

}
