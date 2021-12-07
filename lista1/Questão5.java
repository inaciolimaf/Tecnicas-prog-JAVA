package lista1;

import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o número do empregado: ");
		int codigo = leitor.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = leitor.nextInt();
		System.out.print("Digite o ano e ingresso na empresa: ");
		int anoIngresso = leitor.nextInt();
		int anoAtual=2021;
		int idade = anoAtual - anoNascimento;
		int tempotrabalhado = anoAtual - anoIngresso;
		System.out.println("O  tempo trabalhado é " + tempotrabalhado);
		System.out.println("A idade é " + idade);
		if (idade>=65||tempotrabalhado>=30||(idade>=60&&tempotrabalhado>=25)) {
			System.out.println("Requerer aposentadoria");
		}
		else {
			System.out.println("Não requerer");
		}
	}
}
