package lista1;

import java.util.Scanner;

public class Quest�o3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		System.out.print("Digite o n�mero: ");
		numero=leitor.nextInt();
		
		if (numero>0) {
			String numeroStr=""+numero;
			int cont=0;
			
			for(int i=0;i<numeroStr.length();i++) {
				cont+=Integer.parseInt(String.valueOf(numeroStr.charAt(i)));
				// Pega o n�mero na posi��o i(charAt), converte para string e passa para inteiro
			}
			System.out.println("O resultado � "+cont);
		}
		else {
			System.out.println("N�mero inv�lido");
		}
	}
}
