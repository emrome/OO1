package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioTelefonico {
	
	private List<String> numerosDisponibles;
	private List<Cliente> clientes;
	
	public ServicioTelefonico() {
		this.numerosDisponibles = new ArrayList<String>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public Cliente altaPersonaJuridica(String nombre, String direccion, int CUIT, String tipo) {
		String numero = asignarNumero();
		Cliente cliente = new PersonaJuridica(nombre, direccion, numero, CUIT, tipo);
		clientes.add(cliente);
		return cliente;
	}
	
	public Cliente altaPersonaFisica(String nombre, String direccion, int DNI) {
		String numero = asignarNumero();
		Cliente cliente = new PersonaFisica(nombre, direccion, numero, DNI);
		clientes.add(cliente);
		return cliente;
	}
	
	public void agregarNumero(String numero) {
		numerosDisponibles.add(numero);
	}
	
	private String asignarNumero() {
		String numero = numerosDisponibles.get(0);
		numerosDisponibles.remove(numero);
		return numero;
	}
	
	private Cliente buscarCliente(String numero) {
		return clientes.stream().filter(c -> c.numeroCoincide(numero)).findAny().orElse(null);
	}
	
	public Llamada registrarLlamadaLocal(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor) {
		Cliente cliente = buscarCliente(nroEmisor);
		return cliente.registrarLlamadaLocal(fechaHora, duracion, nroReceptor);
	}

	public Llamada registrarLlamadaInterurbana(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor, double distancia) {
		Cliente cliente = buscarCliente(nroEmisor);
		return cliente.registrarLlamadaInterurbana(fechaHora, duracion, nroReceptor, distancia);
	}

	public Llamada registrarLlamadaInternacional(LocalDateTime fechaHora, int duracion, String nroEmisor, String nroReceptor, String origen, String destino) {
		Cliente cliente = buscarCliente(nroEmisor);
		return cliente.registrarLlamadaInternacional(fechaHora, duracion, nroReceptor, origen, destino);
	}
	
	public List<String> getNumerosDisponibles(){
		return numerosDisponibles;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
}
