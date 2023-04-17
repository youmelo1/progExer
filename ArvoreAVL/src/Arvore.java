
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

	public boolean arvoreVazia() {
		return raiz==null;
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







	public int menorValor(No no){
		while(no.getEsquerdo() != null) {
			no = no.getEsquerdo();
		}
		return no.getValor();
	}

	private int maiorValor(No no) {
		while (no.getDireito() != null) {
			no = no.getDireito();
		}
		return no.getValor();
	}



	public No excluir(int valor, No no){

		arvoreDuasFolhasOuMenos(valor);

		if (no == null) {
			return null;
		}


		if (valor<no.getValor()) {
			no.setEsquerdo(excluir(valor, no.getEsquerdo()));

		} else if (valor>no.getValor()) {
			no.setDireito(excluir(valor, no.getDireito()));

		} else {


			if (no.getEsquerdo() == null) {
				return no.getDireito();


			} else if (no.getDireito() == null) {
				return no.getEsquerdo();


			} else {


				if (no.getEsquerdo().getAltura() > no.getDireito().getAltura()) {

					int maiorValorPelaEsquerda = maiorValor(no.getEsquerdo());
					no.setValor(maiorValorPelaEsquerda);


					no.setEsquerdo(excluir(maiorValorPelaEsquerda, no.getEsquerdo()));

				} else {

					int menorValorPelaDireita = menorValor(no.getDireito());
					no.setValor(menorValorPelaDireita);

					no.setDireito(excluir(menorValorPelaDireita, no.getDireito()));

				}
			}
		}
		alturaNova(no);

		return fazerRotacoes(no);
	}


	public void arvoreDuasFolhasOuMenos(int valor) {
		int quant = tamanhoDaArvore(raiz);
		No vazio = null;


		if(quant==1) {
			if(raiz.getValor()==valor) {
				raiz=null;
			}
		}else if(quant==2) {

			if(raiz.getValor()==valor) {
				if(raiz.getEsquerdo()==null) {
					raiz = raiz.getDireito();
				}else {
					raiz = raiz.getEsquerdo();
				}
			}else {
				if(raiz.getEsquerdo().getValor()==valor) {
					raiz.setEsquerdo(vazio);
				}else if(raiz.getDireito().getValor()==valor){
					raiz.setDireito(vazio);
				}
			}
		}


	}





	public int tamanhoDaArvore(No no) {
		if (no == null) {
			return 0;
		}

		int quantEsquerdo = tamanhoDaArvore(no.getEsquerdo());
		int quantDireito = tamanhoDaArvore(no.getDireito());

		return (1 + quantEsquerdo + quantDireito);


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

		if(fatorBalanceamento(no) <-1) {

			if(fatorBalanceamento(no.getDireito()) < 0) {
				no = rotacaoSimplesEsquerda(no);

			}else {
				no = rotacaoDuplaEsquerda(no);
			}

		}

		if(fatorBalanceamento(no) >1) {

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


	public No procurar(int valor, No no) {

		if(no!=null) {
			if(no.getValor()==valor) {
				System.out.println("Valor está na árvore :)");
				return no;
			}
			if(valor>no.getValor()) {
				return procurar(valor, no.getDireito());
			}else {
				return procurar(valor, no.getEsquerdo());

			}
		}
		System.out.println("Valor não está na árvore :(");

		return null;

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

	public void imprimirEmOrdem() {
		emOrdem(raiz);
		System.out.println();
	}

	public void imprimirPreOrdem() {
		preOrdem(raiz);
		System.out.println();
	}

	public void imprimirPosOrdem() {
		posOrdem(raiz);
		System.out.println();
	}



}
