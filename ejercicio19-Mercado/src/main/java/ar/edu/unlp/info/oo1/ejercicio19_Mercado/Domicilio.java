package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

public class Domicilio implements FormaEnvio{
	
	private Mapa mapa;
	private String direccionVendedor;
	private String direccionCliente;
	
	public Domicilio(String direccionVendedor, String direccionCliente) {
		this.mapa = new Mapa();
		this.direccionCliente = direccionCliente;
		this.direccionVendedor = direccionVendedor;
	}
	public double costoEnvio() {
		return mapa.distanciaEntre(direccionVendedor, direccionCliente);
	}
	
	
}
