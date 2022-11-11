package telefone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Funcionalidades {
	
	private List<Contato> agenda = new ArrayList<>();
	private List<String> chamadasNaoAtendidas = new ArrayList<>();

	
	public List<Contato> getAgenda() {
		return agenda;
	}

	public List<String> getChamadasNaoAtendidas() {
		return chamadasNaoAtendidas;
	}



	public void contatosNaAgenda() {
		for(int i = 0; i<agenda.size();i++) {
			System.out.println(agenda.get(i).getNome()+" ("+agenda.get(i).getNumero()+")");
		}
	}
	
	
	public void contatosInfo() {
		for(int i = 0; i<agenda.size();i++) {
			System.out.println((i+1)+") "+agenda.get(i).getNome()+" ("+agenda.get(i).getNumero()+")");
		}
	}
	
	public void cadastrarContato(Contato contato) {
		agenda.add(contato);
	}
	
	public void removerContato(int i) {
		agenda.remove(i-1);
	}
	
	public void cadastrarChamadaNaoAtendida(String num) {
		chamadasNaoAtendidas.add(num); 		
	}

	public void excluirChamadasNaoAtendidas() {
		chamadasNaoAtendidas.removeAll(chamadasNaoAtendidas);	
	}
	
	public void mostrarChamadasNaoAtendidas() {	
		List<String> temp = new ArrayList<>();

		if(getAgenda().size()!=0) {
			for(String num : getChamadasNaoAtendidas()) {
				for(int i = 0; i<getAgenda().size(); i++) {
					if(num.equalsIgnoreCase(getAgenda().get(i).getNumero())) {
						System.out.println(num+"("+getAgenda().get(i).getNome()+")");
						temp.add(num);
						
				}
			}
		}
			for(String s : getChamadasNaoAtendidas()) {
				for(String num : temp) {
					if(!temp.contains(s)) {
						System.out.println(s);
						break;
					}
				}
			}
			temp.removeAll(temp);
		}else {
			for(String s : getChamadasNaoAtendidas()) {
				System.out.println(s);
			}
		}
	}
	
	public void opcoes() {
		System.out.println("--------------------");
		System.out.println("[1] Cadastrar contato\r\n"
				+ "[2] Remover contato\r\n"
				+ "[3] Cadastrar chamada não atendida\r\n"
				+ "[4] Mostrar lista de chamadas não atendidas\r\n"
				+ "[5] Excluir todas chamadas não atendidas\r\n"
				+ "[6] Mostrar contatos \n[7] Sair");
	}
	

}
