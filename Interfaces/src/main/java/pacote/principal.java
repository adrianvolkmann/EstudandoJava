package pacote;

public class principal {

	public static void main(String[] args) {

		UsandoInterface usandoInterface = new UsandoInterface();
		UsandoInterfaceExtend usandoInterfaceExtend = new UsandoInterfaceExtend();

		usandoInterface.imprimeInterface();
		usandoInterfaceExtend.imprimeInterface();

		// constantes da interface sao final por padrao
//		MinhaInterface.constante = 2;
		System.out.println();

	}

}
