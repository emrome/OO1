package ar.edu.unlp.info.oo1.ejercicio19_Mercado;

public class SeisCoutas implements FormaPago{
	
	public double calcularPago(double monto) {
		return monto + (monto * 0.2);
	}
}
