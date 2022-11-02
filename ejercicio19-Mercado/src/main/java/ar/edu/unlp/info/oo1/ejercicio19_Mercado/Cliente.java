package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String direccion) {
		super(nombre, direccion);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public Pedido crearPedido(Producto producto, int cantidadSolicitada, FormaPago pago, FormaEnvio envio) {
		if(producto.hayStock(cantidadSolicitada)) {
			Pedido pedido = new Pedido(producto,cantidadSolicitada, pago, envio);
			producto.actualizarStock(cantidadSolicitada);
			this.pedidos.add(pedido);
			return pedido;
		}
		return null;
	}
	
	public List<Pedido> getPedidos(){
		return pedidos;
	}
}
