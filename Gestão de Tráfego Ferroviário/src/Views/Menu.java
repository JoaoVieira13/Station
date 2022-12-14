package Views;

import java.util.Scanner;

import Armazenamento.ArmazenarComboios;
import Armazenamento.SalvarComboios;
import Services.CriarComboio;

public class Menu {
    private Menu() {}

    public static void execMenu() {
        System.out.println("\n");
        System.out.println("\tBem-Vindo á aplicação de gestão de tráfego ferroviário!");
        System.out.println("\n");
        System.out.println("\t\t\t0. Sair");
        System.out.println("\t\t\t1. Gerir Comboios");
        System.out.println("\t\t\t2. Gerir Estações");
        System.out.println("\t\t\t3. Gerir Troços");
        System.out.println("\t\t\t4. Gerir Itenerários");
        System.out.println("\n");
        System.out.print("Escolha uma opcão: ");
        System.out.println("\n");
      }

      public static void menuComboios(){
        System.out.println("\n");
        System.out.println("\t\tGestão de Comboios da ferrovia!");
        System.out.println("\n");
        System.out.println("\t\t\t0. Voltar");
        System.out.println("\t\t\t1. Criar Comboio");
        System.out.println("\t\t\t2. Editar Comboio");
        System.out.println("\t\t\t3. Eliminar Comboio");
        System.out.println("\t\t\t4. Listar Comboios");
        System.out.println("\n");
        System.out.print("Escolha uma opcão: ");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                Menu.execMenu();
                break;
            case 1:
                CriarComboio criarComboio = new CriarComboio();
                SalvarComboios salvarComboios = new SalvarComboios();
                ArmazenarComboios armazenarComboios = new ArmazenarComboios();

                criarComboio.executar(salvarComboios);
                armazenarComboios.Write(salvarComboios);
                break;
            case 2:
                // EditarComboio.editarComboio();
                break;
            case 3:
                // EliminarComboio.eliminarComboio();
                break;
            case 4:
                // ListarComboios.listarComboios();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
      }

      public static void menuEstacoes(){
        System.out.println("\n");
        System.out.println("\t\tGestão de Estações da ferrovia!");
        System.out.println("\n");
        System.out.println("\t\t\t0. Voltar");
        System.out.println("\t\t\t1. Criar Estação");
        System.out.println("\t\t\t2. Editar Estação");
        System.out.println("\t\t\t3. Eliminar Estação");
        System.out.println("\t\t\t4. Listar Estações");
        System.out.println("\n");
        System.out.print("Escolha uma opcão: ");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                Menu.execMenu();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        } 
        // scanner.close();
      } 

      public static void menuTrocos(){
        System.out.println("\n");
        System.out.println("\t\tGestão de Troços da ferrovia!");
        System.out.println("\n");
        System.out.println("\t\t\t0. Voltar");
        System.out.println("\t\t\t1. Criar Troço");
        System.out.println("\t\t\t2. Editar Troço");
        System.out.println("\t\t\t3. Eliminar Troço");
        System.out.println("\t\t\t4. Listar Troços");
        System.out.println("\n");
        System.out.print("Escolha uma opcão: ");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                Menu.execMenu();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        } 
        // scanner.close();
      } 

       public static void menuItenerarios(){
        System.out.println("\n");
        System.out.println("\t\tGestão de Itenerários da ferrovia!");
        System.out.println("\n");
        System.out.println("\t\t\t0. Voltar");
        System.out.println("\t\t\t1. Criar Itenerário");
        System.out.println("\t\t\t2. Editar Itenerário");
        System.out.println("\t\t\t3. Eliminar Itenerário");
        System.out.println("\t\t\t4. Listar Itenerários");
        System.out.println("\n");
        System.out.print("Escolha uma opcão: ");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                Menu.execMenu();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        } 
        // scanner.close();
      } 
} 
