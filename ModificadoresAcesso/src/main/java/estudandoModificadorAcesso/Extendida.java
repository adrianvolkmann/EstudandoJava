package estudandoModificadorAcesso;

public class Extendida extends MinhaClasse {

	public void metodoExtendida() {
		// nao tem acesso
//		this.entidadePrivada = 2;
		this.entidadePublica = 2;
		this.entidadeDefault = 2;
		this.entidadeProtected = 2;
	}

}
