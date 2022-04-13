package ar.edu.unlam.pb2;

public class Cuenta {

	private Integer id;
	private Cliente cliente;
	private Double saldoInicial;

	public Cuenta(Integer id, Cliente cliente, Double saldoInicial) {

		this.id = id;
		this.cliente = cliente;
		this.saldoInicial = saldoInicial;
	
	}

}
