package classes;

public class Computador {

	private String computador;

	public Computador(String computador) {
		super();
		this.computador = computador;
	}

	public String getComputador() {
		return computador;
	}

	public void setComputador(String computador) {
		this.computador = computador;
	}

	@Override
	public String toString() {
		return "computador [computador=" + computador + "]";
	}

}
