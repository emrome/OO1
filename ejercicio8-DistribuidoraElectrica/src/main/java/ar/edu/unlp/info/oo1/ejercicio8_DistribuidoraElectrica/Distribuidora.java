package ar.edu.unlp.info.oo1.ejercicio8_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora (double precioKWh) {
		this.precioKWh=precioKWh;
		this.usuarios=new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario usuario) {
		if (!this.usuarios.contains(usuario))
			this.usuarios.add(usuario);
	}
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public double getPrecioKW() {
		return precioKWh;
	}
	
	public void precioKWh (double precio) {
		precioKWh=precio;
	}
	
	public List<Factura> facturar(){
		return usuarios.stream()
			   .map(usuario -> usuario.facturarEnBaseA(this.getPrecioKW()))
			   .collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return usuarios.stream()
				.mapToDouble(usuario -> usuario.ultimoConsumoActiva())
				.sum();
	}
	
}
