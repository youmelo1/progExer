package lugares;

public class Trechos {
	private String c1, c2;
	private double valor;
	
	
	public Trechos(String c1, String c2, double valor) {
		this.c1 = c1;
		this.c2 = c2;
		this.valor = valor;
	}
	
	
	public double getValor() {
		return valor;
	}
	
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public String getC1() {
		return c1;
	}
	
	
	public String getC2() {
		return c2;
	}
	
	
	@Override
	public String toString() {
		return "Trechos [De: " + c1 + ", para: " + c2 + ", teve custo de: R$" + valor + "]";
	}
	
	
}
