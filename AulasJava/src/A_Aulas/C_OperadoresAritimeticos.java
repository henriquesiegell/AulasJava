package A_Aulas;

public class C_OperadoresAritimeticos {

	public static void main(String[] args) {
		int notaAluno1 = 88; // "int" só comporta números inteiros.
		int notaAluno2 = 70;
		int notaAluno3 = 61;
		
		int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
		int mediaAlunos = (notaAluno1 + notaAluno2 + notaAluno3) / 3;
		
		System.out.println("A nota total dos alunos é: " + totalGeral);
		System.out.println("A média dos três alunos é: " + mediaAlunos);
		
		/* 
		 *	Adição = "+"
		 *	Subtração = "-"
		 *	Multiplicação = "*"
		 *	Divisão = "/"
		 *	Módulo = "%"
		 */
		
		int total = 10;
		total += 3;
		System.out.println(total); // imprime 13
		
		total -= 2;
		System.out.println(total); // imprime 11
		
		total *= 3;
		System.out.println(total); // imprime 33
		
		total /= 3;
		System.out.println(total); // imprime 11
		
		total %= 5;
		System.out.println(total); // imprime 1
				
		
		
	}

}
