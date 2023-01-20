package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EntidadesE3.Circulo;
import EntidadesE3.Forma;
import EntidadesE3.Retangulo;
import entidadeE3.enums.Cores;

public class Exercicio3 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		List<Forma> form = new ArrayList<>();
		Retangulo ret = new Retangulo();
		Circulo cir = new Circulo();
		System.out.print("Informe a quantidade de formas: ");
		int q = num.nextInt();

		for (int i = 0; i < q; i++) {
			System.out.printf("Informe os dados da forma #%d", i + 1);
			System.out.print("Retangulo ou Circulo? (r/c)");
			char r = num.next().charAt(0);
			System.out.print("Cor: (PRETO/VERMELHO/AZUL) ");
			Cores cores = Cores.valueOf(num.next());
			if (r == 'r') {
				System.out.print("Insira a largura: ");
				ret.setLargura(num.nextDouble());
				System.out.print("Insira a altura: ");
				ret.setAltura(num.nextDouble());
				ret.area();

				form.add(ret);

			} else if (r == 'c') {
				System.out.print("Insira o raio: ");
				cir.setRaio(num.nextDouble());
				cir.area();
				
				form.add(cir);
			} else {
				System.out.println("Nao temos essa forma em nosso sistema!");
			}
		}
		System.out.println("TAMANHO DA AREA DAS FORMAS");
		for(Forma forma : form) {
			System.out.println(forma.area());
		}
		num.close();
	}
}
