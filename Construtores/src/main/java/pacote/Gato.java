package pacote;

public class Gato extends Animal {

	public Gato(){
		System.out.println("Chamou Gato");
	}

	public Gato(String nome) {
		//classe pai nao tem construtor vazio, esse contrutor precisa da chamada do metodo;
		super(nome);
		System.out.println("Chamou Gato " + nome);
	}
	
	
	
	
}
