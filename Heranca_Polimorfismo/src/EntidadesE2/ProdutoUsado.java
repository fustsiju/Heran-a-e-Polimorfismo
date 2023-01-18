package EntidadesE2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date prodData;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsado() {

	}

	public ProdutoUsado(String nome, Double price, Date prodData) {
		super(nome, price);
		this.prodData = prodData;
	}

	public Date getProdData() {
		return prodData;
	}

	public void setProdData(Date prodData) {
		this.prodData = prodData;
	}

	@Override
	public String priceTag() {
		return nome + " (Usado)" + " R$ " + price + " (Data de producao: " + sdf.format(prodData) + ")";
	}
}
