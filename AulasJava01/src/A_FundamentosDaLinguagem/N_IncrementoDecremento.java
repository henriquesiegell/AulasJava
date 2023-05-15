package A_FundamentosDaLinguagem;

import java.util.Scanner;

public class N_IncrementoDecremento {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = 10;
		
		
		int novaIdade = idade++; // Resultado é igual a 10, pois pega o valor da variável "idade", entrega pra variável "novaIdade" e depois ele soma.
								 // Para dar certo o "++" deve ficar do lado esquerdo.
		// incremento
		
		/// idade = idade + 1;
		/// idade += 1;
		/// idade++;   ==   idade = idade + 1;
		/// System.out.println(idade);
		
		
		// decremento
		
		/// idade = idade -1;
		/// idade -= 1;
		/// idade--;
		/// System.out.println(idade);
		

	}

}
