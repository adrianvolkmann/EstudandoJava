package pacote;

import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {

		wildcard wildcard = new wildcard();
		wildcard.executar();
		
//		extracted();
		
	}


	private static void extracted() {
		
//		List<String> lista = List.of("A", "B", "C");
		
		//versao java 1.4
		List lista = new ArrayList<>();
		lista.add(5);
		lista.add("Numero 5");
		
		for (Object object : lista) {
			if(object instanceof Integer) {
//				System.out.println("inteiro");
				int c = (int) object;
			}
		}
		
		//java 5
		//List<String> lista = new ArrayList<String>();
		
		//java 7
		//List<String> lista = new ArrayList<>();
		
		
		//type erasure
		List<String> listaString = new ArrayList<>();
//		listaString.add(5);
		listaString.add("Numero 5");
		
		//generics so em tempo de compilacao
		
		//permite adicionar long em lista string
		add(listaString,1L);
		
		
		for (String object : listaString) {
			System.out.println(object);
		}
	}
	
	
	public static void add (List lista, Long l) {
		lista.add(l);
	}
	

}
