package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidadesfixacao.PessoaFisica;
import entidadesfixacao.PessoaJuridica;
import entidadesfixacao.TipoPessoa;

public class Fixacao {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		PessoaFisica pFisica = new PessoaFisica();
		PessoaJuridica pJuridica = new PessoaJuridica();
		List<TipoPessoa> valores = new ArrayList<>();
		List<Double> total = new ArrayList<>();
		System.out.println("Quantos contribuintes serao analisados? ");
		int n = num.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados do #%d contribuinte\n", i + 1);
			System.out.println("Pessoa Fisica ou Juridica? (f/j)");
			char r = num.next().charAt(0);
			if (r == 'f') {
				System.out.print("Insira o nome: ");
				pFisica.setNome(num.next());
				System.out.print("Insira a renda: ");
				pFisica.setRenda(num.nextDouble());
				System.out.print("Insira o gasto com saude: ");
				pFisica.setgSaude(num.nextDouble());

				valores.add(pFisica);
				total.add(pFisica.calcImp());
			} else if (r == 'j') {
				System.out.print("Insira o nome: ");
				pJuridica.setNome(num.next());
				System.out.print("Insira a renda: ");
				pJuridica.setRenda(num.nextDouble());
				System.out.print("Insira o numero de funcionarios: ");
				pJuridica.setnFunc(num.nextInt());

				valores.add(pJuridica);
				total.add(pJuridica.calcImp());
			}
		}
		System.out.println("Taxas pagas: ");
		for (TipoPessoa x : valores) {
			System.out.println(x);
		}
		double tot = 0.0;
		for (Double x : total) {
			tot += x;
		}
		System.out.printf("Total taxas: R$%.2f",tot);
		num.close();
	}
}
