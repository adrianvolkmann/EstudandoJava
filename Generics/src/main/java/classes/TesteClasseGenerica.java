package classes;

import java.util.ArrayList;
import java.util.List;

public class TesteClasseGenerica {

	public static void main(String[] args) {

//		CarroAluguel carroAluguel = new CarroAluguel();
//		Carro carro = carroAluguel.getCarroDisponivel();
//		carroAluguel.devolverCarro(carro);

		List<Carro> carros = new ArrayList<Carro>();
		carros.add(new Carro("Fusca"));
		carros.add(new Carro("FIAT não é carro"));

		ClasseGenerica<Carro> classeGenerica = new ClasseGenerica<>(carros);

		Carro carro = classeGenerica.getObjetoDisponivel();
		classeGenerica.devolverObjeto(carro);

		List<Computador> computadors = new ArrayList<Computador>();
		computadors.add(new Computador("INTEL"));

		ClasseGenerica<Computador> classeGenericaComputador = new ClasseGenerica<>(computadors);
		Computador computador = classeGenericaComputador.getObjetoDisponivel();
		classeGenericaComputador.devolverObjeto(computador);

		System.out.println("--");
		metodoGenerico(carros);

	}

	private static <T> void metodoGenerico(T t) {
		List<T> lista = new ArrayList<>();
		lista.add(t);
		System.out.println(lista);

	}

	private static <T, X> void metodoGenerico2() {
		// pode possuir 2 atributos

	}
}
