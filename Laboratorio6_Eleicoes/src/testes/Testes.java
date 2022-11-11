package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import eleicao.Candidato;
import eleicao.Informacoes;
import junit.framework.Assert;

class Testes {
	public static void main(String[] args) {
		testamediaDeVotosNoCandidato();
		testaCandidatoMaisJovem();
		testaCandidatoMaisVelho();
		testaCandidatoMaisVotado();
		testaCandidatoMenosVotado();
		
	}
	Candidato c1 = new Candidato("Velho", "Partido1", 75, 7);
	Candidato c2 = new Candidato("MaisVotos", "Partido2", 60, 10);
	Candidato c3 = new Candidato("MenosVotos", "Partido3", 45, 1);
	Candidato c4 = new Candidato("Jovem", "Partido4", 30, 3);
	Informacoes i = new Informacoes();
	

	
	public static void testaCandidatoMaisJovem() {
		Candidato c1 = new Candidato("Velho", "Partido1", 75, 7);
		Candidato c2 = new Candidato("MaisVotos", "Partido2", 60, 10);
		Candidato c3 = new Candidato("MenosVotos", "Partido3", 45, 1);
		Candidato c4 = new Candidato("Jovem", "Partido4", 30, 3);
		Informacoes i = new Informacoes();
		i.adicionaCandidato(c1);
		i.adicionaCandidato(c2);
		i.adicionaCandidato(c3);
		i.adicionaCandidato(c4);
		
		i.candidatoMaisJovem();
	}
	
	
	public static void testaCandidatoMaisVelho() {
		Candidato c1 = new Candidato("Velho", "Partido1", 75, 7);
		Candidato c2 = new Candidato("MaisVotos", "Partido2", 60, 10);
		Candidato c3 = new Candidato("MenosVotos", "Partido3", 45, 1);
		Candidato c4 = new Candidato("Jovem", "Partido4", 30, 3);
		Informacoes i = new Informacoes();
		i.adicionaCandidato(c1);
		i.adicionaCandidato(c2);
		i.adicionaCandidato(c3);
		i.adicionaCandidato(c4);
		i.candidatoMaisVelho();
		
	}
	
	
	
	public static void testaCandidatoMaisVotado() {
		Candidato c1 = new Candidato("Velho", "Partido1", 75, 7);
		Candidato c2 = new Candidato("MaisVotos", "Partido2", 60, 10);
		Candidato c3 = new Candidato("MenosVotos", "Partido3", 45, 1);
		Candidato c4 = new Candidato("Jovem", "Partido4", 30, 3);
		Informacoes i = new Informacoes();
		i.adicionaCandidato(c1);
		i.adicionaCandidato(c2);
		i.adicionaCandidato(c3);
		i.adicionaCandidato(c4);
		i.candidatoMaisVotado();
		
	}
	
	
	public static void testaCandidatoMenosVotado() {
		Candidato c1 = new Candidato("Velho", "Partido1", 75, 7);
		Candidato c2 = new Candidato("MaisVotos", "Partido2", 60, 10);
		Candidato c3 = new Candidato("MenosVotos", "Partido3", 45, 1);
		Candidato c4 = new Candidato("Jovem", "Partido4", 30, 3);
		Informacoes i = new Informacoes();
		i.adicionaCandidato(c1);
		i.adicionaCandidato(c2);
		i.adicionaCandidato(c3);
		i.adicionaCandidato(c4);
		i.candidatoMenosVotado();
	}
	
	@Test
	public void testaTotalDeVotos() {
		i.adicionaCandidato(c1);
		i.adicionaCandidato(c2);
		i.adicionaCandidato(c3);
		i.adicionaCandidato(c4);
		int total =  i.totalDeVotos();
		Assertions.assertEquals(21, total);
	}
	
	
	
	public static void testamediaDeVotosNoCandidato() {
		Candidato c1 = new Candidato("Velho", "Partido1", 75, 1);
		Candidato c2 = new Candidato("MaisVotos", "Partido2", 60, 5);
		Candidato c3 = new Candidato("MenosVotos", "Partido3", 45, 2);
		Candidato c4 = new Candidato("Jovem", "Partido4", 30, 2);
		Informacoes i = new Informacoes();
		i.adicionaCandidato(c1);
		i.adicionaCandidato(c2);
		i.adicionaCandidato(c3);
		i.adicionaCandidato(c4);
		
		i.mediaVotacaoPorCandidato();
	}
	
		
}
