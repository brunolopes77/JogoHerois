package FuncionalidadeDoMenu;

import Heroi.Heroi;
import Heroi.Arqueiro;
import Heroi.Guerreiro;
import Heroi.Mago;

import java.util.Scanner;

public class FuncMenu {

    private Heroi[] herois;
    private int quantidadeHerois;

    public FuncMenu() {
        herois = new Heroi[20];
        quantidadeHerois = 0;
    }

    public void cadastrarHeroi(Scanner scanner) {

        if (quantidadeHerois >= 20) {
            System.out.println("Limite de 20 heróis atingido.");
            return;
        }

        System.out.println("\n=== CADASTRAR HERÓI ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Nível: ");
        int nivel = scanner.nextInt();

        System.out.print("Vida: ");
        int vida = scanner.nextInt();

        System.out.println("\nEscolha a classe:");
        System.out.println("1. Heroi.Guerreiro");
        System.out.println("2. Heroi.Mago");
        System.out.println("3. Heroi.Arqueiro");
        System.out.print("Opção: ");

        int classe = scanner.nextInt();

        switch (classe) {

            case 1:
                System.out.print("Força: ");
                int forca = scanner.nextInt();

                System.out.print("Resistência: ");
                int resistencia = scanner.nextInt();

                System.out.print("Energia: ");
                int energia = scanner.nextInt();

                herois[quantidadeHerois] =
                        new Guerreiro(nome, nivel, vida,
                                forca, resistencia, energia);

                quantidadeHerois++;

                System.out.println("Heroi.Guerreiro cadastrado!");
                break;

            case 2:
                System.out.print("Mana: ");
                int mana = scanner.nextInt();

                System.out.print("Poder Mágico: ");
                int poderMagico = scanner.nextInt();

                System.out.print("Inteligência: ");
                int inteligencia = scanner.nextInt();

                herois[quantidadeHerois] =
                        new Mago(nome, nivel, vida,
                                mana, poderMagico, inteligencia);

                quantidadeHerois++;

                System.out.println("Heroi.Mago cadastrado!");
                break;

            case 3:
                System.out.print("Precisão: ");
                int precisao = scanner.nextInt();

                System.out.print("Agilidade: ");
                int agilidade = scanner.nextInt();

                System.out.print("Concentração: ");
                int concentracao = scanner.nextInt();

                herois[quantidadeHerois] =
                        new Arqueiro(nome, nivel, vida,
                                precisao, agilidade, concentracao);

                quantidadeHerois++;

                System.out.println("Heroi.Arqueiro cadastrado!");
                break;

            default:
                System.out.println("Classe inválida.");
        }

        scanner.nextLine();
    }

    public void listarHerois() {

        System.out.println("\n=== HERÓIS CADASTRADOS ===");

        if (quantidadeHerois == 0) {
            System.out.println("Nenhum herói cadastrado.");
            return;
        }

        for (int i = 0; i < quantidadeHerois; i++) {

            System.out.println("\n--- Herói " + (i + 1) + " ---");

            herois[i].exibirDados();
        }
    }

    public void buscarHeroi(String nome) {

        for (int i = 0; i < quantidadeHerois; i++) {

            if (herois[i].getNome().equalsIgnoreCase(nome)) {

                System.out.println("\n=== HERÓI ENCONTRADO ===");
                herois[i].exibirDados();

                return;
            }
        }

        System.out.println("Herói não encontrado.");
    }

    public void exibirRelatorio() {

        if (quantidadeHerois == 0) {
            System.out.println("\nNenhum herói cadastrado.");
            return;
        }

        int quantidadeGuerreiros = 0;
        int quantidadeMagos = 0;
        int quantidadeArqueiros = 0;

        int somaNiveis = 0;

        Heroi heroiMaisForte = herois[0];

        for (int i = 0; i < quantidadeHerois; i++) {

            Heroi heroi = herois[i];

            if (heroi instanceof Guerreiro) {
                quantidadeGuerreiros++;
            }

            if (heroi instanceof Mago) {
                quantidadeMagos++;
            }

            if (heroi instanceof Arqueiro) {
                quantidadeArqueiros++;
            }

            somaNiveis += heroi.getNivel();

            if (heroi.getNivel() > heroiMaisForte.getNivel()) {
                heroiMaisForte = heroi;
            }
        }

        double mediaNivel = (double) somaNiveis / quantidadeHerois;

        System.out.println("\n========= RELATÓRIO =========");
        System.out.println("Total de Heróis: " + quantidadeHerois);
        System.out.println("Quantidade de Guerreiros: " + quantidadeGuerreiros);
        System.out.println("Quantidade de Magos: " + quantidadeMagos);
        System.out.println("Quantidade de Arqueiros: " + quantidadeArqueiros);
        System.out.println("Média de nível: " + mediaNivel);
        System.out.println("Herói mais forte: " + heroiMaisForte.getNome());
    }

}

