package outroPacote;

import estudandoModificadorAcesso.MinhaClasse;

public class OutraExtendida extends MinhaClasse {

	public void metodoExtendida() {
		// nao tem acesso
//		this.entidadePrivada = 2;
		this.entidadePublica = 2;
		// nao tem acesso
//		this.entidadeDefault = 2;
		this.entidadeProtected = 2;
	}

}
