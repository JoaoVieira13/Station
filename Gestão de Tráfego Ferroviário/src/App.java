import Armazenamento.SalvarComboios;
import Services.CriarComboio;

public class App {
    public static void main(String[] args){

        CriarComboio criarComboio = new CriarComboio();
        SalvarComboios salvarComboios = new SalvarComboios();
        
        criarComboio.executar(salvarComboios);
    }
}