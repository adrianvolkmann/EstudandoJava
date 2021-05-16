package fonte;

public final class MinhaClasse {

	private final String descricao = "StringEstatica";

	public String getDescricao() {
		return descricao;
	}

	public final void imprimeDescricao() {
		System.out.println(descricao);
	}

	public final void imprimeVariavelFinal(final String variavel) {
		// nao permite
		//variavel =  "";

		System.out.println(variavel);
	}

}
