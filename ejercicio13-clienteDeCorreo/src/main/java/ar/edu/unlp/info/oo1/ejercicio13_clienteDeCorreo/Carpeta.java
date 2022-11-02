package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta (String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public void addEmail(Email email) {
		this.getEmails().add(email);
	}
	
	public void removeEmail(Email email) {
		this.getEmails().remove(email);
	}
	
	public Email buscar(String texto) {
		return this.getEmails().stream().filter(email -> email.contiene(texto)).findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
		return this.getEmails().stream().mapToDouble(Email::espacioOcupado).sum();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Email> getEmails(){
		return emails;
	}
}
