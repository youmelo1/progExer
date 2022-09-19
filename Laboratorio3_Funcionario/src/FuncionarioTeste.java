import java.util.Scanner;
import java.io.*;



public class FuncionarioTeste {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = sc1.nextLine();
		System.out.println("Qual seu CPF?");
		String cpf = sc1.nextLine();

		Funcionario funcionario = new Funcionario(nome, cpf);

		System.out.println("Você é um: \n1)Funcionário assalariado?\n2)Funcionario horista?\n3)Funcionario comissionado?");
		int esc = sc1.nextInt();
		switch(esc) {
		case 1:
			System.out.println("Qual seu salário semanal?");
			double salario = sc1.nextDouble();
			FuncionarioAssalariado fAssalariado = new FuncionarioAssalariado(nome, cpf, salario);
			System.out.println(fAssalariado.toString());
			break;
		case 2:
			System.out.println("Qual seu salário semanal?");
			double salarioHorista = sc1.nextDouble();
			System.out.println("Quantas horas na semana você trabalhou?");
			double horaTrabalho = sc1.nextDouble();
			FuncionarioHorista fHora = new FuncionarioHorista(nome, cpf, salarioHorista, horaTrabalho);
			System.out.println(fHora.toString());
			break;
		case 3:
			System.out.println("Você tem um salário base? \n1)Não\n2)Sim");
			int esc2 = sc1.nextInt();
			switch(esc2) {
			case 1:
				System.out.println("Quanto é sua taxa de comissão?");
				double taxa = sc1.nextDouble();
				System.out.println("Quanto foi sua venda bruta? ");
				double vendaBruta = sc1.nextDouble();
				FuncionarioComissionado fComissionado = new FuncionarioComissionado(nome, cpf,taxa, vendaBruta);
				System.out.println(fComissionado.toString());
				break;
			case 2:
				System.out.println("Quanto é sua taxa de comissão?");
				double taxa2 = sc1.nextDouble();
				System.out.println("Quanto foi sua venda bruta? ");
				double vendaBruta2 = sc1.nextDouble();
				System.out.println("Qual seu salário?");
				double salarioBase = sc1.nextDouble();
				FuncionarioComissionadoBaseSalario fComissionadoBase = new FuncionarioComissionadoBaseSalario(nome, cpf,taxa2, vendaBruta2, salarioBase);
				System.out.println(fComissionadoBase.toString());
				break;
			default:
				System.out.println("Escolha uma das duas opções!");
				System.out.println("Você tem um salário base? \n1)Não\n2)Sim");
				esc2 = sc1.nextInt();
				break;
			}
			break;
		default:
			System.out.println("Escolha uma das duas opções!");
			System.out.println("Você é um: \n1)Funcionário assalariado?\n2)Funcionario horista?\n3)Funcionario comissionado?");
			esc = sc1.nextInt();
			break;


		}
	}
}

