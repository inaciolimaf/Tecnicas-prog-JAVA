package exercicioojeto;

import java.util.Scanner;

/*
 * Exercício sobre Orientação a Objetos.


Faça a modelagem do requisito abaixo (classes, métodos e atributos) e implemente em java.

Uma conta corrente possui um número, um saldo e um status que informa se ela é especial ou não, um limite e um conjunto de movimentações.
Uma movimentação possui uma descrição, um valor e uma informação se ela é uma movimentação de crédito ou débito.
Um banco armazena um conjunto de contas e permite que sejam feitas criações de conta, exclusão de contas, saques e depósitos, emissão de saldo/extrato e transferência entre contas. 
Uma conta corrente só pode fazer saques desde que o valor não exceda o limite de saque-limite mais o saldo.
*/
public class Principal {
    public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
    public static void main(String[] args) {
        Banco banco =new Banco();
        int respOpcao=-1;
        while (respOpcao!=0) {
            System.out.println("\nOperacoes:");
            System.out.println("1) Criacao de conta");
            System.out.println("2) Exclusao de conta");
            System.out.println("3) Saque");
            System.out.println("4) Deposito");
            System.out.println("5) Extrado/ Saldo");
            System.out.println("6) Transferencia entre contas");
            System.out.println("0) Sair");
            System.out.print("Digite qual operacao voce que fazer: ");
            respOpcao = lerInt();
            switch(respOpcao){
                case 1:
                    banco.criarConta();
                    break;
                case 2:
                    banco.excluirconta();
                    break;
                case 3:
                    banco.saque();
                    break;
                case 4:
                	banco.deposito();
                	break;
                case 5:
                	banco.extrato();
                	break;
                case 6:
                	banco.tranferencia();
                	break;
            }
        }
	}
}
