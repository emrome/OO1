package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo implements Figura{
	
	private double radio;
	
	public double getRadio() {
		return radio;
	}
	
	public double getDiametro() {
		return radio*2;
	}
	
	public void setRadio(double valor) {
		radio=valor;
	}
	
	public void setDiametro(double valor) {
		radio=valor/2;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2); 
	}

	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

}
