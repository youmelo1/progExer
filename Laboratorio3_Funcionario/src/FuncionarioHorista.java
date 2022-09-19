
public class FuncionarioHorista extends Funcionario{
	private double salarioHora, horaTrabalho;
	

	public FuncionarioHorista(String nome, String cpf, double salarioHora, double horaTrabalho) {
		super(nome, cpf);
		this.salarioHora = salarioHora;
		this.horaTrabalho = horaTrabalho;
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHoraTrabalho() {
		return horaTrabalho;
	}

	public void setHoraTrabalho(double horaTrabalho) {
		this.horaTrabalho = horaTrabalho;
	}
	
	

	public double calculaSalario (double salarioHora, double horaTrabalho) {
		double salario = 0;
		if(horaTrabalho<40) {
			salario += horaTrabalho*salarioHora;
		}else {
			salario += (40*salarioHora)+(horaTrabalho-40)*salarioHora*1.5;
		}
		return salario;
	}

	@Override
	public String toString() {
		return "FuncionarioHorista \nSalário por hora: " + salarioHora + "\nHoras de trabalho: " + horaTrabalho + "\nNome: "
				+ getNome() + "\nCPF: " + getCpf() + "\nSalario final: "+ calculaSalario(salarioHora, horaTrabalho);
	}
	
	
}
