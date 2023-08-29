import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    private int[][] assentos = new int[12][14]; 

    public void lugaresInfo() {
        char fileira = 'A';
        System.out.print("  ");
        for (int i = 1; i <= 14; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            System.out.print((char) (fileira + i) + " ");
            System.out.println(Arrays.toString(assentos[i]));
        }
    }

    public void reservar(int fileira, int lugar) {
        if (fileira >= 0 && fileira < 12 && lugar >= 1 && lugar <= 14) {
            if (assentos[fileira][lugar - 1] == 1) {
                System.out.println("Lugar já ocupado!");
            } else {
                assentos[fileira][lugar - 1] = 1;
            }
        } else {
            System.out.println("Este assento não existe!");
        }
    }

    public void cancelar(int fileira, int lugar) {
        if (fileira >= 0 && fileira < 12 && lugar >= 1 && lugar <= 14) {
            if (assentos[fileira][lugar - 1] == 0) {
                System.out.println("Lugar não está ocupado!");
            } else {
                assentos[fileira][lugar - 1] = 0;
            }
        } else {
            System.out.println("Este assento não existe!");
        }
    }

    public void assentosLivresOcupados() {
        int ocupados = 0;
        int livres = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 14; j++) {
                if (assentos[i][j] == 0) {
                    livres++;
                } else {
                    ocupados++;
                }
            }
        }
        System.out.println("Quantidade de lugares ocupados: " + ocupados);
        System.out.println("Quantidade de lugares livres: " + livres);
    }

    public void reservarAssento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de reservar o assento de qual fileira? (A-L): ");
        String input = scanner.next().toUpperCase(); 
        char fileira = input.charAt(0);
        System.out.println("Qual assento deseja reservar? (1-14): ");
        int lugar = scanner.nextInt();
        int fileiraIndex = fileira - 'A';
        reservar(fileiraIndex, lugar);
    }

    public void cancelarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de cancelar o assento de qual fileira? (A-L): ");
        String input = scanner.next().toUpperCase(); // Converte a entrada para maiúsculas
        char fileira = input.charAt(0);
        System.out.println("Qual reserva gostaria de cancelar? (1-14): ");
        int lugar = scanner.nextInt();
        int fileiraIndex = fileira - 'A';
        cancelar(fileiraIndex, lugar);
    }


	public void menu () {
		Scanner texto = new Scanner(System.in);
		System.out.println("Bem-vindo ao cinema, o que gostaria de fazer?");
		System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados sï¿½o marcados com o nï¿½mero 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
		System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
		int esc = texto.nextInt();

		while(esc != 5) {
			switch(esc) {
			case 1:
				lugaresInfo();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados sï¿½o marcados com o nï¿½mero 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 2:
				assentosLivresOcupados();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados sï¿½o marcados com o nï¿½mero 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 3:
				reservarAssento();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados sï¿½o marcados com o nï¿½mero 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 4:
				cancelarReserva();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados sï¿½o marcados com o nï¿½mero 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 5:
				System.out.println("Obrigado!");
				break;
			default:
				System.out.println("Essa nï¿½o ï¿½ uma opï¿½ï¿½o disponï¿½vel");
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados sï¿½o marcados com o nï¿½mero 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			}
		}
	}
}








