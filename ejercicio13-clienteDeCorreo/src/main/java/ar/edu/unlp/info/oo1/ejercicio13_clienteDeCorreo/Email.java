package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email (String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public double espacioOcupado() {
		return this.getTitulo().length() +
				this.getCuerpo().length() +
				this.getAdjuntos().stream().mapToDouble(Archivo::tamaño).sum();
	}
	
	public boolean contiene (String texto){
		return this.getTitulo().contains(texto) || this.getCuerpo().contains(texto);
	}
	
	public void adjuntar(Archivo adjunto) {
		this.getAdjuntos().add(adjunto);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> getAdjuntos (){
		return adjuntos;
	}
}
