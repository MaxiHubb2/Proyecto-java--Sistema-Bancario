package ar.edu.unlam.pb2;

public class Transferencia {
	
	public Transferencia() {
	

	}
	
	public Double hacerTransferencia( Cuenta cuenta1, Cuenta cuentaDestino, Double montoATransferir) {
		
		Double saldoDeLaPrimerCuentaMenosElMontoATransferir = cuenta1.getSaldoTotal()-montoATransferir;
		cuenta1.setSaldoTotal(saldoDeLaPrimerCuentaMenosElMontoATransferir);
		
		Double saldoDeLaSegundaCuentaMasElMontoATransferir = cuentaDestino.getSaldoTotal()+montoATransferir;
		cuentaDestino.setSaldoTotal(saldoDeLaSegundaCuentaMasElMontoATransferir);
		
		return cuentaDestino.getSaldoTotal();
	}

	
	public Double hacerTransferenciaPorId(Banco banco, Integer idCliente1, Integer idCliente2, Double montoAtransferir) {
		// TODO Auto-generated method stub
		
		Cuenta cuentaEncontradaQueVaATransferir = banco.buscarCuentaPorId(idCliente2);
		Cuenta cuentaEncontradaDestino = banco.buscarCuentaPorId(idCliente1);
		Double saldoActualizadoCuentaQueVaATransferir = cuentaEncontradaQueVaATransferir.getSaldoTotal()-montoAtransferir;
		cuentaEncontradaQueVaATransferir.setSaldoTotal(saldoActualizadoCuentaQueVaATransferir);
		Double saldoActualizadoCuentaDestino = cuentaEncontradaDestino.getSaldoTotal() + montoAtransferir;
		
		return saldoActualizadoCuentaDestino;
	}

}
