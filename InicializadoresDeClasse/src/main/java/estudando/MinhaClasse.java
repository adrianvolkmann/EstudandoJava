package estudando;

public class MinhaClasse {

	private String descricao;
	private int valor;
	static int valorEstatico;

	// inicializador de classe
	static {
		valorEstatico = 55;
		System.out.println(valorEstatico);
	}

	// inicializador de instancia
	{
		System.out.println("Classe criada");
	}

	public MinhaClasse(String descricao) {
		super();
		this.descricao = descricao;
	}

	public MinhaClasse(int valor) {
		super();
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
