package lista1;

import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int frequencia;
		float nota1, nota2, notafinal, media2notas, mediafinal;
		System.out.print("Digite a frequência: ");
		frequencia = leitor.nextInt();
		System.out.print("Digite a nota1: ");
		nota1 = leitor.nextFloat();
		System.out.print("Digite a nota2:");
		nota2 = leitor.nextFloat();
		System.out.print("Digite a nota final:");
		notafinal = leitor.nextFloat();
		media2notas = (nota1+nota2)/2;
		mediafinal = (nota1+nota2+notafinal)/3;
		if ((frequencia>=75)
				&&(nota1>=3)
				&&(nota2>=3)
				&&((media2notas)>7||(mediafinal)>5)) {
			System.out.println("O aluno foi aprovado");
		}
		else {
			System.out.println("O aluno não foi aprovado");
		}
	}
}
