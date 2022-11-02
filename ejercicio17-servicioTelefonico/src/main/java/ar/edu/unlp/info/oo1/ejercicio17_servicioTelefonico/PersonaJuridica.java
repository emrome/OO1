package ar.edu.unlp.info.oo1.ejercicio17_servicioTelefonico;

public class PersonaJuridica extends Cliente {
	
	private int CUIT;
	private String tipo;
	
	public PersonaJuridica(String nombre, String direccion, String numero, int CUIT, String tipo) {
		super(nombre, direccion, numero);
		this.CUIT = CUIT;
		this.tipo = tipo;
	}

	public int getCUIT() {
		return CUIT;
	}

	public String getTipo() {
		return tipo;
	}
	
}
