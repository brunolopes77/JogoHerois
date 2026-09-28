package Main;

import FuncionalidadeDoMenu.FuncMenu;
import Missao.Missao;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Missao missao = new Missao("x1 com o boss",10,500);
        FuncMenu funcMenu = new FuncMenu();

        int opcao;

        do {

            System.out.println("\n===== ACADEMIA DE HERÓIS =====");
            System.out.println("1. Cadastrar herói");
            System.out.println("2. Listar heróis");
            System.out.println("3. Buscar herói pelo nome");
            System.out.println("4. Relatório");
            System.out.println("5. Missao");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    funcMenu.cadastrarHeroi(scanner);
                    break;

                case 2:
                    funcMenu.listarHerois();
                    break;

                case 3:
                    System.out.print("Digite o nome do herói: ");
                    String nome = scanner.nextLine();

                    funcMenu.buscarHeroi(nome);
                    break;

                case 4:
                     funcMenu.exibirRelatorio();
                    break;

                case 5:
                    String nomeHeroi;
                    System.out.println("Digite o nome do heroi que vai fazer a missão");
                    nomeHeroi= scanner.nextLine();
                    missao.setHeroiMissao(nomeHeroi);
                    missao.iniciarMissao();
                    missao.concluirMissao();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}