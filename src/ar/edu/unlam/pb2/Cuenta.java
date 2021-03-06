package ar.edu.unlam.pb2;

public class Cuenta {

	private Integer id;
	private Cliente cliente;
	private Double saldoTotal;
	public double dineroAEnviar;

	public Cuenta(Integer id, Cliente cliente, Double saldoTotal) {

		this.id = id;
		this.cliente = cliente;
		this.saldoTotal = saldoTotal;
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public Double montoATransferir( Double montoATransferir) {
		return montoATransferir+saldoTotal;
	}

	
	public Double montoARecibir(Double transferenciaRes) {
		return transferenciaRes+saldoTotal;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Boolean extraer(int montoAExtraer) {
		// TODO Auto-generated method stub
		boolean sePudoExtraer = false;
		
		
		if(montoAExtraer<=saldoTotal) {
			sePudoExtraer = true;
		}
		return sePudoExtraer;
	}

	

	
}
