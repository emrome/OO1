package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Mercado {

	private List<Vendedor> vendedores;
	private List<Cliente> clientes;
	
	public Mercado() {
		vendedores = new ArrayList<Vendedor>();
		clientes = new ArrayList<Cliente>();
	}
	
	public Vendedor registrarVendedor(String nombre, String direccion) {
		Vendedor vendedor = new Vendedor(nombre,direccion);	
		this.vendedores.add(vendedor);
		return vendedor;
	}
	
	public Cliente registrarCliente(String nombre, String direccion) {
		Cliente cliente = new Cliente(nombre,direccion);	
		this.clientes.add(cliente);
		return cliente;
	}
	

	public Cliente buscarCliente(String nombre) {
		return clientes.stream().filter(c -> c.nombreEsIgual(nombre)).findAny().orElse(null);
	}
	
	public Vendedor buscarVendedor(String nombre) {
		return vendedores.stream().filter(u -> u.nombreEsIgual(nombre)).findAny().orElse(null);
	}
	
	public List<Vendedor> getVendedores(){
		return vendedores;
	}
	
	public List<Cliente> getClientes(){
		return clientes;
	}
}
