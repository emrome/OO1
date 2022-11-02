package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.addCarpeta(inbox);
	}
	
	public void addCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir(Email email) {
		this.getInbox().addEmail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		destino.addEmail(email);
		origen.removeEmail(email);
	}
	
	public Email buscar(String texto) {
		return this.getCarpetas().stream()
				.map(carpeta -> carpeta.buscar(texto))
				.filter(Objects::nonNull)
				.findFirst().orElse(null);
	}
	
	public double espacioOcupado() {
		return this.getCarpetas().stream().mapToDouble(Carpeta::espacioOcupado).sum();
	}
	
	public Carpeta getInbox () {
		return inbox;
	}
	
	public List<Carpeta> getCarpetas(){
		return this.carpetas;		
	}
}
