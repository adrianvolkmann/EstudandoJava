package pacote;

import java.util.ArrayList;
import java.util.List;

public class MinhaClasse {

	private List<String> lista = List.of("A", "B", "C");

	
	
	public EnviadorEmail Lambda() {

		//se esta variavel estar na classe, nao acontece o erro de compilacao
		//erro ocoore se estiver apenas dentro do metodo
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		listaPessoas.add(new Pessoa("Jose"));
		listaPessoas.add(new Pessoa("Marcos"));
		listaPessoas.add(new Pessoa("Rogerio"));

		listaPessoas.forEach(pessoa -> {
			enviadorEmail.enviaEmail(pessoa);
		});
		// erro compilacao
		// Local variable defined in an enclosing scope must be final or effectively
		// final
//			enviadorEmail = new EnviadorEmail();
		//pode retornar final
		return enviadorEmail;
	}

	public void executaMetodoLambda() {
		System.out.println("Executando Metodo Lambda");

		// lambda
//		lista.forEach((String letra) -> {
//			System.out.println("Letra= " + letra);
//		});

		// ja sabe o formato, n precisa definir
		// n precisa {} se for uma linha
//		lista.forEach((letra) -> System.out.println("Letra= " + letra));

		lista.forEach((String letra) -> {
			System.out.println("Letra= " + letra);
			System.out.println();

		});

		// transforma variavel contida na lambda em final
		// continuar aki

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
