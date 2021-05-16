package pacote;

public class ClasseAninhada {

	public ClassePublica a=  new ClassePublica();
	
	public void ola() {
		System.out.println("ClasseAninhada");
	}

	public void testaClasseAninhada() {
		ClassePrivada classePrivada = new ClassePrivada();
		classePrivada.ola();

		ClassePublica classePublica = new ClassePublica();
		classePublica.ola();

	}

	private class ClassePrivada {

		public ClassePrivada() {
			System.out.println("construtor da ClassePrivada");
		}

		public void ola() {
			System.out.println("Ola da ClassePrivada");
		}
	}

	public class ClassePublica {

		public  int varQualquer = 0;
		
		public ClassePublica() {
			System.out.println("construtor da ClassePublica");
		}

		public void ola() {
			System.out.println("Ola da ClassePublica ");
		}
	}

}
