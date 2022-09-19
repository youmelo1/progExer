import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Cinema {
	private int[] A = new int[14];
	private int[] B = new int[14];
	private int[] C = new int[14];
	private int[] D = new int[14];
	private int[] E = new int[14];
	private int[] F = new int[14];
	private int[] G = new int[14];
	private int[] H = new int[14];
	private int[] I = new int[14];
	private int[] J = new int[14];
	private int[] K = new int[14];
	private int[] L = new int[14];

	public void lugaresInfo() {
		System.out.print("A");
		System.out.println(Arrays.toString(A));
		System.out.print("B");
		System.out.println(Arrays.toString(B));
		System.out.print("C");
		System.out.println(Arrays.toString(C));
		System.out.print("D");
		System.out.println(Arrays.toString(D));
		System.out.print("E");
		System.out.println(Arrays.toString(E));
		System.out.print("F");
		System.out.println(Arrays.toString(F));
		System.out.print("G");
		System.out.println(Arrays.toString(G));
		System.out.print("H");
		System.out.println(Arrays.toString(H));
		System.out.print("I");
		System.out.println(Arrays.toString(I));
		System.out.print("J");
		System.out.println(Arrays.toString(J));
		System.out.print("K");
		System.out.println(Arrays.toString(K));
		System.out.print("L");
		System.out.println(Arrays.toString(L));
		System.out.println(" " + " 1  2  3  4  5  6  7  8  9  10 11 12 13 14");
	}

	public void reservarA (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < A.length; i++) {
				if(i == lugar-1) 
					if (A[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						A[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarB (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < B.length; i++) {
				if(i == lugar-1) 
					if (B[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						B[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarC (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < C.length; i++) {
				if(i == lugar-1) 
					if (C[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						C[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarD (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < D.length; i++) {
				if(i == lugar-1) 
					if (D[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						D[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarE (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < E.length; i++) {
				if(i == lugar-1) 
					if (E[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						E[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarF (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < F.length; i++) {
				if(i == lugar-1) 
					if (F[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						F[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarG (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < G.length; i++) {
				if(i == lugar-1) 
					if (G[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						G[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarH (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < H.length; i++) {
				if(i == lugar-1) 
					if (H[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						H[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarI (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < I.length; i++) {
				if(i == lugar-1) 
					if (I[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						I[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarJ (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < J.length; i++) {
				if(i == lugar-1) 
					if (J[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						J[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarK (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < K.length; i++) {
				if(i == lugar-1) 
					if (K[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						K[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void reservarL (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < L.length; i++) {
				if(i == lugar-1) 
					if (L[i] == 1)
						System.out.println("Lugar já ocupado!");
					else 
						L[i] = 1;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarA (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < A.length; i++) {
				if(i == lugar-1) 
					if (A[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						A[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarB (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < B.length; i++) {
				if(i == lugar-1) 
					if (B[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						B[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarC (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < C.length; i++) {
				if(i == lugar-1) 
					if (C[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						C[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarD (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < D.length; i++) {
				if(i == lugar-1) 
					if (D[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						D[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarE (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < E.length; i++) {
				if(i == lugar-1) 
					if (E[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						E[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarF (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < F.length; i++) {
				if(i == lugar-1) 
					if (F[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						F[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarG (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < G.length; i++) {
				if(i == lugar-1) 
					if (G[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						G[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarH (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < H.length; i++) {
				if(i == lugar-1) 
					if (H[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						H[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarI (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < I.length; i++) {
				if(i == lugar-1) 
					if (I[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						I[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarJ (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < A.length; i++) {
				if(i == lugar-1) 
					if (J[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						J[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarK (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < K.length; i++) {
				if(i == lugar-1) 
					if (K[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						K[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}
	public void cancelarL (int lugar) {
		if (lugar-1 >= 1 && lugar-1 < 14) {
			for (int i = 0; i < L.length; i++) {
				if(i == lugar-1) 
					if (L[i] != 1)
						System.out.println("Lugar não está ocupado!");
					else 
						L[i] = 0;
			}
		}else {
			System.out.println("Este assento não existe!");
		}
	}


	public void assentosLivresOcupados() {
		int ocupado = 0;
		int livre = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < B.length; i++) {
			if(B[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < C.length; i++) {
			if(C[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(D[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(E[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(F[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(G[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(H[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(I[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(J[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(K[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		for (int i = 0; i < A.length; i++) {
			if(L[i] == 0)
				livre += 1;
			else
				ocupado += 1;
		}
		System.out.println("Quantidade de lugares ocupados: "+ocupado);
		System.out.println("Quantidade de lugares livres: "+livre);
	}

	public void reservarAssento() {
		Scanner texto = new Scanner(System.in);
		System.out.println("Gostaria de reservar o assento de qual fileira?:\n1)A\n2)B\n3)C\n4)D");
		System.out.println("5)E\n6)F\n7)G\n8)H\n9)I\n10)J\n11)K\n12)L");
		int resEsc = texto.nextInt();
		switch(resEsc) {
		case 1:
			System.out.println("Qual assento deseja reservar? ");
			int lugarA = texto.nextInt();
			reservarA(lugarA);
			break;
		case 2:
			System.out.println("Qual assento deseja reservar? ");
			int lugarB = texto.nextInt();
			reservarB(lugarB);
			break;
		case 3:
			System.out.println("Qual assento deseja reservar? ");
			int lugarC = texto.nextInt();
			reservarC(lugarC);
			break;
		case 4:
			System.out.println("Qual assento deseja reservar? ");
			int lugarD = texto.nextInt();
			reservarD(lugarD);
			break;
		case 5:
			System.out.println("Qual assento deseja reservar? ");
			int lugarE = texto.nextInt();
			reservarE(lugarE);
			break;
		case 6:
			System.out.println("Qual assento deseja reservar? ");
			int lugarF = texto.nextInt();
			reservarF(lugarF);
			break;
		case 7:
			System.out.println("Qual assento deseja reservar? ");
			int lugarG = texto.nextInt();
			reservarG(lugarG);
			break;
		case 8:
			System.out.println("Qual assento deseja reservar? ");
			int lugarH = texto.nextInt();
			reservarH(lugarH);
			break;
		case 9:
			System.out.println("Qual assento deseja reservar? ");
			int lugarI = texto.nextInt();
			reservarI(lugarI);
			break;
		case 10:
			System.out.println("Qual assento deseja reservar? ");
			int lugarJ = texto.nextInt();
			reservarJ(lugarJ);
			break;
		case 11:
			System.out.println("Qual assento deseja reservar? ");
			int lugarK = texto.nextInt();
			reservarK(lugarK);
			break;
		case 12:
			System.out.println("Qual assento deseja reservar? ");
			int lugarL = texto.nextInt();
			reservarL(lugarL);
			break;
		default:
			System.out.println("A coluna não existe!");
		}

	}
	public void cancelarReserva() {
		Scanner texto = new Scanner(System.in);
		System.out.println("Gostaria de cancelar o assento de qual fileira?:\n1)A\n2)B\n3)C\n4)D");
		System.out.println("5)E\n6)F\n7)G\n8)H\n9)I\n10)J\n11)K\n12)L");
		int resEsc = texto.nextInt();
		switch(resEsc) {
		case 1:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarA = texto.nextInt();
			cancelarA(lugarA);
			break;
		case 2:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarB = texto.nextInt();
			cancelarB(lugarB);
			break;
		case 3:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarC = texto.nextInt();
			cancelarC(lugarC);
			break;
		case 4:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarD = texto.nextInt();
			cancelarD(lugarD);
			break;
		case 5:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarE = texto.nextInt();
			cancelarE(lugarE);
			break;
		case 6:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarF = texto.nextInt();
			cancelarF(lugarF);
			break;
		case 7:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarG = texto.nextInt();
			cancelarG(lugarG);
			break;
		case 8:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarH = texto.nextInt();
			cancelarH(lugarH);
			break;
		case 9:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarI = texto.nextInt();
			cancelarI(lugarI);
			break;
		case 10:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarJ = texto.nextInt();
			cancelarJ(lugarJ);
			break;
		case 11:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarK = texto.nextInt();
			cancelarK(lugarK);
			break;
		case 12:
			System.out.println("Qual reserva gostaria de cancelar? ");
			int lugarL = texto.nextInt();
			cancelarL(lugarL);
			break;
		default:
			System.out.println("A coluna não existe!");
		}
	}

	public void menu () {
		Scanner texto = new Scanner(System.in);
		System.out.println("Bem-vindo ao cinema, o que gostaria de fazer?");
		System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados são marcados com o número 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
		System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
		int esc = texto.nextInt();

		while(esc != 5) {
			switch(esc) {
			case 1:
				lugaresInfo();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados são marcados com o número 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 2:
				assentosLivresOcupados();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados são marcados com o número 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 3:
				reservarAssento();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados são marcados com o número 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 4:
				cancelarReserva();
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados são marcados com o número 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			case 5:
				System.out.println("Obrigado!");
				break;
			default:
				System.out.println("Essa não é uma opção disponível");
				System.out.println("\n1)Mostrar mapa dos assentos(os lugares ocupados são marcados com o número 1):\n2)Mostrar quantidade de assentos ocupados e livres:");
				System.out.println("3)Reservar um assento:\n4)Cancelar uma reserva de assento: \n5)Sair\n");
				esc = texto.nextInt();
				break;
			}
		}
	}
}








