package Questao5;

import java.util.Scanner;

/*
5) Escreva um programa completo para jogar o jogo da velha. Para tanto crie
uma classe Jogo da Velha:
a. A classe deve conter como dados privados um array bidimensional
3x3 para representar a grade do jogo
b. Utilize uma variável do tipo String para representar as possibilidades
de ocupação de uma casa na grade (vazia, jogador 1 ou jogador 2)
c. O construtor deve inicializar a grade como vazia
d. Forneça um método para exibir a grade
e. Permitir dois jogadores humanos
f. Forneça um método para jogar o jogo; todo movimento deve ocorrer
em uma casa vazia; depois de cada movimento, determine se houve
uma derrota ou um empate.
*/

public class Principal {
    public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
    public static void mostrarJogo(Campo[][] grade){
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+" " + grade[i][0].getCampo()+" | " + grade[i][1].getCampo() + " | " + grade[i][2].getCampo());
            System.out.println(" -----------");
        }
    }
    public static boolean validaJogada(int[] jogada, Campo[][] grade){
        // Funcao para saber se a jogada e possivel
        if(grade[jogada[0]][jogada[1]].getCampo()==' '){
            return true;
        }else{
            return false;
        }
    }
    public static char verificavitoria(Campo[][] grade){
        if ((grade[0][0].getCampo() == 'x' && grade[0][1].getCampo() == 'x' && grade[0][2].getCampo() == 'x')
        ||(grade[1][0].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[1][2].getCampo() == 'x')
        ||(grade[2][0].getCampo() == 'x' && grade[2][1].getCampo() == 'x' && grade[2][2].getCampo() == 'x')
        ||(grade[0][0].getCampo() == 'x' && grade[1][0].getCampo() == 'x' && grade[2][0].getCampo() == 'x')
        ||(grade[0][1].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[2][1].getCampo() == 'x')
        ||(grade[0][2].getCampo() == 'x' && grade[1][2].getCampo() == 'x' && grade[2][2].getCampo() == 'x')
        ||(grade[0][0].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[2][2].getCampo() == 'x')
        ||(grade[2][0].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[0][2].getCampo() == 'x')) {
            return 'x';
        }else if ((grade[0][0].getCampo() == 'o' && grade[0][1].getCampo() == 'o' && grade[0][2].getCampo() == 'o')
        ||(grade[1][0].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[1][2].getCampo() == 'o')
        ||(grade[2][0].getCampo() == 'o' && grade[2][1].getCampo() == 'o' && grade[2][2].getCampo() == 'o')
        ||(grade[0][0].getCampo() == 'o' && grade[1][0].getCampo() == 'o' && grade[2][0].getCampo() == 'o')
        ||(grade[0][1].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[2][1].getCampo() == 'o')
        ||(grade[0][2].getCampo() == 'o' && grade[1][2].getCampo() == 'o' && grade[2][2].getCampo() == 'o')
        ||(grade[0][0].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[2][2].getCampo() == 'o')
        ||(grade[2][0].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[0][2].getCampo() == 'o')) {
            return 'y';
        }
        else {
            return ' ';
        }
    }
    public static void main(String[] args) {
        Grade jogoVelha = new Grade();
        boolean deuVelha = false;
        char campeao = ' ';
        int[] jogada = new int[2];
        char jogadorVez = 'x';
        int contadorDeJogadas = 0;
        while (campeao==' ') {
            // Laco que acaba quando for encontrado um capeao
            if(contadorDeJogadas==9){
                deuVelha = true;
                break;
                // Se o jogo completar 9 jogadas sem nenhum ganhador, o jogo deu velha e se para o laco 
            }
            mostrarJogo(jogoVelha.grade);
            while(true){
                // Laço para ler a jogada
                System.out.println("O jogador atual e " + jogadorVez);
                System.out.print("Digite a linha da jogada: ");
                jogada[0] = lerInt()-1;
                // O valor é subtraido de 1 porque, nos indices que sao aplicados, as linhas comecam com 0
                System.out.print("Digite a coluna da jogada: ");
                jogada[1] = lerInt()-1;
                if (validaJogada(jogada, jogoVelha.grade)) {
                    // Se a jogada for válida, termina o laco
                    break;
                }
                System.out.println("Valor digitado já está preenchido. Digite um valor válido");
            }
            jogoVelha.mudarCampo(jogada, jogadorVez);
            // Aplica a jogada
            contadorDeJogadas++;
            // Adiciona mais 1 no contador para saber se o jogo esta em velha
            if(jogadorVez=='x'){
                jogadorVez = 'o';
            }
            else{
                jogadorVez = 'x';
            }
            // Troca os jogadores
            for (int i = 0; i < 20; i++) {
                System.out.println();
            }
            // Pula muitas linha para apresentar mais informacoes
            campeao = verificavitoria(jogoVelha.grade);
        }
        if (deuVelha) {
            System.out.println("Deu velha");
        }
        else{
            System.out.println("O campeao é o "+ campeao);
        }
    }
}
