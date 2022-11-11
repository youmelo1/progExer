package vacinacao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import comparador.ComparadorIdade;

public class Fila{

	private Comparator<Paciente> comparadorPorIdade = new ComparadorIdade();
	private Queue<Paciente> filaDosVacinados = new LinkedList<>();
	private Queue<Paciente> filaParaVacina = new PriorityQueue<>(10, comparadorPorIdade);
	private Queue<Paciente> temp = new PriorityQueue<>(10, comparadorPorIdade);
	
	
	public void entrarNaFila(Paciente p) {
		filaParaVacina.add(p);
	}
	
	public void vacinar(int x) {
		int i = 0;
		if(filaParaVacina.size()<x) {
			System.out.println("Somente "+filaParaVacina.size()+" pessoas podem ser vacinadas");
		}else {
		 while(i != x) {
			Paciente p = filaParaVacina.remove();
			filaDosVacinados.add(p);
			i++;
		}
		 System.out.println(x + " pessoas foram vacinadas!");
	}
	}
	
	public void esperandoVacina() {
		System.out.print("[");
		while(filaParaVacina.size()!=0) {
			Paciente p = filaParaVacina.remove();
			System.out.print(p.getNome() + " ("+p.getIdade()+" anos)"+", ");
			temp.add(p);
		}
		while(temp.size()!=0) {
			Paciente p = temp.remove();
			filaParaVacina.add(p);
		}
		System.out.println("]");
	}
	
	public void jaVacinados() {
		System.out.println(Arrays.toString(filaDosVacinados.toArray()));
	}
	
	public void opcoes() {
		System.out.println();
		System.out.println("1)Entrar na fila: \n2)Ver fila para a vacina: \n3)Vacinar pessoas: \n4)Ver fila  dos já vacinados: \n5)Sair\n");

	}
	
}
