package Classes;

public class Bilhete {
    int numero;
    Comboio comboio;

    public Bilhete(int numero, Comboio comboio) {
        this.numero = numero;
        this.comboio = comboio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Comboio getComboio() {
        return comboio;
    }

    public void setComboio(Comboio comboio) {
        this.comboio = comboio;
    }

}
