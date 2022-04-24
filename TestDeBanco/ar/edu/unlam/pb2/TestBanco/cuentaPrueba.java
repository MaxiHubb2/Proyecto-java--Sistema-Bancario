package ar.edu.unlam.pb2.TestBanco;

import static org.junit.Assert.assertEquals;

import ar.edu.unlam.pb2.Cliente;
import ar.edu.unlam.pb2.Cuenta;

public class cuentaPrueba {

	public void queDadaUnaCuentaConSaldo1000AlExtraer300SuSaldoSera700() {

		Integer IdCliente1 = 1;
		String nombreCliente1 = "Maxi";
		
		Cliente cliente1 = new Cliente(IdCliente1, nombreCliente1);
		
		Integer IdCuenta1 = 1;
		Double saldoInicialCuenta1 = 1000.0;
		
		Cuenta cuentaSantander = new Cuenta(IdCuenta1,cliente1,saldoInicialCuenta1);
		
		Boolean extraccionExitosa = cuentaSantander.extraer(300);
		Double saldoEsperadoLuegoDeLaExtraccion = 700.0;
		Double saldoActual = cuentaSantander.getSaldoTotal();
	
		
		assertEquals(saldoEsperadoLuegoDeLaExtraccion,saldoActual);
	}	
}
