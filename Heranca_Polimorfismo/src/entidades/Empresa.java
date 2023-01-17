package entidades;

public class Empresa extends Conta {
	private double limiteEmprestimo;

	public Empresa() {
		super();
	}

	public Empresa(Integer numero, String titular, double quantia, double limiteEmprestimo) {
		super(numero, titular, quantia);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			quantia += valor - 10; //Utilizando "quantia" da classe Conta após setar como protected.
		}
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		quantia -= 2.0;
	}
}
