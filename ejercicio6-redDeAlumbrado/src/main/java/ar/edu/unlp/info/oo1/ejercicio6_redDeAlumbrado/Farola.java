package ar.edu.unlp.info.oo1.ejercicio6_redDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {

	private boolean estado;
	private List <Farola> neighbors;

	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		estado=false;
		neighbors= new ArrayList <Farola>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!neighbors.contains(otraFarola)) {
			neighbors.add(otraFarola);
			otraFarola.getNeighbors().add(this);
		}
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors(){
		return neighbors;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(!this.isOn()) {
			estado=true;
			neighbors.stream().forEach(farola -> farola.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.isOn()) {
			estado=false;
			neighbors.stream().forEach(farola -> farola.turnOff());
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return estado;
	}

}
