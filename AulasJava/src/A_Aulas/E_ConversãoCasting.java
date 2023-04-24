package A_Aulas;

public class E_ConversãoCasting {

public static void main(String[] args) {
		
		// Casting é a conversão de dados primitivos. Ex: "float" --> "double"// "int" --> "float" // "int" --> "long"; 
		// Utilizando o casting, ele poderá modificar ou perder seu valor.
		
		long a = 901245628;				 
		//	Conversão não funcionou porque "long"(64 bytes) é maior que "int"(32 bytes).
		// *int b = a;* // Para resolver isso, basta fazer o casting:
		 		   // int b = (int) a;
		// *System.out.println(b);*
		
		
		int y = 102344;
		// Conversão deu certo, porque "int"(32 bytes) é menor que "long"(64 bytes).
		long x = y;
		System.out.println(y);
		
		
		double g = 20.5;
		// Conversão não funcionou porque "double"(64 bytes) é maior que "float"(32 bytes).
		// float h = g; // Para resolver isso, basta fazer o casting:
		   			 // float h = (float) g;
		// System.out.println(h);
		
		
		float c = 934.5F;
		// Conversão deu certo, porque "float"(32 bytes) é menor que "double"(64 bytes).
		double d = c;
		System.out.println(d);
		
		
		double largura = 100;
		// Conversão não funcionou porque "int"(32 bytes) é menor que "double"(64 bytes).
		// int tamanho = largura; // Para resolver isso, basta fazer o casting:
			 		           // int tamanho = (int) largura;
		// System.out.println(tamanho);
		
		
		
		
		
		
		
		

	}

}