package Aulas;

public class F_String {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = x + y;
		
			
		System.out.println("Resultado: " + z); // O código lê a string e depois a variavel "z".
		System.out.println("Resultado: " + x + y); // Com as variáveis "x" e "y" depois da string o código vai ler as strings primeiro e depois juntar as variáveis, ao invés de somar.
		System.out.println(x + y + " foi o resultado."); // Como as variáveis estão em primeiro o código vai ler as variáveis, somando elas, e depois vai ler a string normalmente.
		System.out.println("Resultado: " + (x + y)); // Colocando um parênteses nas variáveis depois da string, o código vai ler as variáveis primeiro e depois ler a string, fazendo assim a soma delas(variáveis) normalmente
	
		
		String nome = "Maria";
		int idade = 30;
		
		System.out.println(nome + " tem " + idade + " anos." );

	}

}
