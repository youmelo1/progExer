package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import telefone.Contato;
import telefone.Funcionalidades;

class Testes {
	public static void main(String[] args) {
		testaMostrarChamadasNaoAtendidas();
		//testaRemovercontato();
	}




	public void testaAddcontato(){
		Contato contato = new Contato("Teste","123456789");
		Funcionalidades agenda = new Funcionalidades();
		//assertTrue(agenda.cadastrarContato(contato));
	}


	public static void testaRemovercontato(){
		Contato contato = new Contato("Teste","123456789");
		int numContato  = 1;
		Funcionalidades tel = new Funcionalidades();
		List<Contato> agenda = new ArrayList<>();		
		tel.cadastrarContato(contato); 
		System.out.println(agenda.size());
		tel.removerContato(numContato);
		System.out.println(agenda.size());
	}

	public void testaAddchamadaNaoAtendida(){
		Contato contato = new Contato("Teste","123456789");
		Funcionalidades chamadasNaoAtendidas = new Funcionalidades();
		//assertTrue(chamadasNaoAtendidas.cadastrarChamadaNaoAtendida(contato));
	}

	public void testaExcluirListaNaoAtendida(){
		String contato = ("123456789");
		Funcionalidades chamadasNaoAtendidas = new Funcionalidades();
		((Funcionalidades) chamadasNaoAtendidas.getChamadasNaoAtendidas()).cadastrarChamadaNaoAtendida(contato);
		//assertTrue(chamadasNaoAtendidas.excluirChamadasNaoAtendidas());
	}





	public static void testaMostrarChamadasNaoAtendidas() {
		List<String> temp = new ArrayList<>();
		Contato c1 = new Contato("Teste1","1");
		Contato c2 = new Contato("Teste2","2");
		Contato c3 = new Contato("Teste3","3");
		Contato c4 = new Contato("Teste4","4");


		String c11 = ("1");
		String c22 = ("2");
		String c33 = ("3");
		String c333 = ("3");
		String c44 = ("4");
		String c55 = ("5");

		
		Funcionalidades t = new Funcionalidades();
		
		//t.cadastrarChamadaNaoAtendida(c55);
		//t.cadastrarChamadaNaoAtendida(c33);
		//t.cadastrarContato(c3);


		t.getAgenda().add(c1);
		t.getAgenda().add(c2);
		t.getAgenda().add(c3);
		t.getAgenda().add(c4);
		t.getChamadasNaoAtendidas().add(c11);
		t.getChamadasNaoAtendidas().add(c22);
		t.getChamadasNaoAtendidas().add(c33);
		t.getChamadasNaoAtendidas().add(c333);
		t.getChamadasNaoAtendidas().add(c55);
		

		if(t.getAgenda().size()!=0) {
			for(String num : t.getChamadasNaoAtendidas()) {
				for(int i = 0; i<t.getAgenda().size(); i++) {
					if(num.equalsIgnoreCase(t.getAgenda().get(i).getNumero())) {
						System.out.println(num+"("+t.getAgenda().get(i).getNome()+")");
						temp.add(num);
						
				}
			}
		}
			for(String s : t.getChamadasNaoAtendidas()) {
				for(String num : temp) {
					if(!temp.contains(s)) {
						System.out.println(s);
						break;
					}
				}
			}
			temp.removeAll(temp);
		}else {
			for(String s : t.getChamadasNaoAtendidas()) {
				System.out.println(s);
			}
		}


	}
}

