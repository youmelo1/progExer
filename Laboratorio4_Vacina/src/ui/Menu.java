package ui;

import java.util.Scanner;

import vacinacao.Fila;
import vacinacao.Paciente;

public class Menu {
	Fila fila = new Fila();
	
	
	public void addFila(Paciente p) {
		fila.entrarNaFila(p);
	}


	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" - FILA PARA VACINAÇÃO - ");
		System.out.println("1)Entrar na fila: \n2)Ver fila para a vacina: \n3)Vacinar pessoas: \n4)Ver fila  dos já vacinados: \n5)Sair\n");
		int esc = sc.nextInt();


		while(esc != 5) {
			switch(esc) {
			case 1:
				System.out.println("Qual seu nome?: ");
				String nome = sc.next();
				System.out.println("Qual sua idade?: ");
				int idade = sc.nextInt();
				Paciente p = new Paciente(nome, idade);
				fila.entrarNaFila(p);
				fila.opcoes();
				esc = sc.nextInt();
				break;

			case 2:
				fila.esperandoVacina();
				fila.opcoes();
				esc = sc.nextInt();
				break;

			case 3:
				System.out.println("Quantas pessoas quer vacinar?: ");
				int pessoas = sc.nextInt();
				fila.vacinar(pessoas);
				fila.opcoes();
				esc = sc.nextInt();
				break;

			case 4:
				fila.jaVacinados();
				fila.opcoes();
				esc = sc.nextInt();
				break;

			case 5:
				System.out.println();
				System.out.println("Obrigado!");
				break;

			default:
				System.out.println("Essa não é uma opção disponível.");
				fila.opcoes();
				esc = sc.nextInt();
				break;
			}
		}
	}
}
