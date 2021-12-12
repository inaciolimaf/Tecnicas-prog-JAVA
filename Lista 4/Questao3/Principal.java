package Questao3;

import java.util.Scanner;

/*
3) Crie um programa que tenha uma classe produto constituída de nome, preço
e quantidade. Implemente um método chamado “comprarProduto”. Este
método quando chamado deverá modificar uma variável do produto
indicando que o produto foi comprado. Para cada produto informado escreva
o nome do produto comprado e o valor total a ser pago, considerando que
são oferecidos descontos segundo o valor do produto conforme a tabela
abaixo:
a. Até R$ 100: sem desconto
b. De R$ 100 a R$ 200: 10% de desconto
c. De R$ 200 a R$ 500: 20% de desconto
d. Acima de R$500: 25% de desconto
*/

public class Principal {
	public static String lerString(){
	    Scanner leitor = new Scanner(System.in);
	    return leitor.nextLine();
	}
	public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
	public static void main(String[] args) {
		System.out.print("Digite o nome do produto: ");
		String nome = lerString();
		System.out.print("Digite o preco do produto: ");
		int preco = lerInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = lerInt();
		Produto produto1 = new Produto(nome, preco, quantidade);
		produto1.comprarProduto();
	}
}
