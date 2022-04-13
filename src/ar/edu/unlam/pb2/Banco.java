package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Banco {

	private String nombreBanco = " ";
	private ArrayList <Cuenta> cuentas = new ArrayList<>();
	
	public Banco(String nombreBanco) {

		this.nombreBanco  = nombreBanco;
		this.cuentas = new ArrayList<>();
	}

	public void agregarCuenta(Cuenta cuenta) {
		this.cuentas.add(cuenta);		
	}

	public Integer obtenerCantidadDeCuentas() {
		return this.cuentas.size();
	}

	
	
}
