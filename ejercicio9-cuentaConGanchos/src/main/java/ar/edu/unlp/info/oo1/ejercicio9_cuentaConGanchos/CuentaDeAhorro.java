package ar.edu.unlp.info.oo1.ejercicio9_cuentaConGanchos;

public class CuentaDeAhorro extends Cuenta{

	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() >= (monto *1.02);
	}
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}

	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto * 1.02);
	}
	
	
	
}
