import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Heroi[] herois = new Heroi[20];
        int quantidadeHerois = 0;

        while (quantidadeHerois < 20) {

            System.out.println("--- CADASTRO DE HERÓI ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nível: ");
            int nivel = scanner.nextInt();

            System.out.print("Vida: ");
            int vida = scanner.nextInt();

            System.out.print("Mana: ");
            int mana = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Classe: ");
            String classe = scanner.nextLine();

            herois[quantidadeHerois] = new Heroi(
                    nome,
                    nivel,
                    vida,
                    mana,
                    classe
            );

            quantidadeHerois++;

            System.out.print("\nDeseja cadastrar outro herói? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("--- HERÓIS CADASTRADOS ---");

        for (int i = 0; i < quantidadeHerois; i++) {

            System.out.println("\nHerói " + (i + 1));

            herois[i].exibirDados();
        }
    }
}