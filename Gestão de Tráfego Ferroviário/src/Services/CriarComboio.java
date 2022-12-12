package Services;

import java.util.Scanner;
import Classes.Comboio;
import Armazenamento.SalvarComboios;

public class CriarComboio {
    Scanner scanner = new Scanner(System.in);

    public void executar(SalvarComboios repositorio){
    String id, destino;
    int passageiros;

    Comboio comboio = new Comboio();
    
    // Formulário -------------------------------------------------------
    System.out.println("\n");
    System.out.print("Id do Comboio -> ");
    id = scanner.nextLine();
    System.out.print("Destino do Comboio -> ");
    destino = scanner.nextLine();
    System.out.print("Número de passageiros no Comboio -> ");
    passageiros = scanner.nextInt();
    // -------------------------------------------------------------------

    comboio = new Comboio(id, destino, passageiros);
        repositorio.addComboio(comboio);
        System.out.println(repositorio.toString());
        // System.out.println(id);
        // System.out.println(destino);
        // System.out.println(passageiros);
    }
}