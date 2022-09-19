
public class Conta {
	private double saldo;
	private String numero;
	
	public Conta(String numero) {
		this.saldo = 0;
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void depositar(double valorDepositado){
        if (valorDepositado<0){
            System.out.println("ERRO");
        }else{
            saldo += valorDepositado;
            
        }
        System.out.println("Saldo atual: "+saldo);
    }
    
    public void sacar(double valorSacado){
        if (valorSacado<0){
            System.out.println("ERRO");
        }
        if(valorSacado>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valorSacado;
            
        }
        System.out.println("Saldo atual: "+saldo);
    }
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + "]";
	}
    
	public void imprimeSaldo(){
        System.out.println("Saldo da conta: "+saldo);
    }
	
}
