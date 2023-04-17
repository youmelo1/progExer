public class No {
	
	private int valor, altura;
	private No esquerdo, direito;
	
	public No(int valor) {
		this.valor = valor;
		altura = 1;
		esquerdo = null;
		direito = null;
	}
	
	public int getValor() {
		return valor;
	}
	public int getAltura() {
		return altura;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public No getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}
	public No getDireito() {
		return direito;
	}
	public void setDireito(No direito) {
		this.direito = direito;
	}



	
	
	
}
