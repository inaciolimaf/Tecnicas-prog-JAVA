package exercicioojeto;

import java.util.ArrayList;

public class Conta {
	public int numero;
	public float saldo;
	public int especial;
	public float limite;
	public ArrayList<Movimentacao> movimentacoes = new ArrayList<>();
	
	public Conta(int numero, float saldo, int especial, float limite, String descricao, int tipoDeMovimentacao) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
		this.movimentacoes.add(new Movimentacao(descricao, saldo, tipoDeMovimentacao));
	}
}
