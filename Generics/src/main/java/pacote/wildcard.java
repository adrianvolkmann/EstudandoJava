package pacote;

import java.util.ArrayList;
import java.util.List;

public class wildcard {

	public void executar() {

		// ? caracter coringa

		Cao[] caos = { new Cao(), new Cao() };
		Gato[] gatos = { new Gato(), new Gato() };

		List<Cao> listaCaos = new ArrayList<>();
		listaCaos.add(new Cao());
		List<Gato> listaGatos = new ArrayList<>();
		listaGatos.add(new Gato());

		//type erasure
		// não permite, precisa passar exatamete o tipo
		// consultarArray(listaGatos);

//		consultarAnimais(caos);
//		consultarAnimais(gatos);
		
	}

	private void consultarAnimais(Animal[] animals) {
		for (Animal animal : animals) {
			animal.consulta();
		}
	}

	//
	private void consultarArray(List<Animal> animals) {
		for (Animal animal : animals) {
			animal.consulta();
		}
		//neste caso permite, pq q gato eh um animal
		animals.add(new Gato());

	}

	
	//contrato q não vai adicionar nada na lista
	// ? -> type erasure
	private void consultarArray2(List<? extends Animal>  animals) {
		for (Animal animal : animals) {
			animal.consulta();
		}
		//não permite adicionar
//		animals.add(new Gato());

	}
	
	//nunca usa implements, sempre super
	private void consultarCachorro(List<? super Cao>  caos) {
		
		//permite adicionar, é do mesmo tipo
		caos.add(new Cao());
	}
	
}
