package mercadoria;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	
	
	private double peso;
	private String nome;
	private int quantidade;
	private int id;
	
	
	public Produto(double peso, String nome, int quantidade, int id) {
		super();
		this.peso = peso;
		this.nome = nome;
		this.quantidade = quantidade;
		this.id = id;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public double getPeso() {
		return peso;
	}



	public String getNome() {
		return nome;
	}



	public int getId() {
		return id;
	}
	
	
	

	@Override
	public String toString() {
		return "Produto [Nome: " + nome + ", Quantidade: " + quantidade + "]";
	}



	

	
	
	
	
}
