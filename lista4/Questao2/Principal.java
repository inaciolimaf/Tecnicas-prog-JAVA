package Questao2;

import java.util.Scanner;

/*
2) Crie uma classe chamada Fatura que possa ser utilizada por uma loja de
suprimentos de informática para representar uma fatura de um item vendido
na loja. Uma fatura deve incluir as seguintes informações como atributos:
a. O número do item faturado
b. A descrição do item
c. A quantidade comprada do item
d. O preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por
item não for positivo ele deve ser configurado como 0.0. Forneça um método
set e um método get para cada variável de instância. Além disso, forneça um
método chamado getValorFatura que calcula o valor da fatura (isso é,
multiplicar a quantidade pelo preço por item) e depois retorna o valor como um
double.
*/
public class Principal {
	public static float lerFloat(){
        Scanner leitor = new Scanner(System.in);
        return leitor.nextFloat();
	}
	public static String lerString(){
	    Scanner leitor = new Scanner(System.in);
	    return leitor.nextLine();
	}
	public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
	public static void main(String[] args) {
		System.out.print("Digite o numero do item: ");
		int numero = lerInt();
		System.out.print("Digite a descricao do item: ");
		String descricao = lerString();
		System.out.print("Digite a quantidade comprada do item: ");
		int quantidade = lerInt();
		System.out.print("Digite o preco unitario do item: ");
		float preco = lerFloat();
		Fatura fatura1 = new Fatura(numero, descricao, quantidade, preco);
		System.out.println("O valor da fatura � "+ fatura1.getValorFatura());
	}
}
