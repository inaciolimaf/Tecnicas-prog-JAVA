package lista1;


public class Questão10 {
	public static void main(String[] args) {
		int primeiroNum=1, segundoNum=1, resultado=0;
		System.out.println(primeiroNum);
		System.out.println(segundoNum);
		while (true) {
			resultado = primeiroNum+segundoNum;
			if (resultado>=1000) {
				break;
			}
			primeiroNum=segundoNum;
			segundoNum=resultado;
			System.out.println(resultado);
		}
	}
}
