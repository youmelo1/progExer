package main;

import ui.Menu;
import vacinacao.Paciente;

public class PrincipalVacina {
	public static void main(String[] args) {
		Menu menu = new Menu();
		
		Paciente p1 = new Paciente("Carlos", 55);
		Paciente p2 = new Paciente("Luisa", 7);
		Paciente p3 = new Paciente("Joaquim", 43);
		Paciente p4 = new Paciente("Isabela", 15);
		Paciente p5 = new Paciente("Vinicius", 22);
		menu.addFila(p1);
		menu.addFila(p2);
		menu.addFila(p3);
		menu.addFila(p4);
		menu.addFila(p5);
		
		
		
		
		menu.menu();
	}
}
