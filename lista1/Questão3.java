package lista1;

import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		System.out.print("Digite o número: ");
		numero=leitor.nextInt();
		
		if (numero>0) {
			String numeroStr=""+numero;
			int cont=0;
			
			for(int i=0;i<numeroStr.length();i++) {
				cont+=Integer.parseInt(String.valueOf(numeroStr.charAt(i)));
				// Pega o número na posição i(charAt), converte para string e passa para inteiro
			}
			System.out.println("O resultado é "+cont);
		}
		else {
			System.out.println("Número inválido");
		}
	}
}
