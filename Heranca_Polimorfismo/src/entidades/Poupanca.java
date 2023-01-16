package entidades;

public class Poupanca extends Conta {
	private double taxaJuros;

	public Poupanca() {

	}
	
	public Poupanca(Integer numero, String titular, double quantia, double taxaJuros) {
		super(numero, titular, quantia);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizaSaldo(double valor) {
		quantia += quantia * taxaJuros;
	}
	
}
