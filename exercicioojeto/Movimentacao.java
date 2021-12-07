package exercicioojeto;


public class Movimentacao {
    public String descricao;
    public float valor;
    public int tipoMovimentacao;

    public Movimentacao(String descricao, float valor, int tipoMovimento) {
    	this.descricao = descricao;
    	this.valor = valor;
    	this.tipoMovimentacao = tipoMovimento;
    }
}
