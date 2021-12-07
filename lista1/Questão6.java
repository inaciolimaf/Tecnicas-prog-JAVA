package lista1;

import java.util.Scanner;

public class Questão6 {
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
				System.out.println("Triângulo Equilátero");
			}
			else if ((a==b)||(b==c)||(a==c)) {
				System.out.println("Triângulo Isósceles");
			}
			else {
				System.out.println("Triângulo Escaleno");
			}
		}
		else {
			System.out.println("Não e possível formar um triângulo");
		}
	}
}
