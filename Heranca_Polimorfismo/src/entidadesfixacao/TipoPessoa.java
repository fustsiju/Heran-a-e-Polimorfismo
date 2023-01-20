package entidadesfixacao;

public class TipoPessoa {
	protected String nome;
	protected Double renda;
	protected Double imposto;
		
	public TipoPessoa() {
		
	}

	public TipoPessoa(String nome, Double renda, Double imposto) {
		this.nome = nome;
		this.renda = renda;
		this.imposto = imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	
}
