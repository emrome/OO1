package ar.edu.unlp.info.oo1.ejercicio15_OOBnB;

import java.time.LocalDate;

public class Reserva {
	
	private DateLapse periodo;
	private Propiedad propiedad;
	private Usuario inquilino;
	
	public Reserva (DateLapse periodo, Propiedad propiedad,Usuario inquilino) {
		this.periodo = periodo;
		this.propiedad = propiedad;
		this.inquilino = inquilino;
	}
	
	public boolean overlaps (DateLapse otroPeriodo) {
		return this.periodo.overlaps(otroPeriodo);
	}
	
	public double calcularPrecio () {
		return propiedad.getPrecioPorNoche() * periodo.sizeInDays();
	}
	
	public void eliminarReserva() {
		if(periodo.fechaInicioEsPosterior(LocalDate.now())) {
			propiedad.elimnarReserva(this);
		}
	}
	
	public Usuario getInquilino() {
		return inquilino;
	}
	
	public boolean esInquilino(Usuario usuario) {
		return this.getInquilino().equals(usuario);
	}
	
}
