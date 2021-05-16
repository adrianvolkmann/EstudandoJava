package pacote;

public interface MinhaInterface {

	public int constante = 1 ;
	
	void imprimeNome();
	
	//existe somente no java8 >
	default void imprimeInterface(){
		System.out.println("metodo default da interface");
	}
}
