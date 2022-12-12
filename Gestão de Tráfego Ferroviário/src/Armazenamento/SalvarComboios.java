package Armazenamento;

import java.util.ArrayList;
import Classes.Comboio;

public class SalvarComboios {
    private static final ArrayList<Comboio> comboiosArray = new ArrayList<>();
    
    public SalvarComboios(){
    }

    public void addComboio(Comboio comboio){
        comboiosArray.add(comboio);
    }

    public int existeComboio(Comboio id){
        return comboiosArray.indexOf(id);
    }

    public Comboio getComboio(int index){
        return comboiosArray.get(index);
    }

    public void atualizarComboio(int index, Comboio comboio){
        comboiosArray.set(index, comboio);
    }

    public void removerComboio(int index){
        comboiosArray.remove(index);
    }

    // Receber Lista de todos os Comboios registados
    @Override
    public String toString() {
      return "{" +
        " Todos os Comboios ='" + comboiosArray + "'" +
        "}";
    }
}
