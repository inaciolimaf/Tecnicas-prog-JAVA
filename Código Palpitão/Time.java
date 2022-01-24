package jogo;

import java.util.ArrayList;

public class Time {

	private String nome;
	private int codigo;
	public ArrayList<Integer> acoes;
	public ArrayList< ArrayList<Integer> > conjuntoAcoes;
	private int pontuacaoTotal;

	public Time(int codigo, String nome) {
		if (nome != "") {
			this.nome = nome;
		} else {
			this.nome = "Sem nome";
		}
		if (codigo > 0){
			this.codigo = codigo;
		}
		// Configura o nome do time e o código
		acoes = new ArrayList<Integer>();
		conjuntoAcoes = new ArrayList< ArrayList<Integer> >();
		// Inicializa as ações do time
	}

	private int iniciarAcao() {
		return (int) ((Math.random() * 50) + 0);
		// Retorna uma ação do time de modo aleatório
	}

	public void computarAcoes() {
		acoes = new ArrayList<Integer>();
		// MODIFICACAO 1: Quando é computado novas ações é necessário recalcular as ações do zero
		// e não apenas adicionar por cima,porque nesse cado são considerados apenas as primeiras 10 ações
		for (int i = 0; i < 10; i++) {
			acoes.add(iniciarAcao());
		}
		// Preeenche o array de ação com 10 posições
		conjuntoAcoes.add(acoes);
		// Adiciona a acao calculada para um array com todas as acoes para ser imprimido no final
	}

	public int getAcaoIndividual(int indice) {
		return acoes.get(indice);
		// Retorna uma ação de um time em um indice específico
	}

	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}

	public void setPontuacaoTotal(int pontuacao) {
		if (pontuacao > 0){
			this.pontuacaoTotal += pontuacao;
		}
		// Adiciona a pontuação total a pontuação passsada como parametro
		// Método para os pontos do campeonato
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}
	public ArrayList<Integer> getAcoes() {
		return acoes;
	}

	public void setAcoes(Integer acoes) {
		this.acoes.add(acoes);
	}
}
