
public class FuncionarioAssalariado extends Funcionario {
	private double salarioSemanal;

	public FuncionarioAssalariado(String nome, String cpf, double salarioSemanal) {
		super(nome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return "-Funcionario Assalariado \nSalario semanal: " + salarioSemanal + "\nNome: " + getNome() + "\nCPF: " + getCpf();
	}
	
	
}
