package entidadesE;

public class FuncionarioTerceirizado extends Funcionario {

	private Double valorAdicional;

	public FuncionarioTerceirizado() {

	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double valorAdicional) {
		super(nome, horas, valorPorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public double Pagamento() {
		double pag = (valorPorHora * horas) + (valorAdicional * 1.10);
		return pag;
	}
}
