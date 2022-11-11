package testes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import comparador.ComparadorIdade;
import vacinacao.Paciente;

public class Teste{

	public static void main(String[] args) {
		comparaPorIdade();
		vacinar();
		esperandoVacinaEJaVacinados();
	}





	public static void comparaPorIdade() {
		Comparator<Paciente> comparadorPorIdade = new  ComparadorIdade();
		Queue<Paciente> filaParaVacina = new PriorityQueue<Paciente>(10, comparadorPorIdade);
		Paciente p1 = new Paciente("Carlos", 55);
		Paciente p2 = new Paciente("Luisa", 7);
		Paciente p3 = new Paciente("Joaquim", 43);

		filaParaVacina.add(p1);
		filaParaVacina.add(p2);
		filaParaVacina.add(p3);


		while(filaParaVacina.size() != 0) {
			Paciente p = filaParaVacina.remove();
			System.out.println(p.getNome() + " ("+p.getIdade()+")");
		}
	}

		private static void vacinar() {
			Comparator<Paciente> comparadorPorIdade = new  ComparadorIdade();
			Queue<Paciente> filaParaVacina = new PriorityQueue<Paciente>(10, comparadorPorIdade);
			Queue<Paciente> filaDosVacinados = new LinkedList<Paciente>();
			
			Paciente p1 = new Paciente("Carlos", 55);
			Paciente p2 = new Paciente("Luisa", 7);
			Paciente p3 = new Paciente("Joaquim", 43);

			filaParaVacina.add(p1);
			filaParaVacina.add(p2);
			filaParaVacina.add(p3);
			
			int x = 2;
			int i = 0;
			 while(i != x) {
				Paciente p = filaParaVacina.remove();
				filaDosVacinados.add(p);
				i++;
			 }
			System.out.println("Pacientes vacinados: "+Arrays.toString(filaDosVacinados.toArray()));
			
			
			 
		}
	
		private static void esperandoVacinaEJaVacinados() {
			Comparator<Paciente> comparadorPorIdade = new  ComparadorIdade();
			Queue<Paciente> filaDosVacinados = new LinkedList<Paciente>();
			Queue<Paciente> filaParaVacina = new PriorityQueue<Paciente>(10, comparadorPorIdade);
			Queue<Paciente> temp = new PriorityQueue<Paciente>(10, comparadorPorIdade);
			Paciente p1 = new Paciente("Carlos", 55);
			Paciente p2 = new Paciente("Luisa", 7);
			Paciente p3 = new Paciente("Joaquim", 43);

			filaParaVacina.add(p1);
			filaParaVacina.add(p2);
			filaParaVacina.add(p3);
			System.out.print("[");
			while(filaParaVacina.size()!=0) {
				Paciente p = filaParaVacina.remove();
				System.out.print(p.getNome() + " ("+p.getIdade()+")"+", ");
				temp.add(p);
			}
			while(temp.size()!=0) {
				Paciente p = temp.remove();
				filaParaVacina.add(p);
			}
			System.out.println("]");
			System.out.println(Arrays.toString(filaDosVacinados.toArray()));
	}
}
	



