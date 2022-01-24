package jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Apresentacao {
	public static int lerInt(){
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}

	public int pegarPaltite(Jogador jogador) {
		System.out.println("Vez do jogador: " + jogador.getNome());
		System.out.println("Digite 0 ou invalido para apostar no empate");
		System.out.print("Informe o codigo  do seu palpite: ");
		return lerInt();
		// Método que lê o palpite
	}

	public int pegarQuantFichasApostadas(){
		System.out.print("Informe quantas fichas apostar: ");
		return lerInt();
		// Método que lê a quantidade de fichas
	}

	public void mostrarPartidaTimes(int numero, ArrayList<Partida> partidas) {
		System.out.println("\nPartida " + (numero + 1) + "\nTime 1("+partidas.get(numero).getT1().getCodigo()+"):  " + partidas.get(numero).getT1().getNome()
				+ "\nTime 2("+partidas.get(numero).getT2().getCodigo()+"):  " + partidas.get(numero).getT2().getNome());
		// Apresenta o resultado da partida
	}

	public void mostrarPontuacaoJogador(ArrayList<Jogador> jogadores) {
		for (int i = 0; i < jogadores.size(); i++) {
			System.out.println("Pontuacao do jogador numero " + (i + 1) + ": " + jogadores.get(i).getPontuacao());
			System.out.println("Quantidade de fichas restantes do jogador numero "+ (i+1) + ": " + jogadores.get(i).getQuantFichas());
		}
		// Métodos para aprensentar a pontuação de cada jogador
	}
	public int pegarQuantFichas(Jogador jogador){
		int resp;
		while (true){
			System.out.print("Digite a quantidade de fichas para apostar: ");
			resp = lerInt();
			if (jogador.getQuantFichas()>=resp){
				break;
			}
			System.out.println("Digite um valor válido.");
		}
		return resp;
	}
	public void informacoesfinais(Liga liga){
		// 7 questao
		// A

		System.out.print("\nForam " + liga.partidas.size() + " partidas e os jogadores sao: ");
		for (Jogador jogador : liga.jogadores) {
			System.out.print(jogador.getNome()+", ");
		}
		System.out.print(". Enquanto os times sao: ");
		for (Time time : liga.times) {
			System.out.print(time.getNome()+", ");
		}
		System.out.println(" .\n");

		// B

		System.out.println("Os times são: ");
		ordenaTime(liga);
		for (int i = 0; i < liga.times.size(); i++) {
			System.out.print("\nTime: " + liga.times.get(i).getNome() + " (" + liga.times.get(i).getCodigo() + ") Pontuacao: " + liga.times.get(i).getPontuacaoTotal());
		}
		
		// C
		
		System.out.println("\nOs jogadores são: ");
		for (Jogador jogador : liga.jogadores) {
			System.out.println("Jogador: " + jogador.getNome()+" Pontuacao: " + jogador.getPontuacao());
		}

		// D, E e F
		
		for (int i = 0; i < liga.partidas.size(); i++) {
			System.out.println("\nA partida "+ (i+1) + ": ");
			Time vencedor = liga.partidas.get(i).getVencedor();

			Time time1 = liga.partidas.get(i).getT1();
			mostraInfoTimeNaPartida(liga, time1, vencedor, i);
			Time time2 = liga.partidas.get(i).getT2();
			mostraInfoTimeNaPartida(liga, time2, vencedor, i);

			for (Jogador jogador : liga.jogadores) {
				if (jogador.getConjuntoPalpite().get(i)==null) {
					System.out.println(jogador.getNome() + " apostou " + jogador.getQuantFichasApostas().get(i) + " fichas no empate ");
				}
			}
		}

		// G

		System.out.println("\nO time classificado para a Libertadores é o " + liga.times.get(0).getNome());
		System.out.println("O time classificado para a Sul-americana é o " + liga.times.get(1).getNome());
		int quantTimes = liga.times.size();
		System.out.println("Os times rebaixados sao o " + liga.times.get(quantTimes-1).getNome() + " e o " + liga.times.get(quantTimes-2).getNome());
		// Escolhi o primeiro time para a Libertadores, o segundo para a Sul-americana e os 2 últimos rebaixados
	}
	public void ordenaTime(Liga liga) {
		ArrayList<Time> times = liga.times;
		for (int i = 0; i < times.size(); i++) {
			for (int j = 0; j < times.size(); j++) {
				if (times.get(i).getPontuacaoTotal()>times.get(j).getPontuacaoTotal()) {
					Time aux = times.get(i);
					times.set(i, times.get(j));
					times.set(j, aux);
				}
			}
		}
	}
	public void mostraInfoTimeNaPartida(Liga liga, Time time, Time vencedor, int i) {
		System.out.print("Time " + (time.getNome()) + ": ");
		for (int j = 0; j < time.conjuntoAcoes.get(0).size(); j++) {
			System.out.print(time.conjuntoAcoes.get(0).get(j) + ", ");
		}
		// Mostra as ações
		time.conjuntoAcoes.remove(0);
		// Remove o time para saber que ele já foi lido
		int pontuacao;
		if (vencedor==time) {
			pontuacao = 3;
		} else if (vencedor==null) {
			pontuacao = 1;
		} else {
			pontuacao = 0;
		}
		System.out.println(".\nA pontuacao do time e: " + pontuacao);
		for (Jogador jogador : liga.jogadores) {
			if (jogador.getConjuntoPalpite().get(i)==time) {
				System.out.println(jogador.getNome() + " apostou " + jogador.getQuantFichasApostas().get(i) + " fichas no time");
			}
		}
	}
}
