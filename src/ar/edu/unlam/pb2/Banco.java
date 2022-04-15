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

	public Cuenta buscarCuentaPorId(Integer id) {

		for(int i = 0; i<cuentas.size(); i++){
			if( this.cuentas.get(i).getId().equals(id))
				return this.cuentas.get(i);
		}
//		for(Cuenta cuenta:cuentas){
//			if(cuentas.getId().equals(id)){
//				return cuenta;
//			}
//		}
		
		return null;
	}
	
	

	
	
}
