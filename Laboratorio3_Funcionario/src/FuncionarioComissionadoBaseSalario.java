
public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private double salario;

	public FuncionarioComissionadoBaseSalario(String nome, String cpf, double taxaComissao, double vendasBrutas,
			double salario) {
		super(nome, cpf, taxaComissao, vendasBrutas);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaRendimentosMaisSalario (double salario, double taxaComissao, double vendasBrutas) {
		double percentualVendas = vendasBrutas*100;
		return (taxaComissao*percentualVendas) + salario;
	}

	@Override
	public String toString() {
		return "Funcionario Comissionado com Salário Base \nTaxa de comissão: " + getTaxaComissao() + "\nVendas brutas: " + getVendasBrutas()
				+ "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nRendimentos mais o salário: " + calculaRendimentosMaisSalario(salario, getTaxaComissao(), getVendasBrutas());
	}
	
}
