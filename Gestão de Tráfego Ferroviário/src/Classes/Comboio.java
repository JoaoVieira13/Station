package Classes;

public class Comboio {
    private String id;
    private String destino;
    private int passageiros;

    public Comboio() {
    }

    public Comboio( String id, String destino, int passageiros) {
        this.id = id;
        this.destino = destino;
        this.passageiros = passageiros;
    }

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPassageiros() {
		return this.passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

}

