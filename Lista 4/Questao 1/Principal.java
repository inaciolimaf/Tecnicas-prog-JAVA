package Questao1;

import java.util.Scanner;

public class Principal {
	public static float lerFloat(){
	        Scanner leitor = new Scanner(System.in);
	        return leitor.nextFloat();
	}
    public static String lerString(){
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
	public static void main(String[] args) {
		System.out.print("Digite o nome do primeiro empregado: ");
		String nome = lerString();
		System.out.print("Digite o sobrenome do segundo empregado: ");
		String sobrenome = lerString();
		System.out.print("Digite o salário do primeiro empregado: ");
		float salario = lerFloat();
		Empregado empregado1 = new Empregado(nome, sobrenome, salario);
		System.out.print("Digite o nome do segundo empregado: ");
		String nome2 = lerString();
		System.out.print("Digite o sobrenome do segundo empregado: ");
		String sobrenome2 = lerString();
		System.out.print("Digite o salário do segundo empregado: ");
		float salario2 = lerFloat();
		Empregado empregado2 = new Empregado(nome2, sobrenome2, salario2);
		System.out.print("O empregado 1 é ");
		empregado1.mostrarInformacoes();
		System.out.print("O empregado 2 é ");
		empregado2.mostrarInformacoes();
		empregado1.aumentaSalario10();
		empregado2.aumentaSalario10();
		System.out.println("Depois do aumento o resultado fica para o empregado 1 fica: ");
		empregado1.mostrarInformacoes();
		System.out.println("Depois do aumento o resultado fica para o empregado 2 fica: ");
		empregado2.mostrarInformacoes();
	}
}
