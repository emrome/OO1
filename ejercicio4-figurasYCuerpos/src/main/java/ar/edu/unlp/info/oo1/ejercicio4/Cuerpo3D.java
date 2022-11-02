package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D {
	
	private Figura caraBasal;
	private double altura;
	
	public void setAltura(double valor) {
		this.altura=valor;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal=cara;
	}
	
	public Figura getCaraBasal() {
		return caraBasal;
	}
	public double getVolumen() {
		return caraBasal.getArea() * altura; 
	}
	
	public double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + 
			   caraBasal.getPerimetro() * altura;
		
	}
}
