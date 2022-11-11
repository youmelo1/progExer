package ui;


import java.util.Scanner;

import telefone.Contato;
import telefone.Funcionalidades;

public class Menu {
	private Funcionalidades f = new Funcionalidades();
	
	
	public void menu() {
		Scanner sc1 = new Scanner(System.in);
		f.opcoes();
		int esc = sc1.nextInt();
		while(esc !=7) {
			
			switch(esc){
			case 1:
				System.out.println("Qual o nome do contato?");
				String nome = sc1.next();
				System.out.println("Qual o número do contato?");
				String numAdd = sc1.next();
				Contato contato = new Contato(nome, numAdd);
				f.cadastrarContato(contato);
				f.opcoes();
				esc = sc1.nextInt();
				break;

			case 2:
				if(f.getAgenda().size()==0) {
					System.out.println("Não há contatos em sua agenda.");
				}else {
					System.out.println("Qual contato que deseja remover?");
					f.contatosInfo();
					int numRemove = sc1.nextInt();
					f.removerContato(numRemove);
				}
				
				f.opcoes();
				esc = sc1.nextInt();
				break;

			case 3:
				System.out.println("Qual o número não atendido?");
				String numNaoAtendido = sc1.next();
				f.cadastrarChamadaNaoAtendida(numNaoAtendido);
				f.opcoes();

				esc = sc1.nextInt();
				break;

			case 4:
				f.mostrarChamadasNaoAtendidas();
				f.opcoes();
				esc = sc1.nextInt();
				break;

			case 5:
				f.excluirChamadasNaoAtendidas();
				f.opcoes();

				esc = sc1.nextInt();
				break;
				
			case 6:
				f.contatosNaAgenda();
				f.opcoes();
				esc = sc1.nextInt();
				break;
				

			default:
				System.out.println("Essa não é uma opção disponível!");
				f.opcoes();
				esc = sc1.nextInt();
			}
		}
		System.out.println("--------------------");
		System.out.println("Saindo...");

		}
}
