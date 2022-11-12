package eleicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparadores.ComparaPorIdade;
import comparadores.ComparaPorVotos;

public class Informacoes {
	private Comparator<Candidato> comparaVotos = new ComparaPorVotos();
	private Comparator<Candidato> comparaIdade = new ComparaPorIdade();
	private List<Candidato> candidatos = new ArrayList<>();
	
	
	
	public void adicionaCandidato(Candidato c) {
		candidatos.add(c);
	}
	
	
	public void infoCandidatos() {
		for(int i = 0; i<candidatos.size(); i++) {
			System.out.println(candidatos.get(i).toString());
			System.out.println("****************************");
		}
	}
	
	public void candidatoMaisJovem() {
		Collections.sort(candidatos, comparaIdade);
		System.out.println(candidatos.get(candidatos.size()-1).toString());
	}
	
	
	public void candidatoMaisVelho() {
		Collections.sort(candidatos, comparaIdade);
		System.out.println(candidatos.get(0).toString());
	}
	
	
	public void candidatoMaisVotado() {
		Collections.sort(candidatos, comparaVotos);
		System.out.println(candidatos.get(0).toString());
	}
	
	public void candidatoMenosVotado() {
		Collections.sort(candidatos, comparaVotos);
		System.out.println(candidatos.get(candidatos.size()-1).toString());
	}
	
	
	public int totalDeVotos() {
		int total = 0;
		for(int i = 0; i<candidatos.size();i++) {
			total += candidatos.get(i).getVotos();
		}
		return total;
	}
		
		
	public void mediaVotacaoPorCandidato() {
		for(int i = 0; i<candidatos.size(); i++) {
			double media = ((double)candidatos.get(i).getVotos()/totalDeVotos())*100;
			System.out.printf("Média de votos de "+candidatos.get(i).getNome()+" %.3f",media);
			System.out.print("%\n");
		}
	
	public void opcoes() {
		System.out.println("-------------------------------------------");
		System.out.println("[1] Adicionar candidato\n[2] Candidato mais jovem\n[3] Candidato mais velho\n[4] Candidato mais votado\n[5] Candidato menos votado\r\n"
				+ "[6] Total de votos recebidos por todos os candidatos\n[7] Média de votação recebida pelos candidatos\n[8] Mostrar candidatos\n[9] Sair");
		System.out.println("----------------------------------------------");
	}
	
}
	

