package exercicioojeto;

import java.util.Scanner;

/*
 * Exerc�cio sobre Orienta��o a Objetos.


Fa�a a modelagem do requisito abaixo (classes, m�todos e atributos) e implemente em java.

Uma conta corrente possui um n�mero, um saldo e um status que informa se ela � especial ou n�o, um limite e um conjunto de movimenta��es.
Uma movimenta��o possui uma descri��o, um valor e uma informa��o se ela � uma movimenta��o de cr�dito ou d�bito.
Um banco armazena um conjunto de contas e permite que sejam feitas cria��es de conta, exclus�o de contas, saques e dep�sitos, emiss�o de saldo/extrato e transfer�ncia entre contas. 
Uma conta corrente s� pode fazer saques desde que o valor n�o exceda o limite de saque-limite mais o saldo.
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
