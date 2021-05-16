package estudando;

public class Principal {

	//https://www.infoworld.com/article/3040564/java-101-class-and-object-initialization-in-java.html
	
	public static void main(String[] args) {

		MinhaClasse gato = new MinhaClasse("Gato");
		MinhaClasse passaro = new MinhaClasse("Passaro");
		MinhaClasse valor = new MinhaClasse(5);
		
//		passaro= gato;
//		passaro.setDescricao("porco");
		//2 objeto apontando mesmma referencia
		
		System.out.println("gato: " + gato.getDescricao());
		System.out.println("passaro: " + passaro.getDescricao());
		System.out.println(MinhaClasse.valorEstatico);
		
//		extracted();

	}

	private static void extracted() {
		int a = 10;
		int b = a;
		a = 15;
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		//result 15
		//result 10
	}

}
