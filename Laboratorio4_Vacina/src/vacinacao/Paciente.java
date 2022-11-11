package vacinacao;

public class Paciente {
	
	private String nome;
	private int idade;
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return nome + " " + "("+idade+" anos)";
	}
	
	
}
