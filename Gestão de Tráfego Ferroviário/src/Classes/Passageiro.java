package Classes;

public class Passageiro {
    int numero;
    String nome;
    Bilhete bilhete;

    public Passageiro(int numero, String nome, Bilhete bilhete) {
        this.numero = numero;
        this.nome = nome;
        this.bilhete = bilhete;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }
}