package A_01FundamentosDaLinguagem;

import java.util.Scanner;

public class M_OperadorTernario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade --> ");
		int idade = entrada.nextInt();
		
		//                 expressão booleana			 valor caso verdadeiro				    valor caso falso
		// String indicaçao = (idade >= 18)           ? 	"Você é adulto!"               :      "Você é criança/adolescente";
	
		///	int x = (idade >= 18) ? 1 : 2;    // Funciona não só para casos booleanos, mas também para outros casos, como o "int", por exemplo
		
		
		if ((idade >= 18) && (idade < 65)) {
			System.out.println("Você é adulto!");
		} else if (idade < 18) {
			System.out.println("Você é criança/adolescente!");
		} else {
			System.out.println("Você é um idoso!");
		}
		
		//System.out.println("Resultado: " + indicaçao);
		

	}

}
