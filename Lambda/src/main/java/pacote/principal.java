package pacote;

public class principal {

	public static void main(String[] args) {

		MinhaClasse minhaClasse = new MinhaClasse();
//		minhaClasse.executaMetodoLambda();
//		minhaClasse.executaMetodoFor();

		EnviadorEmail lambda = minhaClasse.Lambda();
		// mesmo retornando final, pode ser alterado posteriormete
		lambda = new EnviadorEmail();

	}

}
