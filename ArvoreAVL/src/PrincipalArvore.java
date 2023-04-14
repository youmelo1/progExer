import java.util.Scanner;

public class PrincipalArvore {
	public static void main(String[] args) {
		Arvore a =  new Arvore();
		
		Scanner sc = new Scanner(System.in);
		
		int[] x  = new int[] {1,7,6,10,9,12,14,13,11};
		
		for(int i =0; i<x.length; i++) {
			a.inserir(x[i]);
		}
		
		System.out.println("Em ordem:");
		a.emOrdem(a.getRaiz());
		System.out.println();
		System.out.println("Em pre ordem:");
		a.preOrdem(a.getRaiz());
		System.out.println();
		System.out.println("Em pos ordem:");
		a.posOrdem(a.getRaiz());
	}
}
