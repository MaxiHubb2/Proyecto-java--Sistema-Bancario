package ar.edu.unlam.pb2.TestBanco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.Banco;
import ar.edu.unlam.pb2.Cliente;
import ar.edu.unlam.pb2.Cuenta;
import ar.edu.unlam.pb2.Transferencia;

public class bancoPrueba {


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
		
		assertEquals(cuentaEncontrada,cuenta1);
	}
	
	@Test
	public void queSePuedaTransferir() {
		
		Integer IdCliente1 = 1;
		String nombreCliente1 = "Maxi";
		
		Integer IdCliente2 = 2;
		String nombreCliente2 = "Juan";
		
		Cliente cliente1 = new Cliente(IdCliente1, nombreCliente1);
		Cliente cliente2 = new Cliente(IdCliente2, nombreCliente2);
		
		Integer IdCuenta1 = 1;
		Double saldoTotal1 = 1000.0;
		
		Integer IdCuenta2 = 2;
		Double saldoTotal2 = 1000.0;		
		
		Cuenta cuentaSantander = new Cuenta(IdCuenta1,cliente1,saldoTotal1);
		Cuenta cuentaBrubank = new Cuenta(IdCuenta2,cliente2,saldoTotal2);
		
		Transferencia transferencia = new Transferencia();
		
		Double transferenciaEsperada = 2000.0;
		Double montoAtransferir = 1000.0;		
		Double transferenciaRes = transferencia.hacerTransferencia(cuentaSantander,cuentaBrubank , montoAtransferir);
				
		assertEquals(transferenciaEsperada, transferenciaRes);

	}
			
	@Test
	public void queSePuedaTransferirPorId() {

		String nombreDeBanco = "Santander";
		Banco banco = new Banco(nombreDeBanco);
		
		Integer IdCliente1 = 1;
		String nombreCliente1 = "Maxi";
		
		Integer IdCliente2 = 2;
		String nombreCliente2 = "Juan";
		
		Cliente cliente1 = new Cliente(IdCliente1, nombreCliente1);
		Cliente cliente2 = new Cliente(IdCliente2, nombreCliente2);
		
		Integer IdCuenta1 = 1;
		Double saldoTotal1 = 1000.0;
		
		Integer IdCuenta2 = 2;
		Double saldoTotal2 = 1000.0;		
		
		Cuenta cuentaSantander = new Cuenta(IdCuenta1,cliente1,saldoTotal1);
		Cuenta cuentaBrubank = new Cuenta(IdCuenta2,cliente2,saldoTotal2);
		
		banco.agregarCuenta(cuentaBrubank);
		banco.agregarCuenta(cuentaSantander);
		
		Transferencia transferencia = new Transferencia();
		
		Double transferenciaEsperada = 2000.0;
		Double montoAtransferir = 1000.0;		
		
		Double transferenciaRes = transferencia.hacerTransferenciaPorId(banco, cuentaSantander.getId(),cuentaBrubank.getId(),montoAtransferir);
				
		assertEquals(transferenciaRes,transferenciaEsperada);

	}
	
	
	@Test
	public void queDadaUnaCuentaConSaldo1000YOtraCuentaConSaldo200PuedaRealizarseUnaTransferenciaDelSaldoDeLaPrimeraSea900yElSaldoDeLaOtraCuentaSea300() {		
		
		String nombreDeBanco = "Santander";
		Banco banco = new Banco(nombreDeBanco);
		
		Integer IdCliente1 = 1;
		String nombreCliente1 = "Maxi";
		
		Integer IdCliente2 = 2;
		String nombreCliente2 = "Juan";
		
		Cliente cliente1 = new Cliente(IdCliente1, nombreCliente1);
		Cliente cliente2 = new Cliente(IdCliente2, nombreCliente2);
		
		Integer IdCuenta1 = 1;
		Double saldoInicialCuentaSantander = 1000.0;
		
		Integer IdCuenta2 = 2;
		Double saldoInicialCuentaBrubank = 200.0;		
		
		Cuenta cuentaSantander = new Cuenta(IdCuenta1,cliente1,saldoInicialCuentaSantander);
		Cuenta cuentaBrubank = new Cuenta(IdCuenta2,cliente2,saldoInicialCuentaBrubank);
		
		banco.agregarCuenta(cuentaBrubank);
		banco.agregarCuenta(cuentaSantander);
		
		Transferencia transferencia = new Transferencia();
		
		Double montoAtransferir = 100.0;		
		Double saldoEsperadoDeLaCuentaBrubank = 300.0;
		Double saldoObtenidoDelaCuentaBrubank = transferencia.hacerTransferencia(cuentaBrubank,cuentaSantander,montoAtransferir);
		
		assertEquals(saldoEsperadoDeLaCuentaBrubank, saldoObtenidoDelaCuentaBrubank);
	
		
	}
}
