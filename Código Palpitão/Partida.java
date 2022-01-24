package jogo;

import java.util.ArrayList;

public class Partida {

	private Time t1;
	private Time t2;
	private ArrayList<Integer> pontuacaoTime1DoJogo;
	private ArrayList<Integer> pontuacaoTime2DoJogo;
	private Time vencedor;

	public Partida(Time t1, Time t2) {
		this.t1 = t1;
		this.t2 = t2;
		pontuacaoTime1DoJogo = new ArrayList<Integer>();
		pontuacaoTime2DoJogo = new ArrayList<Integer>();
	}

	private void computarAcoesTime() {
		t1.computarAcoes();
		t2.computarAcoes();
	}

	private void pontuacaoPontoAPonto() {
		pontuacaoTime1DoJogo = new ArrayList<Integer>();
		pontuacaoTime2DoJogo = new ArrayList<Integer>();
		// MODIFICAÇÃO 2: Zerando a pontuação dos times
		for (int i = 0; i < 10; i++) {
			if (t1.getAcaoIndividual(i) > t2.getAcaoIndividual(i)) {
				pontuacaoTime1DoJogo.add(3);
				pontuacaoTime2DoJogo.add(0);
			} else if (t1.getAcaoIndividual(i) < t2.getAcaoIndividual(i)) {
				pontuacaoTime2DoJogo.add(3);
				pontuacaoTime1DoJogo.add(0);
				// Adiciona 3 pontos para o time gannhador a cada ação
			} else {
				pontuacaoTime1DoJogo.add(1);
				pontuacaoTime2DoJogo.add(1);
				// Adiciona 1 se tiver empate
			}
		}
	}

	private void verificarVencedor() {
		int somaTime1=0;
		int somaTime2=0;
		
		for (int i = 0; i < 10; i++) {
			somaTime1 += pontuacaoTime1DoJogo.get(i);
			somaTime2 += pontuacaoTime2DoJogo.get(i);
			// Soma todas as pontuações dos times
		}

		if (somaTime1 > somaTime2) {
			t1.setPontuacaoTotal(3);
			t2.setPontuacaoTotal(0);
			this.vencedor = t1;
			// Vencedor será o t1
		} else if (somaTime1 < somaTime2) {
			t2.setPontuacaoTotal(3);
			t1.setPontuacaoTotal(0);
			this.vencedor = t2;
			// Vencedor será o t2
		} else {
			t1.setPontuacaoTotal(1);
			t2.setPontuacaoTotal(1);
			this.vencedor = null;
			// Vencedor será o null(empate)
		}
		// Calcula o vencedor
	}

	public Time duelar() {
		computarAcoesTime();
		// Calcula as 10 interações do time no jogo
		pontuacaoPontoAPonto();
		// Calcula a pontução do time no jogo
		verificarVencedor();
		// Calcula vendedor
		return vencedor;
	}

	public Time getT1() {
		return t1;
	}

	public Time getT2() {
		return t2;
	}

	public Time getVencedor() {
		return vencedor;
	}

	public void setVencedor(Time vencedor) {
		this.vencedor = vencedor;
	}

}
