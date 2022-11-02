package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuadrado implements Figura{
	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double valor) {
		lado=valor;
	}
	
	public double getArea() {
		return Math.pow(lado ,2);
	}

	public double getPerimetro() {
		return lado * 4;
	}

}
