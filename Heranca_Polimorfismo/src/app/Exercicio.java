package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidadesE.Funcionario;
import entidadesE.FuncionarioTerceirizado;

public class Exercicio {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		System.out.println("Insira o numero de funcionarios: ");
		int n = num.nextInt();
		List<Funcionario> List = new ArrayList<>();
		FuncionarioTerceirizado funcT = new FuncionarioTerceirizado();
		Funcionario func = new Funcionario();
		for (int i = 0; i < n; i++) {
			System.out.printf("Funcionario #%d dados", i + 1);
			System.out.println("\nFuncionario terceirizado? (s/n)");
			char r = num.next().charAt(0);

			if (r == 's') {
				System.out.print("Insira o nome: ");
				funcT.setNome(num.next());
				System.out.print("Horas trabalhadas: ");
				funcT.setHoras(num.nextInt());
				System.out.print("Valor por hora: ");
				funcT.setValorPorHora(num.nextDouble());
				System.out.println("Valor adicional: ");
				funcT.setValorAdicional(num.nextDouble());

				List.add(funcT);

			} else if (r == 'n') {
				System.out.print("Insira o nome: ");
				func.setNome(num.next());
				System.out.print("Horas trabalhadas: ");
				func.setHoras(num.nextInt());
				System.out.print("Valor por hora: ");
				func.setValorPorHora(num.nextDouble());

				List.add(func);

			} else {
				System.out.println("Opcao invalida!");
			}
		}
		System.out.println("PAGAMENTOS: ");
		for (Funcionario x : List) {
			System.out.println(x.toString());
		}

		num.close();
	}
}
