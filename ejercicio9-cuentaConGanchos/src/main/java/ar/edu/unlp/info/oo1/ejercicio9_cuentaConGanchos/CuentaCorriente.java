package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	
	public double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		limiteDescubierto = 0;
	}
	
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}
	
	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() + limiteDescubierto) >= monto;
	}
}
