package entidadesfixacao;

public class PessoaJuridica extends TipoPessoa{
	private Integer nFunc;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double renda, Double imposto, Integer nFunc) {
		super(nome, renda, imposto);
		this.nFunc = nFunc;
	}

	public Integer getnFunc() {
		return nFunc;
	}

	public void setnFunc(Integer nFunc) {
		this.nFunc = nFunc;
	}
	
	public Double calcImp() {
		if(nFunc < 10) {
			imposto = 0.16;
		} else {
			imposto = 0.14;
		}
		return renda * imposto;
	}

	@Override
	public String toString() {
		return nome + ": R$" + calcImp();
	}
	
}
