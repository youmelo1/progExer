import java.util.Scanner;

public class PrincipalArvore {
	public static void main(String[] args) {
		Arvore a =  new Arvore();
		
		Scanner sc = new Scanner(System.in);
		
		int[] x  = new int[] {5,3,7,4,2};
		
		for(int i =0; i<x.length; i++) {
			a.inserir(x[i]);
		}
		a.imprimirPreOrdem();
		a.procurar(5, a.getRaiz());
		System.out.println("--------------------");
		a.excluir(5, a.getRaiz());
		a.imprimirPreOrdem();
		a.procurar(5, a.getRaiz());
	}
}
