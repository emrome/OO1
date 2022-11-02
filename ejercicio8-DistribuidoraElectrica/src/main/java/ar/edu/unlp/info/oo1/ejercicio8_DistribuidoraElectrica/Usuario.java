package ar.edu.unlp.info.oo1.ejercicio8_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario (String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public void agregarFactura(Factura factura) {
		this.facturas.add(factura);
	}
	
	public double ultimoConsumoActiva() {
		Consumo consumo = this.ultimoConsumo();
		if( consumo != null) 
			return consumo.getConsumoEnergiaActiva();
		else
			return 0; 
	}
	
	
	public Consumo ultimoConsumo () {
		return consumos.stream()
		.max((c1, c2)-> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	//Retorna factura del último consumo
	public Factura facturarEnBaseA(double precioKWh) {
		
		Consumo consumo = this.ultimoConsumo();
		
		if(consumo == null) {
			return new Factura(0, 0, this);
		}
		
		double descuento = 0;
		if (consumo.factorDePotencia() > 0.8) 
			descuento = 10;
	
		return new Factura(consumo.costoEnBaseA(precioKWh), descuento, this);

	}
	
	//Getters
	public List<Factura> facturas(){
		return facturas;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
}
