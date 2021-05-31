package classes;

import java.util.List;

//contendo o T indica ser classe generica
public class ClasseGenerica <T> {
	
	private List<T> ObjetoDisponivel;
	
	public ClasseGenerica(List<T> objetoDisponivel) {
		super();
		ObjetoDisponivel = objetoDisponivel;
	}

	public T getObjetoDisponivel() {
		T objecto = ObjetoDisponivel.remove(0);
		System.out.println("Alugando objeto " + objecto.toString());
		return objecto;
	}
	
	public void devolverObjeto(T objeto) {
		System.out.println("Devolvendo objeto " + objeto.toString());
		ObjetoDisponivel.add(objeto);
	}
	
}
