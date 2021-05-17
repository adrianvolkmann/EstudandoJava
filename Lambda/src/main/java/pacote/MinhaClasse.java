package pacote;

import java.util.List;

public class MinhaClasse {

	private List<String> lista = List.of("A", "B", "C");

	public void executaMetodoLambda() {
		System.out.println("Executando Metodo Lambda");

		// lambda
//		lista.forEach((String letra) -> {
//			System.out.println("Letra= " + letra);
//		});
		
		//ja sabe o formato, n precisa definir
		//n precisa {} se for uma linha
		lista.forEach((letra) -> System.out.println("Letra= " + letra));
		
		//transforma variavel contida na lambda em final
		//continuar aki

		System.out.println();
	}

	public void executaMetodoFor() {
		System.out.println("Executando Metodo For");
		List<String> lista = List.of("A", "B", "C");

		for (String letra : lista) {
			System.out.println("Letra= " + letra);
		}

		System.out.println();
	}

}
