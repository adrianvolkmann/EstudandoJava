package fonte;

public class Principal {

	public static void main(String[] args) {

		
		MinhaClasse minhaClasse = new MinhaClasse();
			
		//nao permite extender classe
		//nao permite classe anonima
//		MinhaClasse minhaClasse2 = new MinhaClasse() {
//			
//			//Nao pode sobreescrever metodo final
////			@Override
////			public  void imprimeDescricao() {
////				System.out.println(descricao);
////			}
//		};
		
		minhaClasse.imprimeDescricao();
		minhaClasse.imprimeVariavelFinal("Ola");
		
	}

}
