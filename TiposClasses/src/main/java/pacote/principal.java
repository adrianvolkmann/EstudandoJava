package pacote;

import pacote.ClasseAninhada.ClassePublica;

public class principal {

	public static void main(String[] args) {

		
		
//		extracted2();
		
//		extracted();
		
	}

	private static void extracted2() {
		ClasseNormal  classeNormal = new ClasseNormal() {
			
			@Override //anotacao nao é obrigatoria, apenas facilita a leitura do fonte
			public void Ola() {
				System.out.println("Ola da ClasseAnonima");
			}
			
			public void novoTexto() {
				System.out.println("Texto Novo");
			}
			
		}; 
		
		
		classeNormal.Ola();
//		classeNormal.novoTexto();
	}

	private static void extracted() {
		ClasseAbstrata classeAbstrata = new ClasseAbstrata() {

			@Override
			public void imprimeHellow() {
				// TODO Auto-generated method stub
				System.out.println("new classe abstrata");
			}
		};
		
		classeAbstrata.imprimeHellow();
		classeAbstrata.metodoConcreto();

		ClasseFilha classeFilha = new ClasseFilha();
		
		
		classeFilha.imprimeHellow();
		classeFilha.metodoConcreto();
		
		System.out.println("");
		
		ClasseAninhada classeAninhada = new ClasseAninhada();
		classeAninhada.testaClasseAninhada();
		classeAninhada.a.ola();
	}

}
