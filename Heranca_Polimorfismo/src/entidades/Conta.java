package entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected double quantia; //Protected para utilizar a quantia em uma subclasse extendida.
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, double quantia) {
		this.numero = numero;
		this.titular = titular;
		this.quantia = quantia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getQuantia() {
		return quantia;
	}
	
	public void saque(double valor) {
		quantia -= valor + 5.0;
	}
	
	public void deposito(double valor) {
		quantia += valor;
	}
}
