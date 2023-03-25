package funcionalidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lugares.Cidades;
import mercadoria.Itens;
import mercadoria.Produto;
import transporte.Caminhoes;

public class Ferramentas {
	Scanner sc =  new Scanner(System.in);
	private List<Caminhoes> frotaCaminhoes = new ArrayList<>();
	private List<Produto> listaDeItens = new ArrayList<>();


	//cria uma lista base com todos os produtos
	public List<Produto> lista() {
		Itens itensMostrar = new Itens(0, null, 0, 0);
		listaDeItens.removeAll(listaDeItens);
		listaDeItens.add(itensMostrar.getCadeira());
		listaDeItens.add(itensMostrar.getCelular());
		listaDeItens.add(itensMostrar.getFreezer());
		listaDeItens.add(itensMostrar.getGeladeira());
		listaDeItens.add(itensMostrar.getLavadora_de_roupa());
		listaDeItens.add(itensMostrar.getLuminaria());
		
		return listaDeItens;

	}


	//cria um caminhao especifico para uma quantidade de peso especifica
	//e retorna a lista com todos os caminhoes necessarios
	//tem um removeAll para prevenir que uma lista não se adicione com outra
	public List<Caminhoes> totalCaminhoes(double kg) {
		frotaCaminhoes.removeAll(frotaCaminhoes);
		while(kg>0){
			Caminhoes c = null;
			if(kg<=1000) {
				c = new Caminhoes("pequeno", 4.87);
				kg -=1000;
			}else if(kg>1000 && kg<=4000) {
				c = new Caminhoes("medio", 11.92);
				kg -=4000;
			}else if(kg>4000) {
				c = new Caminhoes("grande", 27.44);
				kg -=10000;
			}
			frotaCaminhoes.add(c);
		}
		
		return frotaCaminhoes;
	}

	//faz exatamente o que é esperado para uma função desse nome
	//e retorna o valor arredondado para não ficar um número cheio de decimais
	public double calculaValorViagem(List<Caminhoes> caminhoes, int distancia) {
		double valor = 0;
		for(int i = 0; i<caminhoes.size(); i++) {
			valor += caminhoes.get(i).getValor()*distancia;
		}
		return Math.round(valor);
	}
	

	
	public List<Produto> inserirItens(int id, int quant) {
		boolean existe = false;
		List<Produto> itens = new ArrayList<>();
		for(Produto p : lista()) {
			if(p.getId()==id) {
				itens.add(p);
				p.setQuantidade(quant);
				existe = true;
			}
		}
		
		if(!existe) {
			System.out.println("Não existe nenhum produto com esse id");
			System.out.println();
			System.out.println("Qual o id do produto que deseja transportar?");
			id = sc.nextInt();
			System.out.println("Escolha a quantidade do produto");
			quant = sc.nextInt();
			inserirItens(id,quant);
		}
		return itens;
	}

	
	
	public List<Produto> retirarItens(int id, int quant, List<Produto> itens){
		boolean existe = false;
		boolean temQuant =  false;
		for(Produto p : itens) {
			if(p.getId()==id) {
				if(p.getQuantidade()>=quant) {
					p.setQuantidade(p.getQuantidade()-quant);
					temQuant = true;
				}
				existe = true;
			}
		}

		if(!existe) {
			System.out.println("Você não tem esse produto");
			System.out.println();
			System.out.println("Qual o produto que deseja retirar?");
			id = sc.nextInt();
			retirarItens(id, quant, itens);
		}
		if(!temQuant) {
			System.out.println("Você não tem essa quantidade desse produto");
			System.out.println();
			System.out.println("Qual a quantidade que deseja retirar?");
			quant = sc.nextInt();
			retirarItens(id, quant, itens);
		}

		return itens;
	}

	
	//confere se existem dois ou mais produtos de mesmo id na lista
	//e se existir junta as duas quantidades em um so produto
	//retornando uma lista sem duplicatas
	public List<Produto> verificaDup(List<Produto> itens){
		
			for(int i = 0; i<itens.size(); i++) {
				for(int j = 0; j<itens.size(); j++) {
					if((itens.get(i).getId()==itens.get(j).getId()) && (itens.get(i)!=itens.get(j))) {
						itens.get(i).setQuantidade(itens.get(i).getQuantidade()+itens.get(j).getQuantidade());
						itens.remove(j);
					}
				}
			}
		return itens;
	}
		
	
	
	
	//faz o cálculo de quanto será o custo de uma cidade a outra conforme
	//oo tamnho do caminhão pedido
	public String consultarTrechos(String c1, String  c2, String modalidade) {

		String retorno = "";

		Cidades c = new Cidades(); {
			double preco = 0;
			double distancia = c.distancia(c1, c2);

			if(modalidade.equalsIgnoreCase("pequeno")) {
				preco = distancia*4.87;
				retorno  = ("De "+c1 +" para "+c2+", utilizando um caminhão de pequeno porte, a "
						+ "distância é de "+distancia+" km e o custo será de R$"+Math.round(preco));

			}else if(modalidade.equalsIgnoreCase("medio")) {
				preco = distancia*11.92;
				retorno  = ("De "+c1 +" para "+c2+", utilizando um caminhão de medio porte, a "
						+ "distância é de "+distancia+" km e o custo será de R$"+Math.round(preco));

			}else if(modalidade.equalsIgnoreCase("grande")) {
				preco = distancia*27.44;
				retorno  = ("De "+c1 +" para "+c2+", utilizando um caminhão de grande porte, a "
						+ "distância é de "+distancia+" km e o custo será de R$"+Math.round(preco));
			}
			return retorno;


		}

	}

}
