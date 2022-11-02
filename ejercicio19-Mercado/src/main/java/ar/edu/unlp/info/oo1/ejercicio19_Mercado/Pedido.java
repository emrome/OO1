package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

public class Pedido {
	
	private int cantidad;
	private Producto producto;
	private FormaPago pago;
	private FormaEnvio envio;
	
	public Pedido(Producto producto, int cantidad, FormaPago pago, FormaEnvio envio) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.pago = pago;
		this.envio = envio;
	}
	
	public double calcularCostoTotal() {
		double costo = this.producto.getPrecio() * this.getCantidad();
		return pago.calcularPago(costo) + envio.costoEnvio() ;
	}
	
	
	public Producto getProducto() {
		return producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
