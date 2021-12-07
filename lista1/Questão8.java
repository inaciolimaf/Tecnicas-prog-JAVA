package lista1;

public class Questão8 {

	public static void main(String[] args) {
		int cont=0;
		while (true) {
			cont+=1;
			if (cont%4==0&&cont>1000) {
				break;
			}
			System.out.println(cont);
		}
	}

}
