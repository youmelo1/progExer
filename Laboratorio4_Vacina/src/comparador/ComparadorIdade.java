package comparador;

import java.util.Comparator;

import vacinacao.Paciente;

public class ComparadorIdade implements Comparator<Paciente>{
		public int compare(Paciente p1, Paciente p2) {
			if(p1.getIdade()>p2.getIdade()) {
				return -1;
			}
			if (p1.getIdade()<p2.getIdade()) {
				return 1;
			}
			return 0;
		}
}
