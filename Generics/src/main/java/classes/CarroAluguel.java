package classes;

import java.util.ArrayList;
import java.util.List;

public class CarroAluguel {
	private List<Carro> carroDisponivel = new ArrayList<Carro>();

	{
		carroDisponivel.add(new Carro("Fusca"));
		carroDisponivel.add(new Carro("Brasa"));
	}
	
	public Carro getCarroDisponivel() {
		return carroDisponivel.remove(0);
	}
	
	public void devolverCarro(Carro carro) {
		carroDisponivel.add(carro);
	}
}
