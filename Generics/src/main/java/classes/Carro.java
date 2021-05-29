package classes;

public class Carro {

	private String carro;

	public Carro(String carro) {
		super();
		this.carro = carro;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	@Override
	public String toString() {
		return "Carro [carro=" + carro + "]";
	}

}
