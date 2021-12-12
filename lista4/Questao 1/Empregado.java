package Questao1;

public class Empregado {
	public String nome;
	public String sobrenome;
	private float salario;
	
	public Empregado(String nome, String sobrenome, float salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		setSalario(salario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		if (salario<0) {
			this.salario = 0;
		}
		else {
			this.salario = salario;
		}
	}
	public void mostrarInformacoes() {
		System.out.println("O nome � " + this.getNome());
		System.out.println("O sobrenome � " + this.getSobrenome());
		System.out.println("O sal�rio  " + this.getSalario());
	}
	public void aumentaSalario10() {
		float salarioNovo = this.getSalario()*11/10;
		this.setSalario(salarioNovo);
	}
}
