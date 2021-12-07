package exercicioojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public ArrayList<Conta> contas = new ArrayList<>();
    public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
    public static float lerFloat(){
        Scanner leitor = new Scanner(System.in);
        return leitor.nextFloat();
    }
    public static String lerString(){
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    public void criarConta() {
        System.out.print("Digite a descricao para criar a conta: ");
        String descricao = lerString();
        System.out.print("Digite o numero da conta: ");
		int numero = lerInt();
        System.out.print("Digite o saldo: ");
        float saldo = lerFloat();
        System.out.print("Digite se a conta e especial ou nao [1 para SIM e 0 para NAO]: ");
        int conta_especial = lerInt();
        System.out.print("Digite o limite da conta: ");
        float limiteDaConta = lerFloat();
        this.contas.add(new Conta(numero, saldo, conta_especial, limiteDaConta, descricao, 1));
        System.out.println("Conta criada com sucesso");
    }
    public void excluirconta(){
        System.out.print("Digite o numero da conta a ser excluida: ");
        int num = lerInt();
        for (Conta conta : contas) {
            // foreach para pegar cada conta no array contas
            if (conta.numero==num){
                System.out.println("Conta excluida conta com o numero " + conta.numero + " e com saldo "+conta.saldo);
                contas.remove(conta);
                // Remove a conta
                break;
                // Como ja foi encontrado a conta para ser excluida, entao se para o laco
            }
        }
    }
    public void saque(){
        System.out.print("Digite o numero da conta para fazer o saque: ");
        int num = lerInt();
        for (Conta conta : contas) {
            if (conta.numero==num){
                System.out.println("Encontrada uma conta com " + conta.saldo + " de saldo");
                System.out.print("Digite uma descricao para o saque: ");
                String descricao = lerString();
                System.out.print("Digite 0 para credito e 1 para debito: ");
                int creditoOuDebito = lerInt();
                System.out.print("Digite o valor de saque:");
                float valorSaque = lerInt();
                
                if (valorSaque>=conta.saldo || valorSaque>=conta.limite) {
                	System.out.println("Operação não realizada. Digite um valor válido");
                }
                else {
	                conta.saldo -= valorSaque;
	                conta.movimentacoes.add(new Movimentacao(descricao, -1*valorSaque, creditoOuDebito));
	                System.out.println("Operação realizada.");
	            }
                break;
            }
        }
    }
    public void deposito() {
		System.out.print("Digite o numero da conta para fazer o deposito: ");
        int num = lerInt();
        for (Conta conta : contas) {
            if (conta.numero==num){
                System.out.println("Encontrada uma conta com " + conta.saldo + " de saldo");
                System.out.print("Digite uma descricao para o deposito: ");
                String descricao = lerString();
                System.out.print("Digite 0 para credito e 1 para debito: ");
                int creditoOuDebito = lerInt();
                System.out.print("Digite o valor de deposito:");
                float valorDeposito = lerInt();
                conta.saldo += valorDeposito;
                conta.movimentacoes.add(new Movimentacao(descricao, valorDeposito, creditoOuDebito));
                System.out.println("Operação realizada.");
                break;
            }
        }
	}
    public void extrato() {
		System.out.print("Digite o numero da conta para mostrar o extrato: ");
		int num = lerInt();
		for (Conta conta : contas) {
			if (conta.numero==num) {
				System.out.println("Conta encontrada com o numero: " + conta.numero);
				System.out.println("O saldo na conta e: " + conta.saldo);
				System.out.println("O limite da conta e: " + conta.limite);
				System.out.println("A conta e do tipo: " + conta.especial);
				System.out.println("As movimentacoes sao: ");
				for (Movimentacao movimento: conta.movimentacoes) {
					System.out.println("Descricao da movimentacao: " + movimento.descricao);
					System.out.println("Valor da movimentacao: " + movimento.valor);
					System.out.println("Tipo de movimento: " + movimento.tipoMovimentacao);
				}
			}
		}
    }
    public void tranferencia() {
		System.out.print("Digite o número da conta de origem: ");
		int origem = lerInt();
		System.out.print("Digite o número da conta de destino: ");
		int destino = lerInt();
		for (Conta conta : contas) {

			if(conta.numero==origem) {
				
				// Encontra a conta de origem
				for (Conta conta2 : contas) {
					
					if(conta2.numero==destino) {
						// Escontra a segunda conta
						System.out.println("Contas encontradas: ");
						System.out.print("Digite a descricao: ");
						String descricao = lerString();
						System.out.print("Digite a quantidade para tranferir: ");
						float valor = lerInt();
						System.out.print("Digite 1 para débito e 2 para crédito: ");
						int tipoMovimentacao = lerInt();
						if(conta.saldo>=valor||conta.limite>=valor) {
							// Se a operacao for possivel de realizar
							conta.saldo -= valor;
							conta.movimentacoes.add(new Movimentacao(descricao, -1*valor, tipoMovimentacao));
							conta2.saldo += valor;
							conta2.movimentacoes.add(new Movimentacao(descricao, valor, tipoMovimentacao));
							System.out.println("Operação realizada.");
						}
						else {
							System.out.println("Valor inválido");
						}
					}
				}
			}
		}
	}
}

