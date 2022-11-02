package ar.edu.unlp.info.oo1.ejercicio3_Bis;

import java.util.ArrayList;
import java.util.List;

public class Balanza{
	private List<Producto> productos;
	
	public Balanza() {
		productos= new ArrayList<Producto>();
	}
	
	public void ponerEnCero() {
		productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket() { 
		Ticket ticket = new Ticket(productos);
		return ticket;
	}
	
	//Getters
	public List<Producto> getProductos(){
		return productos;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	public double getPesoTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
}
