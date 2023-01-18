package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EntidadesE2.Produto;
import EntidadesE2.ProdutoImportado;
import EntidadesE2.ProdutoUsado;

public class Exercicio2 {
	public static void main(String args[]) throws ParseException {
		Scanner num = new Scanner(System.in);

		Produto prodC = new Produto();
		ProdutoImportado prodI = new ProdutoImportado();
		ProdutoUsado prodU = new ProdutoUsado();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> list = new ArrayList<>();

		System.out.println("Quantos produtos serao registrados?");
		int n = num.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Insira os dados do produto #%d\n", i + 1);
			System.out.println("O produto é comum, usado ou importado? (c/u/i)");
			char r = num.next().charAt(0);
			if (r == 'c') {
				System.out.print("Nome: ");
				prodC.setNome(num.next());
				System.out.print("Preco: ");
				prodC.setPrice(num.nextDouble());

				list.add(prodC);
			} else if (r == 'u') {
				System.out.print("Nome: ");
				prodU.setNome(num.next());
				System.out.print("Preco: ");
				prodU.setPrice(num.nextDouble());
				System.out.println("Data de fabricacao: (DD/MM/YYYY)");
				prodU.setProdData(sdf.parse(num.next()));

				list.add(prodU);
			} else if (r == 'i') {
				System.out.print("Nome: ");
				prodI.setNome(num.next());
				System.out.print("Preco: ");
				prodI.setPrice(num.nextDouble());
				System.out.println("Taxa de producao: ");
				prodI.setTaxa(num.nextDouble());

				list.add(prodI);
			} else {
				System.out.println("Essa opcao não é valida!");
			}
		}

		System.out.println("PRICE TAGS: ");

		for (Produto prod : list) {
			System.out.println(prod.priceTag());
		}

		num.close();
	}
}
