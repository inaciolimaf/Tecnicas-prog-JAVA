package jogo;

import java.util.ArrayList;

public class Liga {

	public ArrayList<Time> times;
	public ArrayList<Partida> partidas;
	public ArrayList<Time> vencedores;
	public ArrayList<Jogador> jogadores;
	public int quantPadraoFichas;

	public Liga() {
		this.times = new ArrayList<Time>();
		this.partidas = new ArrayList<Partida>();
		this.vencedores = new ArrayList<Time>();
		this.jogadores = new ArrayList<Jogador>();
		// Inicializa os valores
	}

	public void setQuantFichas(int quant){
		this.quantPadraoFichas = quant;
	}

	public void adicionarTime(Time time) {
		times.add(time);
	}

	public void adicionarJogador(Jogador jogador) {
		jogador.setQuantFichas(quantPadraoFichas);
		jogadores.add(jogador);
	}

	private void montarLiga() {
		for (int i = 0; i < times.size(); i++) {
			for (int j = 0; j < i; j++) {
				Partida p1 = new Partida(times.get(j), times.get(i));
				partidas.add(p1);
			}
		}
		// Cria as partidas e adiciona elas a lista de partidas
	}

	public Time pegarTimePorCodigo(int codigo) {
		if (codigo==0){
			return null;
		}
		for (int j = 0; j < times.size(); j++) {
			if (codigo == times.get(j).getCodigo())
				return times.get(j);
		}
		return null;
		// Retorna o time com um determinado código
	}

	public void iniciarPartidasDaLiga() {
		montarLiga();
		// Cria as partidas
		Apresentacao apresentacao = new Apresentacao();
		// Cria a classe apresentação
		for (int i = 0; i < partidas.size(); i++) {
			apresentacao.mostrarPartidaTimes(i, partidas);
			// Mostra a partida e os times
			for (int j = 0; j < jogadores.size(); j++) {
				int codigoApostado = apresentacao.pegarPaltite(jogadores.get(j));
				Time timeApostado = pegarTimePorCodigo(codigoApostado);
				jogadores.get(j).setPalpite(timeApostado);
				int quantFichasApostadas = apresentacao.pegarQuantFichas(jogadores.get(j));
				jogadores.get(j).setQuantFichasApostas(quantFichasApostadas);
				jogadores.get(j).diminuirQuantFichas(quantFichasApostadas);
			}
			// Lê os palpites
			vencedores.add(partidas.get(i).duelar());
			// Adiciona o vencedor a lista de vencedores
			for (int j = 0; j < jogadores.size(); j++) {
				int fichasApostadas = jogadores.get(j).getQuantFichasApostas().get(i);
				if (jogadores.get(j).getPalpite()==null){
					// Se o jogador apostar no empate
					if (vencedores.get(i)==null) {
						// Se o jogo realmente for empatado
						jogadores.get(j).setPontuacao(3*fichasApostadas);
						jogadores.get(j).aumentaQuantFichas(3*fichasApostadas);
					}else{
						// Se não for empatado
						jogadores.get(j).setPontuacao(0);
					}
				}
				else if(jogadores.get(j).getPalpite()==vencedores.get(i)){
					jogadores.get(j).setPontuacao(3*fichasApostadas);
					jogadores.get(j).aumentaQuantFichas(3*fichasApostadas);
					// Se o jogador acertar
				}
				else if(vencedores.get(i)==null){
					jogadores.get(j).setPontuacao(1*fichasApostadas);
					jogadores.get(j).aumentaQuantFichas(1*fichasApostadas);
					// Se tiver empate
				}
				else{
					jogadores.get(j).setPontuacao(0);
					// Se não for empate nem tiver acertado
				}
			}
			apresentacao.mostrarPontuacaoJogador(jogadores);
		}
	}
	public void mostrarInformacoesFinais(){
		Apresentacao apresentacao = new Apresentacao();
		apresentacao.informacoesfinais(this);
	}
}
