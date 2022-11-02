package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

	private String nombre;
	private String direccion;
	private String numero;
	private List<Llamada> llamadas;

	public Cliente(String nombre, String direccion, String numero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = numero;
		this.llamadas = new ArrayList<Llamada>();
	}

	public Llamada registrarLlamadaLocal(LocalDateTime fechaHora, int duracion, String nroReceptor) {
		Llamada llamada = new LlamadaLocal(fechaHora, duracion, this.getNumero(), nroReceptor);
		llamadas.add(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaInterurbana(LocalDateTime fechaHora, int duracion, String nroReceptor, double distancia) {
		Llamada llamada = new LlamadaInterurbana(fechaHora, duracion, this.getNumero(), nroReceptor, distancia);
		llamadas.add(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaInternacional(LocalDateTime fechaHora, int duracion, String nroReceptor, String origen, String destino) {
		Llamada llamada = new LlamadaInternacional(fechaHora, duracion, this.getNumero(), nroReceptor, origen, destino);
		llamadas.add(llamada);
		return llamada;
	}
	
	public double calcularMontoTotal(LocalDateTime inicio, LocalDateTime fin) {
		return llamadas.stream().filter(l -> l.incluidaEnPeriodo(inicio,fin)).mapToDouble(Llamada::calcularCosto).sum();
	}
	
	public Factura facturarLlamadas(LocalDateTime inicio, LocalDateTime fin) {
		double monto = this.calcularMontoTotal(inicio, fin);
		return new Factura (this, LocalDateTime.now(), inicio, fin, monto);
	}
	
	public boolean numeroCoincide(String otroNumero) {
		return this.getNumero().equals(otroNumero);
	}
	
	public String getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	
}
