package lista1;

import java.util.Scanner;

public class Quest�o6 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o lado A:");
		int a= leitor.nextInt();
		System.out.println("Digite o lado B:");
		int b= leitor.nextInt();
		System.out.println("Digite o lado C:");
		int c= leitor.nextInt();
		if ((a < b+c) && (b <a+b) && (c <a+b)) {
			if ((a==b)&&(b==c)) {
				System.out.println("Tri�ngulo Equil�tero");
			}
			else if ((a==b)||(b==c)||(a==c)) {
				System.out.println("Tri�ngulo Is�sceles");
			}
			else {
				System.out.println("Tri�ngulo Escaleno");
			}
		}
		else {
			System.out.println("N�o e poss�vel formar um tri�ngulo");
		}
	}
}
