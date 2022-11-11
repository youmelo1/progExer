package comparadores;

import java.util.Comparator;

import eleicao.Candidato;

public class ComparaPorVotos implements Comparator<Candidato>{

	@Override
	public int compare(Candidato c1, Candidato c2) {
		if(c1.getVotos()>c2.getVotos()) {
			return -1;
		}
		if (c1.getVotos()<c2.getVotos()) {
			return 1;
		}
		return 0;
	}

}
