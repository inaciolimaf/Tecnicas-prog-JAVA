package lista1;

import java.util.Scanner;

public class Questão7 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de linhas: ");
		int linha = leitor.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int coluna = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Digite qual alternativa mostrar:");
		String resp = leitor.nextLine();
		// Lê o valor das linhas, colunas e qual alternativa mostar
		if(resp.intern()=="a") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i==j) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="b") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i+j==linha-1) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="c") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i>j) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="d") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i>=j) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="e") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i<j) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="f") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i<=j) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="g") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i==0||i==linha-1||j==0||j==coluna-1) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="h") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (j%2==0) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="i") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i%2==0) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="j") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i+j==linha-1||i==j) {
						System.out.print("*");
					}
					else {
						System.out.print("%");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="k") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if ((i==0&&j==0)
							||(i==0&&j==coluna-1)
							||(j==0&&i==linha-1)
							||(i==linha-1&&j==coluna-1)) {
						System.out.print("%");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		else if(resp.intern()=="l") {
			for(int i=0;i<linha;i++) {
				for(int j=0; j<coluna; j++) {
					if (i==0||i==1||j==0||j==1||i==linha-1||i==linha-2
							||j==coluna-1||j==coluna-2) {
						System.out.print("*");
					}
					else {
						System.out.print("%");
					}
				}
				System.out.println("");
			}
		}
	}
}
