package outroPacote;

import estudandoModificadorAcesso.MinhaClasse;

public class OutroPrincipal {

	public static void main(String[] args) {

		MinhaClasse minhaClasse = new MinhaClasse();
		// nao tem acesso
//		minhaClasse.entidadeDefault=1;
		// nao tem acesso
//		minhaClasse.entidadeProtected=1;

		minhaClasse.entidadePublica = 1;

	}

}
