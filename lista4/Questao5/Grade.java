package Questao5;

public class Grade {
    public Campo[][] grade = new Campo[3][3];
    // Cria a grade

    public Grade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = new Campo();
                // Preenche a grade com os espacos vazios
            }
        }
    }
    public void mudarCampo(int[] posicao, char jogador) {
        // Posicao e um vetor com o primeiro valor sendo a linha e o segundo sendo a coluna
        grade[posicao[0]][posicao[1]].setCampo(jogador);
        // Muda o valor em uma posicao especifica do campo
    }
}
