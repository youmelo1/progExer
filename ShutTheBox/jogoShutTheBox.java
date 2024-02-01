import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class jogoShutTheBox {
    public static void main(String[] args) {
        comecarJogo();
    }

    public static HashSet<Integer> criarListaDeNumeros() {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 1; i < 11; i++) {
            hash.add(i);
        }

        return hash;
    }

    public static void comecarJogo() {
        Scanner sc = new Scanner(System.in);
        String entrada = "";

        regras();

        HashSet<Integer> listaDeNumeros = criarListaDeNumeros();

        while (!listaDeNumeros.isEmpty()) {

            System.out.println("-----------------------------------------------------------");

            System.out.println("É preciso tirar os números: " + listaDeNumeros);
            int somaDados = rolagemDados();
            System.out.println("Qual(is) número(s) gostaria de tirar? (Coloque os números separados por um espaço)");
            entrada = sc.nextLine();

            int soma = somaDosNumerosEscolhidos(entrada);

            if (soma == 0) {
                break;
            }

            while (soma != somaDados || !checagemDeNumerosDuplicados(numerosEscolhidos(entrada)) || !checagemDeNumeroNaLista(listaDeNumeros, numerosEscolhidos(entrada))) {

                if (soma == 0 || !listaDeNumeros.isEmpty()) {
                    break;
                }

                if (soma != somaDados) {
                    System.out.println("A soma dos valores escolhidos não corresponde à soma dos dados, escolha outros números");
                    System.out.println("Ainda é preciso tirar os números: " + listaDeNumeros);
                    System.out.println("A soma do dados foi: " + somaDados);

                    System.out.println("Qual(is) número(s) gostaria de tirar? (Coloque os números separados por um espaço)");
                    entrada = sc.nextLine();
                    soma = somaDosNumerosEscolhidos(entrada);
                }

                if (!checagemDeNumerosDuplicados(numerosEscolhidos(entrada))) {
                    System.out.println("Os valores escolhidos estão duplicados");
                    System.out.println("Ainda é preciso tirar os números: " + listaDeNumeros);
                    System.out.println("A soma do dados foi: " + somaDados);

                    System.out.println("Qual(is) número(s) gostaria de tirar? (Coloque os números separados por um espaço)");
                    entrada = sc.nextLine();
                    soma = somaDosNumerosEscolhidos(entrada);
                }

                if (!checagemDeNumeroNaLista(listaDeNumeros, numerosEscolhidos(entrada))) {
                    System.out.println("Os valores escolhidos não podem ser retirados da lista ");
                    System.out.println("Ainda é preciso tirar os números: " + listaDeNumeros);
                    System.out.println("A soma do dados foi: " + somaDados);

                    System.out.println("Qual(is) número(s) gostaria de tirar? (Coloque os números separados por um espaço)");
                    entrada = sc.nextLine();
                    soma = somaDosNumerosEscolhidos(entrada);
                }

            }
            listaDeNumeros.removeAll(numerosEscolhidos(entrada));
        }

        if (listaDeNumeros.isEmpty()) {
            System.out.println("Parabéns, você ganhou!!!");
            System.out.println("Deseja jogar novamente [S/N]");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                comecarJogo();
            }
        } else {
            System.out.println("Você perdeu :(");
            System.out.println("Deseja jogar novamente [S/N]");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                comecarJogo();
            }
        }

        sc.close();
    }

    public static int dado() {
        Random random = new Random();

        return (int) random.nextInt(6) + 1;
    }

    public static int rolagemDados() {
        int a = dado();
        int b = dado();

        System.out.println("O primeiro dado rolou: " + a);
        System.out.println("O segundo dado rolou: " + b);
        System.out.println("A soma é: " + (a + b));

        return a + b;
    }

    public static int somaDosNumerosEscolhidos(String entrada) {
        String[] nums = entrada.split(" ");
        int soma = 0;

        for (int i = 0; i < nums.length; i++) {
            soma += Integer.parseInt(nums[i]);
        }

        return soma;
    }

    public static ArrayList<Integer> numerosEscolhidos(String entrada) {
        String[] nums = entrada.split(" ");
        ArrayList<Integer> numerosEscolhidos = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            numerosEscolhidos.add(Integer.parseInt(nums[i]));
        }

        return numerosEscolhidos;
    }

    public static boolean checagemDeNumeroNaLista(HashSet<Integer> nums, ArrayList<Integer> numsEscolhidos) {
        while (numsEscolhidos.size() != 0) {
            if (!nums.contains(numsEscolhidos.getFirst())) {
                return false;
            } else {
                numsEscolhidos.removeFirst();
            }
        }

        return true;
    }

    public static boolean checagemDeNumerosDuplicados(ArrayList<Integer> numsEscolhidos) {
        Set<Integer> set = new HashSet<>(numsEscolhidos);

        if (set.size() < numsEscolhidos.size()) {
            return false;
        }
        return true;
    }

    public static void regras() {
        System.out.println("O objetivo desse jogo é tirar todos os números da lista.");
        System.out.println("Se utiliza os valores dos dados para isso, ou seja, caso a soma dos dados dê 4,");
        System.out.println("poderá tirar o 4 ou os números cuja soma dê 4, como o 1 e o 3.");
        System.out.println("Digite o número 0 caso não consiga mais tirar algum número");
        System.out.println("Boa Sorte!!");
    }

}