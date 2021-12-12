package Questao4;

import java.util.ArrayList;
import java.util.Scanner;

/*
4) Um contato é constituído de código, nome da pessoa, endereço, e-mail,
telefone e observação.
a. Crie 4 construtores e atribua o valores por meio dos construtores. Os
construtores devem receber os seguintes parâmetros:
I. Código.
II. Código e nome.
III. Código, nome e e-mail.
IV. Telefone.
b. Crie pelo menos 5 contatos.
c. O atributo e-mail não poderá ser modificado fora da classe contato,
mas poderá ser acessado por outras classes.
d. Faça um método para imprimir o código, nome, endereço, e-mail,
telefone e observação dos contatos cadastrados.
e. Faça um validador do código do contato. Um código válido é maior
igual a 1000 e menor igual a 9999. Não permita que seja cadastrado
um código inválido para nenhum contato.
f. Faça um validador para o telefone. O telefone sempre deverá ter 8
dígitos. Não permita que seja cadastrado um telefone inválido para
nenhum contato.
g. Crie um método que possa duplicar um contato. Desta forma, um
novo contato terá os mesmos dados do contato que for requerido a
duplicação.
h. Faça um método para verificar se o contato está totalmente
preenchido. Ou seja, tenha valores diferentes do padrão para:
código, nome, endereço, e-mail, telefone e observação.
*/

public class Principal {
	public static float lerFloat() {
		Scanner leitor = new Scanner(System.in);
		return leitor.nextFloat();
	}
	public static String lerString(){
	    Scanner leitor = new Scanner(System.in);
	    return leitor.nextLine();
	}
	public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
	public static void main(String[] args) {
		ArrayList<Contato> contatos = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			// Item A
			System.out.println("Digite os dados para o contato " + i + ": ");
			System.out.print("Código: ");
			float codigo = lerFloat();
			System.out.print("Nome: ");
			String nome = lerString();
			System.out.print("Endereco: ");
			String endereco = lerString();
			System.out.print("E-mail: ");
			String e_mail = lerString();
			System.out.print("Telefone: ");
			int telefone = lerInt();
			System.out.print("Observacao: ");
			String observacao = lerString();
			Contato contato = new Contato(codigo, nome, e_mail);
			contato.setEndereco(endereco);
			contato.setTelefone(telefone);
			contato.setObservacao(observacao);
			contato.mostrarContato();
			// Cria o objeto
			if (contato.estaPreenchido()) {
				System.out.println("O contato esta totalmente preenchido");
			}
			else{
				System.out.println("O contato nao esta preenchido totalmente");
			}
			// Confere se o contato esta preenchido
			contatos.add(contato);
			// Adiciona o contato no array
			System.out.println("O contato duplicado é: ");
			Contato novoContato = contato.duplicaContato();
			novoContato.mostrarContato();
			// Mostra o contato duplicado
		}
	}

}
