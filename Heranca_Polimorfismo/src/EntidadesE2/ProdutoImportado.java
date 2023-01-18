package EntidadesE2;

public class ProdutoImportado extends Produto {
	private Double taxa;

	public ProdutoImportado() {

	}

	public ProdutoImportado(String nome, Double price, Double taxa) {
		super(nome, price);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String priceTag() {
		return nome + " R$ " + price + " (Taxa: R$" + taxa + ")";
	}
}
