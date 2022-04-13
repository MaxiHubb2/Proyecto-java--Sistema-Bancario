package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaBanco {

	@Test
	
	public void testQueSePuedaAgregarUnaCuenta(){
		
		String nombreBanco = "Brubank";
		Banco banco = new Banco(nombreBanco);
		
		Integer Id = 1;
		Double saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre = "Maxi";
		
		Cliente cliente = new Cliente(idCliente , nombre);
		
		Cuenta cuenta = new Cuenta(Id , cliente, saldoInicial);
		
		banco.agregarCuenta(cuenta);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = banco.obtenerCantidadDeCuentas();
		
		assertEquals(valorEsperado,valorObtenido);
	
	}
	
	@Test
	public void queSePuedaEncontrarUnaCuentaPorIdEnUnBanco(){
		
		String nombreBanco = "Brubank";
		Banco banco = new Banco(nombreBanco);
		
		Integer Id = 1;
		Double saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre = "Maxi";
		
		Cliente cliente = new Cliente(idCliente , nombre);
		
		Cuenta cuenta = new Cuenta(Id , cliente, saldoInicial);
	
		Cuenta cuenta1 = new Cuenta(Id , cliente, saldoInicial);
		
		banco.agregarCuenta(cuenta);
		Cuenta cuentaEncontrada = banco.buscarCuentaPorId(Id);
		
		assertEquals(cuentaEncontrada,cuenta);
	}
}
