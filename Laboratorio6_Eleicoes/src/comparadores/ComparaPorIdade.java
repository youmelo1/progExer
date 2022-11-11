package comparadores;

import java.util.Comparator;

import eleicao.Candidato;



 public class ComparaPorIdade implements Comparator<Candidato>{
	 
	@Override
	public int compare(Candidato c1, Candidato c2) {
		if(c1.getIdade()>c2.getIdade()) {
			return -1;
		}
		if (c1.getIdade()<c2.getIdade()) {
			return 1;
		}
		return 0;
	}
	
	

	
	
}
