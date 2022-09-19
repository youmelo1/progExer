
public class FuncionarioComissionado extends Funcionario {
	private double taxaComissao, vendasBrutas;

	public FuncionarioComissionado(String nome, String cpf, double taxaComissao, double vendasBrutas) {
		super(nome, cpf);
		this.taxaComissao = taxaComissao;
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}
	
	
	public double rendimentos(double taxaComissao, double vendasBrutas) {
		double percentualVendas = vendasBrutas*100;
		return taxaComissao*percentualVendas;
	}

	@Override
	public String toString() {
		return "-Funcionario Comissionado \nTaxa de comissão: " + taxaComissao + "\nVendas brutas: " + vendasBrutas
				+ "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nRendimentos: " + rendimentos(taxaComissao, vendasBrutas);
	}
	
}
