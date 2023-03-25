package lugares;

import java.util.List;

public class Viagens {
	double custoTotal,custoMedio;
	int numVeiculos, totalItens;
	List <Trechos> custoTrecho;
	
	
	//custoTrecho é uma lista de trechos para conseguir gerenciar melhor
	//o nome das duas cidades e o valor que foi para ir de uma cidade a outra
	
	public Viagens(double custoTotal, List<Trechos> custoTrecho, double custoMedio, int numVeiculos, int totalItens) {
		this.custoTotal = custoTotal;
		this.custoTrecho = custoTrecho;
		this.custoMedio = custoMedio;
		this.numVeiculos = numVeiculos;
		this.totalItens = totalItens;
	}

	public List<Trechos> getCustoTrecho() {
		return custoTrecho;
	}

	@Override
	public String toString() {
		String retorno = ("-Custo total: R$: "+custoTotal+"\n-Custo por trecho: "+custoTrecho.toString()+"\n-Custo médio por km: R$:"+custoMedio+
				"\n-Número de veículos: "+numVeiculos+"\n-Total de itens: "+totalItens);
		
		
		return retorno;
	}

	
	
	
}
