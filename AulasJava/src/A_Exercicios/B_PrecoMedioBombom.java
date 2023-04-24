package A_Exercicios;

public class B_PrecoMedioBombom {

	public static void main(String[] args) {
		// preço dos bombons
		int bombomChocolate = 5; 
		int bombomBranco = 8; 
		int bombomMorango = 12; 
		
		int mediaBombom = ( bombomChocolate + bombomBranco + bombomMorango ) / 3;
		
		System.out.println("Bombom de chocolate com morango está R$" + bombomMorango + " reais"); 
		System.out.println("Bombom de chocolate branco está R$" + bombomBranco); 
		System.out.println("Bombom de chocolate está R$" + bombomChocolate); 
		System.out.println("O preço médio dos bombons da loja do seu Zé está custando R$" + mediaBombom);
	}

}