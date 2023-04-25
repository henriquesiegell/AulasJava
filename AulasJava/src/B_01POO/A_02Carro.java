package B_01POO;

public class A_02Carro {

	public static void main(String[] args) {
	/*
	 * 	A_01CriandoObjeto meuCarro; // Declaramos a variável.
	 * 	meuCarro = new A_01CriandoObjeto(); // Instaciamos a variável com um Objeto do tipo A_01CriandoObjeto.
	 */
	
		
		A_01CriandoObjeto meuCarro = new A_01CriandoObjeto(); // Posso fazer tudo em um linha também, ao contrário do exemplo da linha acima.
		meuCarro.modelo = "Palio"; // Definimos os valores para o atributo da variável Carro
		meuCarro.anoDeFabricaçao = 2012;
		
		
		System.out.println("Meu carro");
		System.out.println("----------------------");
		System.out.println("Modelo: " + meuCarro.modelo); // Lendo os atributos dos Objetos
		System.out.println("Ano: " + meuCarro.anoDeFabricaçao);
		
		
		A_01CriandoObjeto seuCarro = new A_01CriandoObjeto(); // Criando outro Objeto
		// OBS: Posso criar quantos Objetos eu quiser com a Classe Carro
		seuCarro.modelo = "Fiat"; // Definimos os valores para o atribut da variável Carro
		seuCarro.anoDeFabricaçao = 2021;
		
		System.out.println();
		System.out.println("Seu carro");
		System.out.println("----------------------");
		System.out.println("Modelo: " + seuCarro.modelo); // Lendo os atributos dos Objetos
		System.out.println("Ano: " + seuCarro.anoDeFabricaçao);
		
		
		
		

	}

}
