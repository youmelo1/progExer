package transporte;

public class Caminhoes {
	String tamanho;
	double valor;
	
	public Caminhoes(String nome, double valor) {
		super();
		this.tamanho = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return tamanho;
	}
	public void setNome(String nome) {
		this.tamanho = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Caminhao [tamanho: " + tamanho + "]";
	}
	
	
	
	
	
}
