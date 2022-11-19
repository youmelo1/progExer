package ui;

import java.util.Scanner;

import aplicativo.Operacoes;
import aplicativo.Pessoa;

public class Menu {
	public Operacoes o = new Operacoes();
	Scanner sc = new Scanner(System.in);
	
	public void opcoes() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("[1] Inserir pessoa");
		System.out.println("[2] Remover pessoa");
		System.out.println("[3] Calcular IMC");
		System.out.println("[4] Calcular Taxa de Gordura Corporal");
		System.out.println("[5] Calcular Peso Ideal");
		System.out.println("[6] Ver resultado de todas as pessoas");
		System.out.println("[7] Sair");
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	public void cadastro() {
		System.out.println("E necessario se cadastrar para poder usar o aplicativo");
		System.out.println();
		System.out.println("Nome?");
		String nome = sc.next();
		String codigo = String.valueOf(o.getPessoas().size()+1);
		System.out.println("Qual sua altura? (em centimetros)");
		double altura = sc.nextDouble();
		System.out.println("Qual seu peso? (em kilogramas)");
		double peso = sc.nextDouble();
		System.out.println("Qual sua idade? ");
		int idade = sc.nextInt();
		System.out.println("Qual seu genero? [F/M]");
		char sexo = sc.next().toUpperCase().charAt(0);
		Pessoa pessoa = new Pessoa(nome, codigo, altura, peso, idade, sexo);
		o.inserirPessoa(pessoa);
		
	}
	
	
	public void menu() {
		//cadastro();
		opcoes();
		int esc = sc.nextInt();
		while(esc!=7) {
			switch(esc) {
			case 1:
				System.out.println("Nome?");
				String nome = sc.next();
				String codigo = String.valueOf(o.getPessoas().size()+1);
				System.out.println("Altura? (em centimetros)");
				double altura = sc.nextDouble();
				System.out.println("Peso? (em kilogramas)");
				double peso = sc.nextDouble();
				System.out.println("Idade? ");
				int idade = sc.nextInt();
				System.out.println("Genero? [F/M]");
				char sexo = sc.next().toUpperCase().charAt(0);
				Pessoa p = new Pessoa(nome, codigo, altura, peso, idade, sexo);
				o.inserirPessoa(p);
				opcoes();
				esc = sc.nextInt();
				break;
				
				
			case 2:
				System.out.println("Digite o codigo da pessoa que deseja remover da lista:");
				o.info();
				int remove = sc.nextInt();
				if(remove>o.getPessoas().size()) {
					System.out.println("Nao ha uma pessoa com esse codigo na lista");
				}else {
					o.removerPessoa(remove);
				}
				opcoes();
				esc = sc.nextInt();
				break;
				
			case 3:
				System.out.println("Digite o codigo da pessoa que deseja calcular o IMC?");
				o.info();
				int pessoaIMC = sc.nextInt();
				System.out.printf("%.2f",o.calcularImc(o.getPessoas().get(pessoaIMC-1)));
				System.out.println(" "+o.imcStatus(o.getPessoas().get(pessoaIMC-1)));;
				opcoes();
				esc = sc.nextInt();
				break;
				
			case 4:
				System.out.println("Digite o codigo da pessoa que deseja calcular a taxa de gordura?");
				o.info();
				int pessoaTGC = sc.nextInt();
				System.out.printf("%.2f",o.taxaGordura(o.getPessoas().get(pessoaTGC-1)));;
				System.out.println("%");
				opcoes();
				esc = sc.nextInt();
				break;
				
			case 5:
				System.out.println("Digite o codigo da pessoa que deseja calcular o peso ideal?");
				o.info();
				int pessoaPI = sc.nextInt();
				System.out.printf("%.2f",o.pesoIdeal(o.getPessoas().get(pessoaPI-1)));
				System.out.println(" kg");
				opcoes();
				esc = sc.nextInt();
				break;
				
			case 6:
				o.resultadoPessoas();
				opcoes();
				esc = sc.nextInt();
				break;
				
			default:
				System.out.println("Essa nao e uma opcao disponivel!");
				opcoes();
				esc = sc.nextInt();
				break;
			}
		}
		System.out.println("Saindo...");
	}
}
