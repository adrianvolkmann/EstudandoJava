package estudandoModificadorAcesso;

public class Principal {

	public static void main(String[] args) {
		
		//tem acesso a todos
		MinhaClasse minhaClasse = new MinhaClasse();

		minhaClasse.entidadeDefault = 1;

		minhaClasse.entidadeProtected = 1;

		minhaClasse.entidadePublica = 1;
	}

}
