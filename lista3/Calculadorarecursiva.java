package lista3;

import java.util.Scanner;

public class Calculadorarecursiva {
	private static void menu() {
		System.out.print("Digite qual opera��o voc� quer fazer: ");
		int resposta = LerInt();
		switch (resposta) {
		case 1:
			questao1();
			break;
		case 2:
			questao2();
			break;
		case 3:
			questao3();
			break;
		case 4:
			questao4();
			break;
		case 5:
			questao5();
			break;
		case 6:
			questao6();
			break;
		case 7:
			questao7();
			break;
		case 8:
			questao8();
			break;
		case 9:
			questao9();
			break;
		case 10:
			questao10();
			break;
		case 11:
			questao11();
			break;
		case 12:
			questao12();
			break;
		case 13:
			questao13();
			break;
		default:
			System.out.println("Valor inv�lido");
			break;
		}
	}
	public static int LerInt() {
		Scanner leitor = new Scanner(System.in);
		int resposta = leitor.nextInt();
		return resposta;
	}
	public static int[] criaVetor(int num_elementos) {
		int[] NovoVetor = new int[num_elementos];
		int x=30, y=150;
		for (int i = 0; i < num_elementos; i++) {
			NovoVetor[i] = (int)((Math.random() * y) - x);
			// Preenchendo o vetor
		}
		System.out.print("O vetor �: [");
		imprimeVetorCom0(NovoVetor);
		System.out.println("]");
		return NovoVetor;
	}
	public static void imprimeVetorCom0(int[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+", ");
		}
		System.out.print("]");
	}
	public static void questao1() {
		/*1) Fa�a uma fun��o recursiva que gere uma sequ�ncia de n�meros de 1 a 50.*/
		sequencia1a50(1);
	}
	public static void questao2() {
		/*2) Fa�a um fun��o recursiva que some todos elementos de um vetor.*/
		int[] vetor = criaVetor(10);
		System.out.println("A soma  �: "+ somaVetor(vetor, 10));
	}
	public static void questao3() {
		/*3) Fa�a uma fun��o recursiva de incremento. Dado um n�mero inteiro qualquer,
		menor que 100, a fun��o recursiva dever� incrementar o n�mero em uma
		unidade at� que o n�mero seja igual a 100.*/
		System.out.print("Digite o n�mero: ");
		int num = LerInt();
		completaAte100(num);
	}
	public static void questao4() {
		/*4) Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo par N e
		imprima todos os n�meros pares de 0 at� N em ordem decrescente.*/
		System.out.print("Digite o n�mero par: ");
		int num = LerInt();
		if (num%2==0) {
			completaPar(num);
		}
		else {
			System.out.println("Digite um n�mero par");
		}
	}
	private static void questao5() {
		/*5) Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo �mpar N e
		retorne o fatorial duplo desse n�mero. O fatorial duplo � definido como o
		produto de todos os n�meros naturais �mpares de 1 at� algum n�mero natural
		�mpar N. Assim, o fatorial duplo de 5 �: 5!! = 1 * 3 * 5 = 15.*/
		System.out.print("Digite um n�mero para calcular o fatorial:");
		int num = LerInt();
		System.out.print(fatorialDuplo(num));
	}
	public static void questao6() {
		/*6) Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo N e retorne
		o superfatorial desse n�mero. O superfatorial de um n�mero N � definida pelo
		produto dos N primeiros fatoriais de N. Assim, o superfatorial de 4 �: sf(4) = 1!
		* 2! * 3! * 4! = 288.*/
		System.out.print("Digite o n�mero: ");
		int num = LerInt();
		System.out.println("O resultado � " + superfatorial(num));
	}
	public static void questao7() {
		/*7) Fa�a uma fun��o recursiva para calcular os n�meros de Pell. Os n�meros de
		Pell s�o definidos pela seguinte recurs�o:
		
		p(n) = 0 se n = 0;
		p(n) = 1 se n = 1;
		p(n) = 2p(n-1)+ p(n-2) se n*/
		System.out.print("Digite o n�mero: ");
		int num = LerInt();
		System.out.println("O resultado � " + numPell(num));
	}
	public static void questao8() {
		/*8) A s�rie de Ricci difere da s�rie de Fibonacci porque os dois primeiros termos
		s�o fornecidos pelo usu�rio. Os demais termos s�o gerados da mesma forma
		que a s�rie de Fibonacci. Fa�a um programa que imprima os N primeiros
		termos da s�rie de Ricci e a soma dos termos impressos, sabendo-se que
		para existir esta s�rie ser�o necess�rios pelo menos tr�s termos.*/
		System.out.print("Digite o primeiro n�mero: ");
		int primeiroNum = LerInt();
		System.out.print("Digite o segundo n�mero: ");
		int segundoNum = LerInt();
		System.out.print("Digite a quantidade de elementos: ");
		int quantNum = LerInt();
		if (quantNum<3) {
			System.out.println("Valor inv�lido");
		}
		else {
			System.out.println(primeiroNum);
			System.out.println(segundoNum);
			int soma = Ricci(primeiroNum, segundoNum, quantNum-2)+primeiroNum+segundoNum;
			// o -2 � porque j� foram imprimidos 2 valores
			System.out.println("A soma � "+ soma);
		}
	}
	public static void questao9() {
		/*9) A s�rie de Fetuccine � gerada da seguinte forma: os dois primeiros termos
		s�o fornecidos pelo usu�rio; a partir da�, os termos s�o gerados com a soma
		ou subtra��o dos dois termos anteriores, ou seja:
		
		Crie uma fun��o recursiva que gere a s�rie Fetuccine at� o N-�simo termo. O
		usu�rio dever� informar qual � o N-�simo termo.*/
		System.out.println("Digite o primeiro termo: ");
		int primeiroNum = LerInt();
		System.out.println("Digite o segundo termo: ");
		int segundoNum = LerInt();
		System.out.println("Digite o N: ");
		int N = LerInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(Fetuccine(primeiroNum, segundoNum, i));
		}
	}
	public static void questao10() {
		/*10) Seja a seguinte s�rie: 1, 4, 9, 16, 25, 36, ... Escreva um programa que
		gere esta s�rie at� o N-�simo termo. Este N-�simo termo � digitado pelo
		usu�rio.*/
		System.out.print("Digite a quantidade de termos: ");
		int n = LerInt();
		quadrado(1, n);
	}
	public static void questao11() {
		/*11) Seja a seguinte s�rie: 1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, ... Escreva um
		programa que seja capaz de gerar os N termos dessa s�rie. Esse n�mero N
		deve ser lido do teclado.*/
		System.out.print("Digite a quantidade de termos: ");
		int quant = LerInt();
		sequencia(1, quant);
	}
	public static void questao12() {
		/*12) Fa�a uma fun��o recursiva que receba um n�mero N e retorne o N-�simo
		termo da sequ�ncia de Tetranacci. Os n�meros Tetranacci iniciam com quatro
		termos pr�-determinados e a partir da� todos os demais n�meros s�o obtidos
		pela soma dos quatro n�meros anteriores. Os primeiros n�meros Tetranacci
		s�o: 0, 0, 0, 1, 1, 2, 4, 8, 15, 29, 56, 108, 208...*/
		System.out.print("Digite a quantidade de termos: ");
		int quant = LerInt();
		for (int i = 1; i <=quant; i++) {
			System.out.println(Tetranacci(i));
		}
	}
	public static void questao13() {
		System.out.print("Digite o valor de x:");
		int x = LerInt();
		System.out.print("Digite o valor de y:");
		int y = LerInt();
		System.out.print("Ovalor de mdc �: "+mdc(x,y));
	}
	public static void sequencia1a50(int num) {
		System.out.println(num);
		if (num!=50) {
			sequencia1a50(num+1);
		}
	}
	public static int somaVetor(int[] vetor, int tamanhoVetor) {
		if (tamanhoVetor<1) {
			return 0;
		}
		return (vetor[tamanhoVetor-1]+somaVetor(vetor, tamanhoVetor-1));
		
	}
	public static void completaAte100(int num) {
		System.out.println(num);
		if (num<100) {
			completaAte100(num+1);
		}
	}
	public static void completaPar(int num) {
		System.out.println(num);
		if (num>0) {
			completaPar(num-2);
		}
	}
	public static int fatorialDuplo(int num) {
		if (num<=0) {
			return 1;
		}
		return num*fatorialDuplo(num-2);
	}
	public static int fatorial(int num) {
		if (num<=0) {
			return 1;
		}
		return num*fatorial(num-1);
	}
	public static int superfatorial(int num) {
		if (num<=0) {
			return 1;
		} 
		return fatorial(num)*superfatorial(num-1);
	}
	public static int numPell(int num) {
		if (num==0) {
			return 0;
		}
		else if (num==1) {
			return 1;
		}
		else {
			return 2*numPell(num-1)+ numPell(num-2);
		}
	}
	public static int Ricci(int primeiroNum, int segundoNum, int quantNum) {
		int aux;
		aux = segundoNum;
		segundoNum= primeiroNum+segundoNum;
		primeiroNum = aux;
		if (quantNum==0) {
			return 0;
		}
		System.out.println(segundoNum);
		return segundoNum+Ricci(primeiroNum, segundoNum, quantNum-1);
	}
	public static int Fetuccine(int primeiroNum, int segundoNum, int posicao) {
		if (posicao==1) {
			return primeiroNum;
		}
		if (posicao == 2) {
			return segundoNum;
		}
		if (posicao%2 ==0) {
			return Fetuccine(primeiroNum, segundoNum, posicao-1) - Fetuccine(primeiroNum, segundoNum, posicao-1);
		}
		return Fetuccine(primeiroNum, segundoNum, posicao-1) + Fetuccine(primeiroNum, segundoNum, posicao-1);
	}
	public static void quadrado(int num, int limite) {
		System.out.println((int)Math.pow(num, 2));
		if (num<limite) {
			quadrado(num+1, limite);
		}
	}
	public static void sequencia(int num, int limite) {
		if (num<=limite/3) {
			System.out.println(num);
			System.out.println(num+3);
			System.out.println(num+3);
			sequencia(num+1, limite);
		}
		else {
			if(limite%3==1) {
				System.out.println(num);
			}
			else if (limite%3==2){
				System.out.println(num);
				System.out.println(num+3);
			}
		}
	}
	public static int Tetranacci(int num) {
		if (num==1||num==2||num==3) {
			return 0;
		}
		else if (num==4) {
			return 1;
		}
		return Tetranacci(num-1)+Tetranacci(num-2)+Tetranacci(num-3)+Tetranacci(num-4);
	}
	public static int mdc(int x, int y) {
		if (y==0) {
			return x;
		}
		else {
			return mdc(y, x%y);
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
