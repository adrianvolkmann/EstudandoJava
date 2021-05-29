package classes;

import java.util.ArrayList;
import java.util.List;

public class TesteClasseGenerica {

	public static void main(String[] args) {
		
		CarroAluguel carroAluguel = new CarroAluguel();
		Carro carro = carroAluguel.getCarroDisponivel();
		
		
		carroAluguel.devolverCarro(carro);
		
		
		
	}
	
	
}
