package lista1;

import java.util.Scanner;

public class Quest�o1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Double altura;
		String sexo;
		
		System.out.print("Digite a altura: ");
		altura = leitor.nextDouble();
		leitor.nextLine(); // Esvazia o buffer do teclado
		while(true){
			System.out.print("Digite o sexo[m/f]: ");
			sexo = leitor.nextLine();
			if(sexo.intern()=="m"||sexo.intern()=="f"){
				break;
			}
			System.out.println("Digite \'m\'ou \'f\' para continuar");
			// Parte para confirmar que o usu�rio digitou "m" ou "f"
		}
		if (sexo.intern()=="m") {
			// Se o sexo for masculino
			double pesoideal, diferAle, diferBra;
			pesoideal=(72.7*altura)-58;
			System.out.println("O peso ideal � "+pesoideal);
			
			diferAle=Math.abs(altura-1.813);
			diferBra=Math.abs(altura-1.743);
			if(diferAle<diferBra) {
				System.out.println("A estatura est� mais pr�xima da estatura da Alemanha");
			}
			else {
				System.out.println("A estatura est� mais pr�xima da estatura do Brasil");
			}
		}
		else {
			// Sen�o for masculino
			double pesoideal, diferAle, diferBra;
			pesoideal=(62.1*altura)-44.7;
			System.out.println("O peso ideal � "+pesoideal);
			
			diferAle=Math.abs(altura-1.67);
			diferBra=Math.abs(altura-1.611);
			if(diferAle<diferBra) {
				System.out.println("A estatura est� mais pr�xima da estatura da Alemanha");
			}
			else {
				System.out.println("A estatura est� mais pr�xima da estatura do Brasil");
			}
		}
	}
}
