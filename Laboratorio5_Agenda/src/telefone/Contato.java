package telefone;

public class Contato {
	private String nome;
	private String numero;

	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "[Nome do contato: " + nome + ", número do contato: " + numero + "]";
	}

	
	

	
	
	
	
	
}
