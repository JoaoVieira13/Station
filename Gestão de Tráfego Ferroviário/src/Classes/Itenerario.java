package Classes;

import java.time.LocalDate;

public class Itenerario {
    private String id_comboio;
    private String id_estacao_partida;
    private String id_estacao_chegada;
    private LocalDate partida;
    private LocalDate chegada;
    Troco troco;

    public String getId_comboio() {
        return this.id_comboio;
    }

    public void setId_comboio(String id_comboio) {
        this.id_comboio = id_comboio;
    }

    public String getId_estacao_partida() {
        return this.id_estacao_partida;
    }

    public void setId_estacao_partida(String id_estacao_partida) {
        this.id_estacao_partida = id_estacao_partida;
    }

    public String getId_estacao_chegada() {
        return this.id_estacao_chegada;
    }

    public void setId_estacao_chegada(String id_estacao_chegada) {
        this.id_estacao_chegada = id_estacao_chegada;
    }

    public LocalDate getPartida() {
        return this.partida;
    }

    public void setPartida(LocalDate partida) {
        this.partida = partida;
    }

    public LocalDate getChegada() {
        return this.chegada;
    }

    public void setChegada(LocalDate chegada) {
        this.chegada = chegada;
    }

    public Troco getTroco() {
        return this.troco;
    }
    
    public void setTroco(Troco troco) {
        this.troco = troco;
    }
}
