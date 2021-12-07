package lista2;

import java.util.Scanner;


public class Calculadora {
	public static int pesquisa(int num, int[] vetor) {
		/*1) Pesquisa: retornar se um dado elemento está dentro do vetor e retornar sua
		posição no vetor caso esteja;*/
		int[] resultado = new int[vetor.length];
		int contador_de_aparicoes = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]==num) {
				return i;
			}
		}
		return -1;
		// Se não for encontrado nenhum elemento retorna uma posição inválida
	}
	public static int pesquisa_por_indice(int indice, int[] vetor) {
		/*2) Pesquisa por índice: retornar o elemento pertencente ao dado índice
		informado do vetor;*/
		return vetor[indice];
	}
	public static int[][] separacao(int[] vetor) {
		/*3) Separação: retornar dois vetores um apenas com números positivos e outro
		apenas com números negativos;*/
		
		int[] numeros_negativos = new int[vetor.length], numeros_positivos = new int[vetor.length];
		int quantidade_de_positivos = 0, quantidade_de_negativos = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]<0) {
				numeros_negativos[quantidade_de_negativos] = vetor[i];
				quantidade_de_negativos++;
			}
			else if (vetor[i]>0) {
				numeros_positivos[quantidade_de_positivos] = vetor[i];
				quantidade_de_positivos++;
			}
		}
		
		int[][] resultado = {numeros_negativos, numeros_positivos};
		// Retorna o resultado com os numeros negativos e os positivos
		return resultado;
	}
	public static int somatorio(int[] vetor) {
		/*4) Somatório: retornar a soma de todos elementos do vetor;*/
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma+=vetor[i];
		}
		return soma;
	}
	public static double produto(int[] vetor) {
		/*5) Produto: retornar a multiplicação de todos elementos do vetor;*/
		double multiplicacao=1;
		for (int i = 0; i < vetor.length; i++) {
			multiplicacao *= vetor[i];
		}
		return multiplicacao;
	}
	public static int[] produto_escalar(int[] vetor1, int[] vetor2) {
		/*6) Produto escala: retornar o produto escalar de dois vetores, para calcular o
		produto escalar utilize a forma seguinte:
		x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn*/
		int[] resultado= new int[vetor1.length];
		for (int i = 0; i < vetor2.length; i++) {
			resultado[i]= vetor1[i]*vetor2[i];
		}
		return resultado;
		
	}
	public static int[] completa_com_zero(int[] vetor, int numero_preencher_zero) {
		/*7) Completa com zero: um número pertencente ao vetor deve ser informado.
		Retornar o vetor atualizado para que todos os elementos depois da posição
		do número informado seja preenchido com zero;
		Exemplo: [1,2,5,6,7]
		Número informado: 5
		Resposta: [1,2,0,0,0]*/
		int[] resultado = vetor;
		for (int i = pesquisa(numero_preencher_zero, vetor); i < vetor.length; i++) {
			// Usa outra função para encontrar a partir de que posição preeencher com 0
			resultado[i]=0;
		}
		return resultado;
	}
	public static int[] quadrado(int[] vetor) {
		/*8) Quadrado: retornar o quadrado dos componentes do vetor, armazenando o
		resultado em outro vetor;*/
		int[] vetor_quadrado = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			vetor_quadrado[i] = vetor[i]*vetor[i];
		}
		return vetor_quadrado;
	}
	private static double media(int[] vetor) {
		/*9) Média: retornar a média dos elementos do vetor;*/
		int soma=0;
		double media;
		for (int i = 0; i < vetor.length; i++) {
			soma+=vetor[i];
		}
		media = soma/vetor.length;
		return media;
	}
	public static int maximo(int[] vetor) {
		/*10) Max: retornar o maior elemento do vetor;*/
		int maximo=0;
		for (int i = 0; i < vetor.length; i++) {
			if (i==0) {
				maximo = vetor[i];
			}
			else if (vetor[i]>maximo) {
				maximo=vetor[i];
			}
		}
		return maximo;
		
	}
	public static int minimo(int[] vetor) {
		/*11) Min: retornar o menor elemento do vetor;*/
		int minimo=0;
		for (int i = 0; i < vetor.length; i++) {
			if (i==0) {
				minimo=vetor[i];
			} 
			else if (vetor[i]<minimo) {
				minimo=vetor[i];
			}
		}
		return minimo;
	}
	public static int moda(int[] vetor) {
		/*12) Moda unimodal: retornar o elemento que mais aparece no vetor;*/
		int moda=0, quantVezesElemento=0, quantVezesModa=0;
		for (int i = 0; i < vetor.length; i++) {
			quantVezesElemento=0;
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i]==vetor[j]) {
					quantVezesElemento++;
					// Conta a quantidade que um elemento aparece no vetor
				}
			}
			if (quantVezesElemento>quantVezesModa) {
				// Se a quantidade nesse laço for maior do que as dos laços anteriores
				quantVezesModa=quantVezesElemento;
				moda=vetor[i];
				// Salva o  elemento no valor da moda
			}
		}
		return moda;
	}
	public static int mediana(int[] vetor) {
		/*13) Mediana: retornar o elemento que separa a metade maior e a metade
		menor no vetor;*/
		vetor=ordenacao(vetor);
		// Usa outra função para ordenar o vetor
		int tamanho_do_vetor=vetor.length;
		if (tamanho_do_vetor%2==0) {
			// Se o tamanho do vetor for par
			int meio_vetor=tamanho_do_vetor/2;
			return (vetor[meio_vetor-1]+vetor[meio_vetor])/2;
		}
		else {
			return vetor[tamanho_do_vetor/2];
		}
	}
	private static double desvio_padrao(int[] vetor) {
		/*14) Desvio padrão: retornar o desvio padrão de um vetor m e a média do
		vetor e números de elementos do vetor;*/
		int media_do_vetor = (int)media(vetor), soma=0;
		// Pela fórmula calculando o somatório
		for (int i = 0; i < vetor.length; i++) {
			soma+=Math.pow((vetor[i]-media_do_vetor), 2);
			// Calculando a soma
		}
		double desvioPadrao = (soma)/(vetor.length-1);
		desvioPadrao = Math.sqrt(desvioPadrao);
		// Calculado o a outra parte do desvio padrão
		return desvioPadrao;
	}
	private static int[] uniao(int[] vetor1, int[] vetor2) {
		/*15) União: são informados dois vetores e os vetores deverão ser unidos em
		apenas um vetor;*/
		int[] vetor_uniao = new int[vetor1.length+vetor2.length];
		for (int i = 0; i < vetor1.length; i++) {
			vetor_uniao[i]=vetor1[i];
		}
		// Adicionando o vetor 1
		for (int i = 0; i < vetor2.length; i++) {
			vetor_uniao[i+vetor2.length]=vetor2[i];
		}
		// Adicionando o vetor 2
		return vetor_uniao;
	}
	public static int[] inversao(int[] vetor) {
		/*16) Inversão: retornar um vetor de ordem inversa. Desta forma, o primeiro
		elemento passa ser o último elemento do vetor, o segundo elemento passa
		ser o penúltimo, assim, sucessivamente;*/
		int[] vetor_invertido = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			vetor_invertido[i]=vetor[vetor.length-i-1];
			// Inverte cada elemento do vetor
		}
		return vetor_invertido;
	}
	public static int[] intersecao(int[] vetor1, int[] vetor2) {
		/*17) Interseção: são informados dois vetores e os elementos pertencentes
		nos dois vetores deverão ser retornados;*/
		int[] intercessao = new int[0];
		int quantidade_intercessoes=0;
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor1[i]==vetor2[j]) {
					int[] Novointercessao = new int[quantidade_intercessoes+1];
					// Cria um novo vetor com 1 posição a mais que o primeiro
					for (int k = 0; k < intercessao.length; k++) {
						Novointercessao[k]=intercessao[k];
						// Prenche o novo vetor com os elementos que já estavam no primeiro
					}
					intercessao=Novointercessao;
					// O novo vetor fica igual o primeiro
					
					intercessao[quantidade_intercessoes]=vetor1[i];
					quantidade_intercessoes++;
					// Adiciona a intercessão ao vetor
				}
			}
		}
		if (quantidade_intercessoes==0) {
			int[] vetor_vazio= {};
			return vetor_vazio;
			// Se não for encontrado nenhum elemento retorna um vetor vazio
		}
		return intercessao;
	}
	public static void diferencaA(int[] a, int[] b) {
		/*18) Diferença-A: são informados dois vetores (A e B) e o programa deverá
		mostrar todos elementos que estão no vetor A e não então no vetor B;*/
		boolean mostrar_vetor;
		System.out.print("O resultado é [");
		for (int i = 0; i < a.length; i++) {
			mostrar_vetor=true;
				for (int j = 0; j < b.length; j++) {
					if (a[i]==b[j]) {
						mostrar_vetor=false;
						// Se for encontrado algum elemento que está no vetor a e no vetor b
						// Não será mostado
					}
				}
			if (mostrar_vetor) {
				System.out.print(a[i]+", ");
			}
		}
		System.out.println("]");
	}
	public static int[] ordenacao(int[] vetor) {
		/*19) Ordenação: ordenar o elementos do vetor de forma ascendente;*/
		int aux=0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i; j < vetor.length; j++) {
				if (vetor[i]>vetor[j]) {
					aux=vetor[i];
					vetor[i]=vetor[j];
					vetor[j]=aux;
				}
			}
		}
		return vetor;
	}
	public static int[] primos(int[] vetor) {
		/*20) Primos: retornar os elementos do vetor que são primos;*/
		int[] resultado = new int[vetor.length];
		int NumPrimos, quant_primos_encontrados=0;
		for (int num = 0; num < 150; num++) {
			NumPrimos=0;
			for(int i = 1;i<=num;i++) {
				if(num%i==0) {
					NumPrimos+=1;
				}
			}
			if(NumPrimos==2) {
				// Se o valor de num for primo entrarar nesse if
				for (int i = 0; i < resultado.length; i++) {
					// Laço para percorrer o vetor e ver se algum valor primo está nele
					if (num==vetor[i]) {
						resultado[quant_primos_encontrados]=vetor[i];
						quant_primos_encontrados++;
					}
				}
			}
		}
		if (quant_primos_encontrados==0) {
			int[] vetor_vazio = {};
			return vetor_vazio;
			// Se não for encontrado nenhum elemento, retorna o vetor vazio
		}
		return resultado;
	}
	public static int[] fibonacci(int[] vetor) {
		/*21) Fibonacci: retornar os elementos do vetor que pertencem a série*/
		int[] vetor_fibonacci = new int[vetor.length];
		int primeiroNum=1, segundoNum=1, resultado_fibonacci=0, quant_fibonacci_no_vetor=0;
		while (resultado_fibonacci<=300) {
			// 300 é um ponto de parada para não calcular o fibonacci até o infinito
			resultado_fibonacci = primeiroNum+segundoNum;
			primeiroNum=segundoNum;
			segundoNum=resultado_fibonacci;
			// Parte para calcular a sequência de fibonacci
			for (int i = 0; i < vetor.length; i++) {
				// Laço para ver se o numero da sequência de fibonacci está no vetor e adicioná-lo ao vetor final
				if (vetor[i]==segundoNum) {
					vetor_fibonacci[quant_fibonacci_no_vetor]=vetor[i];
					quant_fibonacci_no_vetor++;
				}
			}
		}
		if (quant_fibonacci_no_vetor==0) {
			int[] vetor_vazio= {};
			return vetor_vazio;
			// Se não encontrar nenhum número, retorna o vetor vazio
		}
		return vetor_fibonacci;
	}
	public static void agrupamento(int[] vetor, int num_agrupamentos) {
		/*22) Agrupamento: deve ser informado um número de agrupamento desejado
		e os elementos devem ser agrupado conforme o número de agrupamento
		informado;*/
		vetor = ordenacao(vetor);
		int tamanho_do_vetor=vetor.length; 
		if (tamanho_do_vetor%num_agrupamentos!=0) {
			System.out.println(tamanho_do_vetor+"não é divisível por "+ num_agrupamentos);
			System.out.println("Tente novamente com um número válido");
		}
		else {
			int tamanho_do_agrupamento=tamanho_do_vetor/num_agrupamentos;
			
			for (int i = 0; i < num_agrupamentos; i++) {
				System.out.print("O vetor "+(i+1)+" é [");
				for (int j = 0; j < tamanho_do_agrupamento; j++) {
					System.out.print(vetor[i*tamanho_do_agrupamento+j]+", ");
				}
				System.out.println("]");
			}
			// Imprime os  agrupamentos
		}
	}
	public static void imprimeVetorSem0(int[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			if ((i!=0)&&(vetor[i]==0)) {
				break;
				// A parte do vetor que não está preeenchida tem o valor 0
				// Se existirem dois 0 um depois do outro, significa que o vetor já chegou no final
				// e já pode para de imprimi-lo
			}
			System.out.print(vetor[i]+", ");
		}
		System.out.print("]");
	}
	public static void imprimeVetorCom0(int[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+", ");
		}
		System.out.print("]");
	}
	public static int[] criaSegundoVetor(int num_elementos) {
		int[] NovoVetor = new int[num_elementos];
		int x=30, y=150;
		System.out.print("O segundo vetor é: [");
		for (int i = 0; i < num_elementos; i++) {
			NovoVetor[i] = (int)((Math.random() * y) - x);
			// Preenchendo o vetor
			System.out.print(NovoVetor[i]+", ");
			// Mostrando o vetor
		}
		System.out.println("]");
		return NovoVetor;
	}
	public static void main(String[] args) {
		int num_elementos, x=30, y=150, qual_questao;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de elementos para o vetor: ");
		num_elementos = leitor.nextInt();
		int vetor[] = new int[num_elementos];
		
		// Preenchendo o vetor
		System.out.print("O vetor é: [");
		for (int i = 0; i < num_elementos; i++) {
			vetor[i] = (int)((Math.random() * y) - x);
			System.out.print(vetor[i]+", ");
			// Mostrando o vetor
		}
		System.out.println("]");
		System.out.print("Digite qual operação você deseja fazer: ");
		qual_questao = leitor.nextInt();
		
		if (qual_questao==1) {
			int num, posicao;
			System.out.print("Qual número você deseja procurar no vetor: ");
			num = leitor.nextInt();
			posicao = pesquisa(num, vetor);
			if (posicao==-1) {
				System.out.println("O elemento não foi encontrado.");
			}
			else {
				System.out.println("O elemento foi encontrado na primeiro na posição " + posicao);
			}
		}
		else if (qual_questao==2) {
			int indice;
			System.out.print("Qual indice você deseja procurar no vetor: ");
			indice = leitor.nextInt();
			System.out.println("O elemento no índice " + indice + " é " + pesquisa_por_indice(indice, vetor));
		}
		else if (qual_questao==3) {
			int resultado[][] = separacao(vetor);
			System.out.print("Os valores negativos são: ");
			imprimeVetorSem0(resultado[0]);
			System.out.print("\nOs valores positivos são: ");
			imprimeVetorSem0(resultado[1]);
		}
		else if (qual_questao==4) {
			System.out.println("O somatório é: "+ somatorio(vetor));
		}
		else if (qual_questao==5) {
			System.out.println("A multiplicação é "+ produto(vetor));
		}
		else if (qual_questao == 6) {
			System.out.println("Criando um novo vetor: ");
			int vetor2[] = criaSegundoVetor(num_elementos);
			System.out.println("]");
			int[] resultado = produto_escalar(vetor, vetor2);
			System.out.print("O resultado é");
			imprimeVetorSem0(resultado);
		}
		else if (qual_questao==7) {
			System.out.print("Qual número você escolhe? ");
			int num = leitor.nextInt();
			int[] vetor_final = completa_com_zero(vetor, num);
			System.out.print("O resultado é");
			imprimeVetorCom0(vetor_final);
		}
		else if (qual_questao==8) {
			int[] resultado = quadrado(vetor);
			System.out.print("O resultado é: ");
			imprimeVetorCom0(resultado);
		}
		else if (qual_questao==9) {
			System.out.println("A média é " + media(vetor));
		}
		else if (qual_questao==10) {
			System.out.println("O valor máximo é " + maximo(vetor));
		}
		else if (qual_questao==11) {
			System.out.println("O valor mínimo é " + minimo(vetor));
		}
		else if (qual_questao==12) {
			System.out.println("O elemento que mais aparece no vetor é " + moda(vetor));
		}
		else if (qual_questao==13) {
			System.out.println("A mediana é " + mediana(vetor));
		}
		else if (qual_questao==14) {
			System.out.println("O desvio padrão é " + desvio_padrao(vetor));
		}
		else if (qual_questao==15) {
			System.out.println("Criando um novo vetor: ");
			int vetor2[] = criaSegundoVetor(num_elementos);
			System.out.println("]");
			System.out.print("O vetor união é: ");
			int[] vetor_uniao = uniao(vetor, vetor2);
			imprimeVetorCom0(vetor_uniao);
		}
		else if (qual_questao==16) {
			int[] resultado = inversao(vetor);
			System.out.print("O vetor invertido é: ");
			imprimeVetorCom0(resultado);
		}
		else if (qual_questao==17) {
			System.out.println("Criando um novo vetor: ");
			int[] vetor2 = criaSegundoVetor(num_elementos);
			int[] resultado = intersecao(vetor, vetor2);
			if (resultado.length==0) {
				System.out.println("Não existe intercessão");
				// Se o tamanho do vetor for 0 não existirá intercessão
			}
			else {
				System.out.print("A intercessão dos dois vetores é: ");
				imprimeVetorCom0(resultado);
			}
		}
		else if (qual_questao==18) {
			System.out.println("Criando um novo vetor: ");
			int vetor2[] = new int[num_elementos];
			
			System.out.print("O segundo vetor é: [");
			for (int i = 0; i < num_elementos; i++) {
				vetor2[i] = (int)((Math.random() * y) - x);
				// Preenchendo o vetor
				System.out.print(vetor2[i]+", ");
				// Mostrando o vetor
			}
			System.out.println("]");
			diferencaA(vetor, vetor2);
		}
		else if (qual_questao==19) {
			int[] resultado =ordenacao(vetor);
			System.out.print("O vetor ordenado é [ ");
			imprimeVetorCom0(resultado);
		}
		else if (qual_questao==20) {
			int[] primos=primos(vetor);
			if (primos.length==0) {
				System.out.println("Não foi encontrado nenhum primo.");
				// Se o tamanho do vetor for 0 não existirá nenhum primo
			}else {
				System.out.print("O valor do vetor é: ");
				imprimeVetorSem0(primos);
			}
		}
		else if (qual_questao==21) {
			int[] fibonacci=fibonacci(vetor);
			if (fibonacci.length==0) {
				System.out.println("Nenhum elemento foi encontrado");
				// Se o tamanho do vetor for 0 não existirá nenhum valor na sequência de fibonacce
			}
			else {
				System.out.print("O vetor resltante é: ");
				imprimeVetorSem0(vetor);
			}
		}
		else if (qual_questao==22) {
			System.out.print("Digite a quantidade de agrupamentos: ");
			int numero_agrupamentos = leitor.nextInt();
			agrupamento(vetor, numero_agrupamentos);
		}
		else {
			System.out.println("Digite um valor válido.");
		}
	}
}
