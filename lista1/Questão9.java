package lista1;

import java.util.Scanner;

public class Questão9 {
	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		System.out.print("Qual regra você escolhe: ");
		String resp= leitor.nextLine();
		int cont=0;
		if (resp.intern()=="a") {
			while (cont<1000) {
				cont+=1;
				if (cont%4==0||cont%5==0) {
					System.out.println(cont);
				}
			}
		}
		else if (resp.intern()=="b") {
			while (cont<1000) {
				cont+=1;
				if (cont%2==0) {
					System.out.println(cont);
				}
			}
		}
		else if (resp.intern()=="c") {
			while (cont<1000) {
				cont+=1;
				if (cont%2==1) {
					System.out.println(cont);
				}
			}
		}
		else if (resp.intern()=="d") {
			int NumPrimos;
			while (cont<1000) {
				cont+=1;
				NumPrimos=0;
				for(int i = 1;i<=cont;i++) {
					if(cont%i==0) {
						NumPrimos+=1;
					}
				}
				if(NumPrimos==2) {
					System.out.println(cont);
				}
			}
		}
	}

}

