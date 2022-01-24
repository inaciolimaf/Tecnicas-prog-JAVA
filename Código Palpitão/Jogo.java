package jogo;

import java.util.Scanner;

public class Jogo {
	public static int lerInt(){
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}

	public static String lerStr(){
		Scanner ler= new Scanner(System.in);
		return  ler.nextLine();
	}

	public Jogador cadastrarJogador() {
		System.out.print("Informe o nome do jogador: ");
		String nome = lerStr();

		Jogador jogador = new Jogador(nome);

		return jogador;
	}

	public Time cadastrarTime() {
		System.out.print("Informe o nome do time: ");
		String nome = lerStr();
		System.out.print("Informe o codigo do time: ");
		int codigo = lerInt();

		Time time = new Time(codigo, nome);
		// Cria o time usando o codigo e o nome

		return time;
	}

	public void cadastrarTimesParaLiga(Liga liga) {
		int quantTimes;
		int MINIMO_DE_TIMES = 4;
		int MAXIMO_DE_TIMES = 16;
		while (true){
			System.out.print("Digite a quantidade de times: ");
			quantTimes = lerInt();
			if (quantTimes>=MINIMO_DE_TIMES && quantTimes<=MAXIMO_DE_TIMES){
				break;
			}
			System.out.println("Valor inválido. Digite a quantidade de times entre "+MINIMO_DE_TIMES + " e "+MAXIMO_DE_TIMES);
		}
		for (int i = 0; i < quantTimes; i++) {
			liga.adicionarTime(cadastrarTime());
			// Adiciona 4 times na liga
		}
	}

	public void cadastrarJogadorParaLiga(Liga liga) {
		int MINIMO_DE_JOGADORES = 2;
		int MAXIMO_DE_JOGADORES = 6;
		int quant_jogadores;
		while (true){
			System.out.print("Digite a quantidade de jogadores: ");
			quant_jogadores = lerInt();
			if (quant_jogadores>=MINIMO_DE_JOGADORES &&  quant_jogadores<=MAXIMO_DE_JOGADORES){
				break;
			}
			System.out.println("Valor inválido. Digite a quantidade de times etre "+MINIMO_DE_JOGADORES + " e "+MAXIMO_DE_JOGADORES);
		}
		for (int i = 0; i < quant_jogadores; i++) {
			liga.adicionarJogador(cadastrarJogador());
			// Adicionar os 2 jogadores
		}
	}
	public void cadastrarQuantFichas(Liga liga){
		System.out.print("Digite a quantidade de fichas padrao: ");
		int quantFichas = lerInt();
		liga.setQuantFichas(quantFichas);
	}
	public void play() {
		Liga liga = new Liga();
		// Cria a liga
		cadastrarQuantFichas(liga);
		cadastrarTimesParaLiga(liga);
		cadastrarJogadorParaLiga(liga);
		liga.iniciarPartidasDaLiga();
		liga.mostrarInformacoesFinais();
	}

}
