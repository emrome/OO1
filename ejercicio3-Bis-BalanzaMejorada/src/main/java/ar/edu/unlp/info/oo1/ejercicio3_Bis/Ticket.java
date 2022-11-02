package ar.edu.unlp.info.oo1.ejercicio3_Bis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	List<Producto> productos;
	
	public Ticket(List <Producto> productos) {
		fecha=LocalDate.now();
		this.productos = new ArrayList<Producto>(productos);
	}
	
	public double impuesto() {
		return (this.getPrecioTotal()*21)/100;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		return (productos.stream().mapToDouble(producto -> producto.getPrecio()).sum());
	}
	
	public double getPesoTotal() {
		return (productos.stream().mapToDouble(producto -> producto.getPeso()).sum());
	}
}

