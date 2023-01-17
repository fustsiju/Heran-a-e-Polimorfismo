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
		
		//Testes com Override
		Conta conta6 = new Conta(1005, "João", 1000);
		conta6.saque(200.0);
		System.out.println(conta6.getQuantia());
		
		Conta conta7 = new Poupanca(1006, "Maria", 1000, 0.01);
		conta7.saque(200);
		System.out.println(conta7.getQuantia());
		
		Conta conta8 = new Empresa(1007, "Art", 1000, 500);
		conta8.saque(200);
		System.out.println(conta8.getQuantia());
		
		num.close();
	}
}
