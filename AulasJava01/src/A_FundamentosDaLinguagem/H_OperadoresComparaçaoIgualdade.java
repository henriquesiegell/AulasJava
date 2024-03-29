package A_FundamentosDaLinguagem;

public class H_OperadoresComparaçaoIgualdade {

	public static void main(String[] args) {
		
		// Comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
		// Igualdade: == (igual), != (diferente)
		
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;
		
		System.out.println(maior); //false
		System.out.println(maiorOuIgual); //false
		System.out.println(menor); //false 
		System.out.println(menorOuIgual); //true  
		System.out.println(igual); // false
		System.out.println(diferente); //true
		
		
		boolean bloqueado = true;
		
		bloqueado = !bloqueado; // Com esse operador "!" a variável inverte de valor
		
		System.out.println(bloqueado);
		
				
		

	}

}