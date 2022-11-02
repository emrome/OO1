package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Propiedad {
	
	private String nombre;
	private String direccion;
	private String descripcion;
	private double precioPorNoche;
	private Usuario propietario;
	private List<Reserva> reservas;

	
	public Propiedad (String nombre, String descripcion, double precioPorNoche, String direccion, Usuario propietario) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.propietario = propietario;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		return this.reservas.stream().noneMatch(reserva -> reserva.overlaps(periodo));
	}
	
	public List<Reserva> reservasUsuario (Usuario usuario){
		return reservas.stream().filter(r -> r.esInquilino(usuario)).collect(Collectors.toList());
	}
	
	public double calcularIngresos(DateLapse periodo) {
		return reservas.stream().filter(reserva -> reserva.overlaps(periodo)).mapToDouble(Reserva::calcularPrecio).sum(); //CONSULTAR
	}
	
	public boolean esPropietario(Usuario usuario) {
		return this.getPropietario().equals(usuario);
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public Usuario getPropietario() {
		return propietario;
	}
	
	public void hacerReserva (Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void elimnarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	
}
