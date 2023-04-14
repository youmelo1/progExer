
public class Arvore {

	private No raiz;

	public Arvore() {
	}

	public No getRaiz() {
		return raiz;
	}
	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}



	public int altura(No no) {
		return (no != null) ? no.getAltura() : 0;
	}

	public int fatorBalanceamento(No no) {
		return altura(no.getEsquerdo()) - altura(no.getDireito());
	}

	public void alturaNova(No no) {
		int maiorValor = Math.max(altura(no.getEsquerdo()), altura(no.getDireito()));
		no.setAltura(maiorValor + 1);
	}





	public No rotacaoSimplesEsquerda(No no) {
		No noDireito  = no.getDireito();
		no.setDireito(noDireito.getEsquerdo());
		noDireito.setEsquerdo(no);

		alturaNova(no);
		alturaNova(noDireito);

		return noDireito;
	}

	public No rotacaoSimplesDireita(No no) {
		No noEsquerdo  = no.getEsquerdo();
		no.setEsquerdo(noEsquerdo.getDireito());
		noEsquerdo.setDireito(no);


		alturaNova(no);
		alturaNova(noEsquerdo);

		return noEsquerdo;
	}


	public No rotacaoDuplaEsquerda(No no) {
		no.setDireito(rotacaoSimplesDireita(no.getDireito()));
		return rotacaoSimplesEsquerda(no);
	}

	public No rotacaoDuplaDireita(No no) {
		no.setEsquerdo(rotacaoSimplesEsquerda(no.getEsquerdo()));;
		return rotacaoSimplesDireita(no);
	}



	
	
	public No fazerRotacoes(No no) {

		if(fatorBalanceamento(no) == -2) {

			if(fatorBalanceamento(no.getDireito()) < 0) {
				no = rotacaoSimplesEsquerda(no);

			}else {
				no = rotacaoDuplaEsquerda(no);
			}

		}

		if(fatorBalanceamento(no) == 2) {

			if(fatorBalanceamento(no.getEsquerdo()) > 0) {
				no = rotacaoSimplesDireita(no);

			}else {
				no = rotacaoDuplaDireita(no);
			}

		}

		alturaNova(no);
		return no;
	}




	public void inserir(int valor) {
		raiz = inserirDepois(valor, raiz);

	}


	public No inserirDepois(int valor, No no) {
		if(no==null) {
			no = new No(valor);
		}else if(valor<no.getValor()) {
			no.setEsquerdo(inserirDepois(valor, no.getEsquerdo()));
		}else if(valor>no.getValor()) {
			no.setDireito(inserirDepois(valor, no.getDireito()));
		}else {
			return no;
		}

		no = fazerRotacoes(no);
		return no;
	}







	public void emOrdem(No n) {
		if(n != null) {
			emOrdem(n.getEsquerdo());
			System.out.print(n.getValor()+" ");
			emOrdem(n.getDireito());
		}
	}
	public void preOrdem(No n) {
		if(n != null) {
			System.out.print(n.getValor()+" ");
			preOrdem(n.getEsquerdo());
			preOrdem(n.getDireito());
		}
	}
	public void posOrdem(No n) {
		if(n != null) {
			posOrdem(n.getEsquerdo());
			posOrdem(n.getDireito());
			System.out.print(n.getValor()+" ");

		}
	}

}
