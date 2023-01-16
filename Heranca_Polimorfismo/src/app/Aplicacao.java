package app;

import java.util.Scanner;

import entidades.Conta;
import entidades.Empresa;
import entidades.Poupanca;

public class Aplicacao {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		Conta conta = new Conta(1001, "Fulvio", 0);
		Empresa empresa = new Empresa(1002, "Pices", 0, 500);

		// UPCASTING

		Conta conta1 = empresa;
		Conta conta2 = new Empresa(1003, "Pices2", 0, 300);
		Conta conta3 = new Poupanca(1004, "Bovs", 0, 0.01);

		// DOWNCASTIG

		Empresa conta4 = (Empresa) conta2;
		conta4.emprestimo(100.0);

		// Empresa conta5 = (Empresa) conta3;
		if (conta3 instanceof Empresa) {
			Empresa conta5 = (Empresa) conta3;
			conta5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}

		if (conta3 instanceof Poupanca) {
			Poupanca conta5 = (Poupanca) conta3;
			conta5.atualizaSaldo(0);
			System.out.println("Atualizado!");
		}

		num.close();

	}
}
