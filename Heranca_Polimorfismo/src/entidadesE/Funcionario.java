package entidadesE;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private String nome;
	protected Integer horas;
	protected Double valorPorHora;

	List<Funcionario> List = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double Pagamento() {
		return valorPorHora * horas;
	}

	@Override
	public String toString() {
		return nome + " - " + Pagamento();
	}

}
