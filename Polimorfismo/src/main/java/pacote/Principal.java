package pacote;

public class Principal {

	public static void main(String[] args) {

		animalComendo(new Animal());
		animalComendo(new  Cao());
		animalComendo(new Gato());
		
		//overload
		new Cao().comer("alface");
		//Override
		new Cao().comer();

	}

	static void animalComendo(Animal animal) {
		animal.comer();
	}

}
