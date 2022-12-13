import java.util.Scanner;

import Views.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Menu.execMenu();

        int opcao = 0;

        do{
            opcao = scanner.nextInt();
            switch (opcao){
                case 0:
                    break;
                case 1:
                    Menu.menuComboios();
                    break;
                case 2:
                    Menu.menuEstacoes();
                    break;
                case 3:
                    Menu.menuTrocos();
                    break;
                case 4:
                    Menu.menuItenerarios();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while(opcao != 0);
        scanner.close();

            // Comboio c1 = new Comboio("2", "Lisboa", 10);
            //CriarComboio criarComboio = new CriarComboio();
            // SalvarComboios salvarComboios = new SalvarComboios();

            // criarComboio.executar(salvarComboios);
      
            // ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Comboios.txt"));
            // out.writeObject(c1);
      
            // ObjectInputStream in = new ObjectInputStream(new FileInputStream("Comboios.txt"));
            // Comboio c2 = (Comboio) in.readObject();
      
            // System.out.println(c2.getId());
            // System.out.println(c2.getDestino());
            // System.out.println(c2.getPassageiros());

        // CriarComboio criarComboio = new CriarComboio();
        // SalvarComboios salvarComboios = new SalvarComboios();

        // criarComboio.executar(salvarComboios);
        // System.out.println(salvarComboios.getComboio(0).getId());
        
        // ArmazenarComboios.Write(salvarComboios);
    }
}