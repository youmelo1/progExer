package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import funcionalidades.Ferramentas;
import lugares.Cidades;
import lugares.Trechos;
import lugares.Viagens;
import mercadoria.Itens;
import mercadoria.Produto;

public class Menu {
	private Scanner sc =  new Scanner(System.in);
	private Ferramentas f = new Ferramentas();
	private Cidades d = new Cidades();
	
	private List<Viagens> viagens = new ArrayList<>();




	public void cidadesDisponiveis() {
		System.out.println("As cidades disponíveis para fazer os transportes são: Porto Alegre, Florianopolis, Sao Paulo, Curitiba"
				+ ", Maceio e Goiania");
		System.out.println("*Para escolher a cidade é necessário escreve-la sem os acentos");
		System.out.println();
	}

	public void produtosDisponiveis() {
		System.out.println("Os produtos disponíveis são: ");
		System.out.println("Id 1: Cadeira, peso: 5 kg");
		System.out.println("Id 2: Celular, peso: 0.5 kg");
		System.out.println("Id 3: Freezer, peso: 100 kg");
		System.out.println("Id 4: Geladeira, peso: 60 kg");
		System.out.println("Id 5: Lavadora de roupas, peso: 120 kg");
		System.out.println("Id 6: Luminaria, peso: 0.8 kg");
		System.out.println();
	}

	public void modalidadesDisponiveis() {
		System.out.println("As modalidades disponíveis são: pequeno(com custo de 4.87 reais por km e capacidade de 1000 kg),");
		System.out.println("medio(com custo de 11.92 reais por km e capacidade de 4000 kg) e "); 
		System.out.println("grande(com custo de 27.44 reais por km e capacidade de 10000 kg)");
		System.out.println();
	}



	public void opcoes() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1) Consultar trechos pela modalidade");
		System.out.println("2) Cadastrar transporte");
		System.out.println("3) Ver transportes cadastrados");
		System.out.println("4) Verificar as cidades disponiveis");
		System.out.println("5) Verificar os produtos disponiveis");
		System.out.println("6) Verificar as modalidades disponiveis");
		System.out.println("7) Sair");
		System.out.println("---------------------------------------------------------------------");
	}


	//retorna verdadeiro se o usuario escrever uma cidade disponivel
	public boolean verificaCidade(String c) {
		if((c.equalsIgnoreCase("porto alegre")||c.equalsIgnoreCase("curitiba")||c.equalsIgnoreCase("maceio")
				||c.equalsIgnoreCase("florianopolis")||c.equalsIgnoreCase("goiania")||c.equalsIgnoreCase("sao paulo")))
			return true;

		return false;
	}
	//retorna verdadeiro se o usuario escrever uma modalidade disponivel
	public boolean verificaModalidade(String m) {
		if((m.equalsIgnoreCase("pequeno")||m.equalsIgnoreCase("medio")||m.equalsIgnoreCase("grande"))) 
			return true;

		return false;
	}


	//opção de consultar trecho pela modalidade
	public void opcao1() {
		System.out.println("Escreva a cidade de partida:");
		sc.nextLine();
		String c1 = sc.nextLine();
		
		//repete até o usuário colocar uma cidade disponível
		while(!verificaCidade(c1)) {
			System.out.println("Essa não é uma cidade disponível!");
			System.out.println("--------------------------------");
			cidadesDisponiveis();
			System.out.println("--------------------------------");
			System.out.println("Escreva a cidade de partida:");
			c1 = sc.nextLine();
		}
		
		System.out.println("Escreva a cidade final:");
		String c2 = sc.nextLine();
		
		//repete até o usuário colocar uma cidade diferente da cidade inicial
		while(c2.equalsIgnoreCase(c1)) {
			System.out.println("A cidade não pode ser a mesma que a cidade inicial!");
			System.out.println("--------------------------------");
			cidadesDisponiveis();
			System.out.println("--------------------------------");
			System.out.println("Escreva a cidade final:");
			c2 = sc.nextLine();
		}

		//repete até o usuário colocar uma cidade disponível
		while(!verificaCidade(c2)) {
			System.out.println("Essa não é uma cidade disponível!");
			System.out.println("--------------------------------");
			cidadesDisponiveis();
			System.out.println("--------------------------------");
			System.out.println("Escreva a cidade final:");
			c2 = sc.nextLine();
		}
		
		System.out.println("Escreva a modalidade do caminhão:");
		String m = sc.nextLine();
		
		//repete até o usuário colocar uma modalidade de caminhão disponível
		while(!verificaModalidade(m)) {
			System.out.println("Essa não é uma modalidade disponível!");
			System.out.println("--------------------------------");
			modalidadesDisponiveis();
			System.out.println("--------------------------------");
			System.out.println("Escreva a modalidade do caminhão!");
			m = sc.nextLine();
		}
		
		
		System.out.println(f.consultarTrechos(c1, c2, m));
		
	}


	public void opcao2() {
		List<String> nomesCidades = new ArrayList<>();
		List<Produto> itens = new ArrayList<>();
		List<Trechos> trechos = new ArrayList<>();
		int distancia = 0;
		int i = 0;

		System.out.println("Primeiro será necessário colocar quantas paradas, contando a parada inicial e final,"+
				" você quer que o caminhão faça:");
		int paradas = sc.nextInt();
		
		
		while(paradas <= 1  || paradas>6) {
			System.out.println("O mínimo de paradas é 2 e o máximo é 6.");
			System.out.println("Coloque quantas paradas você que que o caminhão faça, contando a parada inicial e final:");
			paradas = sc.nextInt();
		}
		
		
		while(i<paradas) {	
			
			if(i==0) {
				System.out.println("Cidade de número "+(i+1));
				sc.nextLine();
				String cidade = sc.nextLine();
				
				while(!verificaCidade(cidade)) {
					System.out.println("Essa não é uma cidade disponível!");
					System.out.println("--------------------------------");
					cidadesDisponiveis();
					System.out.println("--------------------------------");
					System.out.println("Escreva a cidade de número "+(i+1));
					cidade = sc.nextLine();
				}
				
				//adiciona o nome da cidade em uma lista para depois conseguir calcular
				//de maneira mais fácil a distancia entre as cidades
				nomesCidades.add(cidade);
				i++;
			}
			
			
			System.out.println("Cidade de número "+(i+1));
			String cidade2 = sc.nextLine();
			while(!verificaCidade(cidade2)) {
				System.out.println("Essa não é uma cidade disponível!");
				System.out.println("--------------------------------");
				cidadesDisponiveis();
				System.out.println("--------------------------------");
				System.out.println("Escreva a cidade de número "+(i+1));
				cidade2 = sc.nextLine();
			}

			
			while(cidade2.equalsIgnoreCase(nomesCidades.get(i-1))) {
				System.out.println("Essa cidade não pode ser a mesma que a anterior!");
				System.out.println("--------------------------------");
				cidadesDisponiveis();
				System.out.println("--------------------------------");
				System.out.println("Escreva a cidade de número "+(i+1));
				cidade2 = sc.nextLine();
			}
			
			
			//insere a segunda e as demais cidades na lista
			nomesCidades.add(cidade2);
			i++;
		}
		
		//calcula a distancia da cidade 1 até a cidade 2 
		//se tiver mais de duas cidades, se  calcula a distancia da cidade 2 até a 3, da 
		//3 pra 4 e assim por diante
		for(int j = 0; j<nomesCidades.size()-1; j++) {
			distancia += d.distancia(nomesCidades.get(j), nomesCidades.get(j+1));
			Trechos t  = new Trechos(nomesCidades.get(j), nomesCidades.get(j+1), 0);
			trechos.add(t);
		}
		
		
		System.out.println();
		System.out.println("Agora você precisa escolher qual e quantos produtos deseja transportar.");

		int esc = 0;

		//looping até o usuário decidir que não quer adicionar mais nada
		while(esc != 2) {
			System.out.println("Escolha o produto digitando seu id:");
			System.out.println();
			produtosDisponiveis();
			int id = sc.nextInt();
			System.out.println();
			System.out.println("Escolha a quantidade do produto:");
			int quantidade = sc.nextInt();

			 
			//insere na lista itens cada produto que o usuário adicionou
			for(Produto p : f.inserirItens(id, quantidade)) {
				itens.add(p);
			}
				

			System.out.println("Deseja adicionar mais algum produto?");
			System.out.println("1) Sim");
			System.out.println("2) Não");
			System.out.println();
					
			esc = sc.nextInt();
		}
		
		
		//se tiver algum item duplicado
		itens  = f.verificaDup(itens);
		//não vai ter mais
		
		
		double peso =  0;

		
		for(Produto p : itens) {
			peso += p.getPeso()*p.getQuantidade();
		}

		
		
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Está transportando:");
		System.out.println(itens.toString());
		
		
		System.out.println("-------------------------------");
		System.out.println("Peso total: "+peso+ " kg");
		

		System.out.println("-------------------------------");
		System.out.println("Distancia total: "+distancia+ " km");
		

		System.out.println("-------------------------------");
		System.out.println("Caminhoes necessários:");
		System.out.println(f.totalCaminhoes(peso).toString());
		

		double valorTotal = f.calculaValorViagem(f.totalCaminhoes(peso), distancia);
		System.out.println("-------------------------------");
		System.out.println("Custo total: R$: "+valorTotal);

		
		double custoMedio = (valorTotal/distancia);
		int numVeiculos = f.totalCaminhoes(peso).size();
		int totalItens =  0;
		
		
		for(Produto p : itens) {
			totalItens +=  p.getQuantidade();
		}
		
		
		int distanciaTrechos = 0;
		
		
		for(Trechos t: trechos) {
			distanciaTrechos = d.distancia(t.getC1(), t.getC2());
			t.setValor(f.calculaValorViagem(f.totalCaminhoes(peso), distanciaTrechos));
		}
		
		//cria essa viagem para inserir na lista de transportes cadastrados
		Viagens v = new Viagens(valorTotal,trechos,Math.round(custoMedio),numVeiculos,totalItens);
		viagens.add(v);
		
		
		//reseta o valor das variáveis porque nas paradas o valor da distancia 
		//e do peso do caminhão irão mudar
		peso = 0;
		valorTotal = 0;
		distancia = 0;


		int cidadeParada = 1;
		
		
		//escolha de quantas paradas o usuário fez antes
		//"paradas > 2" porque não irá retirar manualmente produtos do caminhão na cidade final
		while(paradas>2) {
			int escParada = 0;
			System.out.println("-------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("----------Você chegou em: "+nomesCidades.get(cidadeParada)+"----------");
			
			//remove a cidade anterior pois o caminhão já passou por ela
			nomesCidades.remove(0);
			
			
			
			
			
			//looping até o usuário decidir que não quer retirar mais nada
			while(escParada != 2) {	
				
				
				//caso não tenha itens na lista, não há motivo para parar
				if(itens.size()==0) { 	
					break;
				}
				
				
				
				
				System.out.println("Qual o produto que deseja retirar?");
				
				
				for(int quantidade = 0; quantidade<itens.size(); quantidade++) {
					if(itens.get(quantidade).getId()==0) {
						continue;
					}else {
					System.out.println(itens.get(quantidade).getId()+") "+itens.get(quantidade).getNome()+", quantidade: "+itens.get(quantidade).getQuantidade());
					}
				}

				
				int idRetirar = sc.nextInt();
				System.out.println("Qual a quantidade que deseja retirar?");
				int quantRetirar = sc.nextInt();


				
				
				itens = f.retirarItens(idRetirar, quantRetirar, itens);
				
				
				//caso não tenha itens na lista, não tem mais como retirar algum produto
				if(itens.size()==0) {
						break;
				}
				
				
				System.out.println("Deseja retirar mais algum produto?");
				System.out.println("1) Sim");
				System.out.println("2) Não");
				escParada = sc.nextInt();

			}

			
			System.out.println();
			System.out.println("Para o restante da viagem:");

			
			for(Produto p : itens) {
				peso += p.getPeso()*p.getQuantidade();
			}
			
			
			//calcula a distancia da cidade 1 até a cidade 2 
			//se tiver mais de duas cidades, se  calcula a distancia da cidade 2 até a 3, da 
			//3 pra 4 e assim por diante
			for(int j = 0; j<nomesCidades.size()-1; j++) {
				distancia += d.distancia(nomesCidades.get(j), nomesCidades.get(j+1));
			}

			
			System.out.println("-------------------------------");
			System.out.println("Está transportando:");
			System.out.println(itens.toString());
			System.out.println("-------------------------------");
			System.out.println("Peso total: "+peso+ " kg");

			System.out.println("-------------------------------");
			System.out.println("Distancia total: "+distancia+ " km");

			System.out.println("-------------------------------");
			System.out.println("Caminhoes necessários:");
			System.out.println(f.totalCaminhoes(peso).toString());

			valorTotal = f.calculaValorViagem(f.totalCaminhoes(peso), distancia);

			System.out.println("-------------------------------");
			System.out.println("Custo restante: R$: "+valorTotal);
			System.out.println();
			System.out.println();
			
			//reseta o valor das variáveis porque nas paradas o valor da distancia 
			//e do peso do caminhão irão mudar
			peso = 0;
			valorTotal = 0;
			distancia = 0;

			
			paradas--;
		
		}
		System.out.println();
		System.out.println();
		System.out.println("----------Você chegou em: "+nomesCidades.get(nomesCidades.size()-1)+"----------");
		System.out.println();
		System.out.println();
	}

	
	public void opcao3() {


		if(viagens.size()==0) {
			System.out.println("Você não tem nenhum transporte cadastrado");
		}else {
			System.out.println("--Você tem "+viagens.size()+ " transportes cadastrados--");
			System.out.println();


			for(int z = 0; z<viagens.size(); z++) {
				System.out.println(z+1+") Transporte com começo em: "+viagens.get(z).getCustoTrecho().get(0).getC1()+" e final em "+
						viagens.get(viagens.size()-1).getCustoTrecho().get(viagens.get(z).getCustoTrecho().size()-1).getC2()+";");

			}


			System.out.println();
			System.out.println("Qual transporte você deseja ver?");
			int escViagem = sc.nextInt();
			

			if((escViagem>0)&&(escViagem-1<viagens.size())) {
				System.out.println(viagens.get(escViagem-1).toString());
			}else {
				System.out.println("Não existe nenhum transporte cadastrado com esse número");
				System.out.println();
				System.out.println();
				opcao3();
			}

			
		}
	}


	public void menu() {
		System.out.println("-----Simulação de sistema de transporte interestadual de cargas-----");
		cidadesDisponiveis();
		produtosDisponiveis();
		modalidadesDisponiveis();
		opcoes();

		int esc = sc.nextInt();
		while(esc!=7) {
			switch(esc) {
			case 1:
				opcao1();
				opcoes();
				esc = sc.nextInt();
				break;

			case 2:
				opcao2();
				opcoes();
				esc = sc.nextInt();
				break;
			case 3:
				opcao3();
				opcoes();
				esc = sc.nextInt();
				break;
			case 4:
				cidadesDisponiveis();
				opcoes();
				esc = sc.nextInt();
				break;
			case 5:
				produtosDisponiveis();
				opcoes();
				esc = sc.nextInt();
				break;
			case 6:
				modalidadesDisponiveis();
				opcoes();
				esc = sc.nextInt();
				break;
			default:
				System.out.println("Essa não é uma opção disponível!");
				opcoes();
				esc = sc.nextInt();
			}

		}

	}

}
