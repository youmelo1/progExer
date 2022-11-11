package ui;

import java.util.Scanner;

import eleicao.Candidato;
import eleicao.Informacoes;

public class Menu {
	Informacoes info = new Informacoes();
	
	public void menu() {
		System.out.println("Informações sobre os candidatos na eleição:");
		Scanner sc1 = new Scanner(System.in);
		info.opcoes();
		int esc = sc1.nextInt();
		while(esc !=9) {
			switch(esc) {
			case 1:
				System.out.println("Qual o nome do candidato?");
				String nome = sc1.next();
				System.out.println("Qual o partido do candidato?");
				String partido = sc1.next();
				System.out.println("Qual a idade do candidato?");
				int idade = sc1.nextInt();
				System.out.println("Qual a quantidade de votos do candidato?");
				int votos = sc1.nextInt();
				Candidato c = new Candidato(nome, partido, idade, votos);
				info.adicionaCandidato(c);
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 2:
				info.candidatoMaisJovem();
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 3:
				info.candidatoMaisVelho();
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 4:
				info.candidatoMaisVotado();
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 5:
				info.candidatoMenosVotado();
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 6:
				System.out.print("Total de votos na eleição: ");
				System.out.println(info.totalDeVotos());
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 7:
				info.mediaVotacaoPorCandidato();
				info.opcoes();
				esc = sc1.nextInt();
				break;
			case 8:
				info.infoCandidatos();
				info.opcoes();
				esc = sc1.nextInt();
				break;
			default:
				System.out.println("Essa não é uma opção disponível!");
				info.opcoes();
				esc = sc1.nextInt();
				break;
			}
		}
		System.out.println("Saindo...");
	}
}
