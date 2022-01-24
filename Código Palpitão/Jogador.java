package jogo;

import java.util.ArrayList;

public class Jogador {

	private String nome;
	private int pontuacao;
	private Time palpite;
	private ArrayList<Time> conjuntoPalpite;
	private int quantFichas;
	private ArrayList<Integer> quantFichasApostas;
	public Jogador(String nome) {
		this.nome = nome;
		this.pontuacao = 0;
		this.quantFichasApostas = new ArrayList<Integer>();
		this.conjuntoPalpite = new ArrayList<Time>();
	}

	public String getNome() {
		return nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public ArrayList<Integer> getQuantFichasApostas() {
		return quantFichasApostas;
	}

	public void setQuantFichasApostas(int quantFichasApostas) {
		this.quantFichasApostas.add(quantFichasApostas);
	}

	public void setPontuacao(int pontuacao) {
		if (pontuacao >= 0)
			this.pontuacao += pontuacao;
	}

	public Time getPalpite() {
		return palpite;
	}

	public void setPalpite(Time palpite) {
		this.palpite = palpite;
		this.conjuntoPalpite.add(palpite);
	}

	public int getQuantFichas() {
		return quantFichas;
	}

	public void setQuantFichas(int quantFichas) {
		this.quantFichas = quantFichas;
	}
	public void aumentaQuantFichas(int quantAumentar){
		this.quantFichas += quantAumentar;
	}
	public void diminuirQuantFichas(int quantDimnuir){
		this.quantFichas -= quantDimnuir;
	}

	public ArrayList<Time> getConjuntoPalpite() {
		return conjuntoPalpite;
	}
}
