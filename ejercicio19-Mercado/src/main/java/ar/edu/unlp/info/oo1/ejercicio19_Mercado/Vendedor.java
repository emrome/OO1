package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
	
	private List<Producto> productos;
	
	public Vendedor(String nombre, String direccion) {
		super(nombre, direccion);
		this.productos = new ArrayList<Producto>();
	}
	
	public Producto registrarPedido(String nombre, String descripcion, double precio, int stock) {
		Producto producto =  new Producto (nombre,descripcion,precio,stock);
		this.productos.add(producto);
		return producto;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public Producto buscarProducto(String nombre) {
		return this.productos.stream().filter(p -> p.nombreCoincide(nombre)).findFirst().orElse(null);
	}
	
	
}
