package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		this.fecha= LocalDate.now();
		this.items=new ArrayList<Item>();
	}
	public Presupuesto cliente (String cliente) {
		this.cliente=cliente;
		return this;
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(items -> items.costo()).sum();
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	
}
