package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

public class Producto {
	
	private Vendedor vendedor;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	
	public Producto(String nombre, String descripcion, double precio, int stock) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	
	public boolean nombreCoincide(String nombre) {
		return this.getNombre().equals(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void actualizarStock(int cantidad) {
		stock =- cantidad;
	}
	
	public int getStock() {
		return stock;
	}

	public boolean hayStock(int cantidad) {
		return this.getStock()>= cantidad;
	}
	
	public String getDireccionVendedor() {
		return this.vendedor.getDireccion();
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
