package Armazenamento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArmazenarComboios {

    private ArmazenarComboios() {
    }

    public static int Write(SalvarComboios comboios) {
        try (FileOutputStream fs = new FileOutputStream("Comboios.arq");
        ObjectOutputStream os = new ObjectOutputStream(fs)) {
          
          
          os.writeObject(comboios); //referencia a estrutura que se quer armazenar
          os.close( );
          System.out.println("Comboios Guardados com Sucesso!");
          return 0;
        }catch(Exception ex){
          return -1;     
        }
    }

    public static SalvarComboios lerDados(String nomeFicheiro){
        try (FileInputStream fs = new FileInputStream(nomeFicheiro);
        ObjectInputStream os = new ObjectInputStream(fs)) {
          
          SalvarComboios novaRepoComboios = new SalvarComboios();
          
          novaRepoComboios = (SalvarComboios)os.readObject(); //referencia a estrutura que se quer armazenar
          
          System.out.println("Comboios Carregados com Sucesso!");
          os.close( );
          return novaRepoComboios;
        } catch (Exception ex) {
          System.out.println(ex.toString());
          return null;
        }
    }   
}
