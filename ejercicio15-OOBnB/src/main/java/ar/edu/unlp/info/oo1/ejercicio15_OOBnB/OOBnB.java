package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OOBnB {
	
	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	
	public OOBnB() {
		this.usuarios = new ArrayList<Usuario>();
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public Usuario registrarUsuario (String nombre, String direccion, int dni ) {
		Usuario usuario = new Usuario (nombre,direccion,dni);
		this.usuarios.add(usuario);
		return usuario;
	}
	
	public Propiedad registrarPropiedad(String nombre, String descripcion, double precioPorNoche, String direccion, Usuario propietario) {
		Propiedad propiedad = new Propiedad(nombre,descripcion,precioPorNoche,direccion, propietario);
		this.propiedades.add(propiedad);
		return propiedad;
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse periodo){
		return propiedades.stream()
				.filter(propiedad -> propiedad.estaDisponible(periodo))
				.collect(Collectors.toList());
	}
	
	public Reserva hacerReserva (Propiedad propiedad, DateLapse periodo, Usuario inquilino) {
		if (propiedad.estaDisponible(periodo)) {
			Reserva reserva = new Reserva (periodo, propiedad, inquilino);
			propiedad.hacerReserva(reserva);
			return reserva;
		}
		return null;
	}
	
	public double calcularIngresosPropietario(Usuario propietario, DateLapse periodo) {
		return 0;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}
	
	public List<Reserva> obtenerReservasUsuario(Usuario usuario){
		return propiedades.stream().flatMap(p -> p.reservasUsuario(usuario).stream()).collect(Collectors.toList());
	}
	
	public double calcularIngresosPropietario(Usuario usuario, LocalDate inicio, LocalDate fin) {
		DateLapse periodo = new DateLapse(inicio, fin);
		return propiedades.stream().filter(p -> p.esPropietario(usuario)).mapToDouble(p -> p.calcularIngresos(periodo)).sum();
	}
	
}
