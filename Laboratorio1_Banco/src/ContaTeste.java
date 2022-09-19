import java.util.Scanner;

public class ContaTeste {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Qual o numero de sua conta?");
		String numConta = texto.nextLine();
		Conta conta = new Conta(numConta);

		System.out.println("O que deseja fazer?\nDigite 1 para depositar:\nDigite 2 para sacar:\nDigite 3 para ver o saldo de sua conta:\nDigite 4 para sair:\n");

		int esc = texto.nextInt();

		while(esc == 1 || esc == 2 || esc == 3) {
			switch(esc) {
			case 1:
				System.out.println("Quanto quer depositar?");
				double valorDepositado = texto.nextDouble();
				conta.depositar(valorDepositado);
				System.out.println("O que deseja fazer?\nDigite 1 para depositar:\nDigite 2 para sacar:\nDigite 3 para ver o saldo de sua conta:\nDigite 4 para sair:\n");
				esc = texto.nextInt();
				break;
			case 2:
				System.out.println("Quanto quer sacar?");
				double valorSacado = texto.nextDouble();
				conta.sacar(valorSacado);
				System.out.println("O que deseja fazer?\nDigite 1 para depositar:\nDigite 2 para sacar:\nDigite 3 para ver o saldo de sua conta:\nDigite 4 para sair:\n");
				esc = texto.nextInt();
				break;
			case 3:
				conta.imprimeSaldo();
				System.out.println("O que deseja fazer?\nDigite 1 para depositar:\nDigite 2 para sacar:\nDigite 3 para ver o saldo de sua conta:\nDigite 4 para sair:\n");
				esc = texto.nextInt();
				break;
			}
		}
	}
}
