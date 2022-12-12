package Services;

import java.util.Scanner;
import Classes.Comboio;

public class CriarComboio {
    Scanner scanner = new Scanner(System.in);

    public void executar(){
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
    System.out.println("Comboio criado com sucesso!");	
    System.out.println("Id: " + comboio.getId());
    System.out.println("Destino: " + comboio.getDestino());
    System.out.println("Passageiros: " + comboio.getPassageiros());
    }
}