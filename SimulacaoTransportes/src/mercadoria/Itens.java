package mercadoria;

import java.util.ArrayList;
import java.util.List;


public class Itens extends Produto{


	
	private Produto cadeira = new Produto(5, "cadeira", 0, 1);
	private Produto celular = new Produto(0.5, "celular", 0, 2);
	private Produto freezer = new Produto(100, "freezer", 0, 3);
	private Produto geladeira = new Produto(60, "geladeira", 0, 4);
	private Produto lavadora_de_roupa = new Produto(120, "lavadora_de_roupa", 0, 5);
	private Produto luminaria = new Produto(0.8, "luminaria", 0, 6);
	
	
	
	
	public Itens(double peso, String nome, int quantidade, int id) {
		super(peso, nome, quantidade, id);
	}

	

	public Produto getCelular() {
		return celular;
	}


	public Produto getGeladeira() {
		return geladeira;
	}


	public Produto getFreezer() {
		return freezer;
	}


	public Produto getCadeira() {
		return cadeira;
	}


	public Produto getLuminaria() {
		return luminaria;
	}


	public Produto getLavadora_de_roupa() {
		return lavadora_de_roupa;
	}

	


	
}
