package Classes;

import java.lang.reflect.Array;

public class Estacao {
    private String id;
    private String nome;
    private Array id_comboio;
    private int numLinhas;
    private int capacidade;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Array getId_comboio() {
        return this.id_comboio;
    }

    public void setId_comboio(Array id_comboio) {
        this.id_comboio = id_comboio;
    }

    public int getNumLinhas() {
        return this.numLinhas;
    }

    public void setNumLinhas(int numLinhas) {
        this.numLinhas = numLinhas;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
