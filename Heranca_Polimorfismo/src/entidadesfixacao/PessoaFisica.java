package entidadesfixacao;

public class PessoaFisica extends TipoPessoa{
	private Double gSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double renda, Double imposto, Double gSaude) {
		super(nome, renda, imposto);
		this.gSaude = gSaude;
	}

	public Double getgSaude() {
		return gSaude;
	}

	public void setgSaude(Double gSaude) {
		this.gSaude = gSaude;
	}

	public Double calcImp() {
		if(renda < 20000) {
			imposto = 0.15;
		} else {
			imposto = 0.25;
		}
		return (renda * imposto) - (gSaude / 2);
	}

	@Override
	public String toString() {
		return nome + ": R$" + calcImp();
	}
	
}
