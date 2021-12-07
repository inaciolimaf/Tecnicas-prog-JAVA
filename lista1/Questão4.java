package lista1;

import java.util.Scanner;

public class Questão4 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a data inicial: ");
		System.out.print("Ano: ");
		int anoIni = leitor.nextInt();
		System.out.print("Mês: ");
		int mesIni = leitor.nextInt();
		System.out.print("Dia: ");
		int diaIni = leitor.nextInt();
		System.out.print("Hora: ");
		int horaIni = leitor.nextInt();
		System.out.print("Minuto: ");
		int minutoIni = leitor.nextInt();
		
		System.out.println("Digite a data final: ");
		System.out.print("Ano: ");
		int anoFinal = leitor.nextInt();
		System.out.print("Mês: ");
		int mesFinal = leitor.nextInt();
		System.out.print("Dia: ");
		int diaFinal = leitor.nextInt();
		System.out.print("Hora: ");
		int horaFinal = leitor.nextInt();
		System.out.print("Minuto: ");
		int minutoFinal = leitor.nextInt();
		// Lendo os valores
		
		int anoDiferenca = anoFinal - anoIni;
		int mesDiferenca = mesFinal - mesIni;
		int diaDiferenca = diaFinal - diaFinal;
		int horaDiferenca = horaFinal - horaIni;
		int minutoDiferenca = minutoFinal - minutoIni;
		// Calculando as diferenças
		
		int QuantDiferenca[] = {anoDiferenca, mesDiferenca, diaDiferenca, horaDiferenca, minutoDiferenca};
		int Multiplicadores[] = {12, 30, 24, 60, 1};
		// Criando os vetores

		int quantTempo=0;
		for (int i=0; i<5; i++) {
			quantTempo =(QuantDiferenca[i]+quantTempo)*Multiplicadores[i];
		}
		// Calcula o tempo em minutos
		System.out.println(quantTempo);
	}
}
