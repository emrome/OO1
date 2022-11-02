package ar.edu.unlp.info.oo1.ejercicio5_geneologiaSalvaje;

import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String id) {
		identificador=id;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.tieneAncestro(madre,unMamifero) || this.tieneAncestro(padre,unMamifero);	
	}
	
	private boolean tieneAncestro(Mamifero actual,Mamifero unMamifero) {
		return (actual!=null) && (actual.equals(unMamifero) || actual.tieneComoAncestroA(unMamifero));
	}
	
	//Setters
	public void setIdentificador(String id) {
		identificador=id;
	}
	
	public void setEspecie(String especie) {
		this.especie=especie;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		fechaNacimiento=fecha;
	}
	public void setMadre(Mamifero madre) {
		this.madre=madre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre=padre;
	}
	
	//Getters
	public String getIdentificador() {
		return identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (madre!=null) 
			return madre.getMadre();
		else return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if (madre!=null) 
			return madre.getPadre();
		else return null;
	}

	public Mamifero getAbuelaPaterna() {
		if (padre!=null) 
			return padre.getMadre();
		else return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (padre!=null) 
			return padre.getPadre();
		else return null;
	}
}
