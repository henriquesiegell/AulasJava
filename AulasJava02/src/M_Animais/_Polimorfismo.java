package M_Animais;

public @interface _Polimorfismo {

	/*
	 
	 Poli = muitas / Morfo = formas
	 
	 Polimorfismo --> Permite que um mesmo nome represente vários comportamentos diferentes.
	 
	 
	 Assinatura do Método --> Tem a Quantidade e os Tipos dos parâmetros.
	 
	 Ex:
	 		*calcMedia (n1: Real,
	 				   n2: Real)*: Real		
	 							              --> Tem a mesma Assinatura
	 		*calcMedia (n1: Real,
	 				   n2: Real)*: Inteiro
	 				   
	 		calcMedia (bim: Inteiro,
	 				   n1: Real,			 --> Não tem a mesma assinatura que o resto
	 				   n2: Real): Real		   
	 
	 		
	 --> Existem dois tipo de Polimorfismo:
	 
	 	- Sobreposição: Acontece quando substituimos um Método de uma Superclasse na sua Subclasse, usando a mesma Assinatura.
	 	
	 	Ex: 
	 			Mamífero
	 			 emitirSom()
	 			 "Som de mamífero"
	 				|
	 				|
	 				|
	 			   Lobo
	 			    emitirSom()
	 			    "Aauuuuuu"
	 			   	|
	 			   	|
	 			   	|
	 			 Cachorro
	 			  emitirSom()
	 			  "Au! Au!
	 			  
	 
	 ###O OUTRO TIPO DE POLIMORFISMO ESTÁ NO PACOTE N_Animais###
	 
	 
	 */
	
}
