package A_01FundamentosDaLinguagem;

public class D_TiposPrimitivos {

	public static void main(String[] args) {
		
		boolean numeroMaior = 4 > 3; // Serve para ver se a operação é verdadeira ou falsa
		boolean alunoMatriculado = true; // Também Podemos atribuir um valor à ele.
		boolean clienteBloqueado = false;
		
		char turmaAluno1 = 'A'; // Armazena caracteres
		char tipoCliente = '2';
		char simbolo = '@';
		
		System.out.println(numeroMaior);

		
	/*
	 * byte --> Poderá usar até o número 127;
	 * short --> Poderá usar até o número 30MIL;
	 * int --> Poderá usar até o número 2BILHÔES;
	 * long --> Poderá usar até o número 9BILHÔES.
	 */
		
	/* 
	 * O float e double são usados para armazenar números reais e a unica diferença delas é a precisão. 
	 * O float tem uma precisão de 6 casas decimais
	 * o double tem uma precisão de 10 casas decimais. 
	 */
		float saldoConta = 1030.43F ; // No caso do Float, precisa colocar o "F" no final para especificar que você está usando o "float" e não o "double"
		System.out.println(saldoConta);
		
		double precoProduto = 19.43;
		System.out.println(precoProduto);
		
		long populaçaoUberlandia = 650000;
		System.out.println(populaçaoUberlandia);
		
		// long populaçaoMundial = 7000000000; // Esse código não vai funcionar, pois o primitivo "long" é lido pelo código como se fosse o "int".
		long populaçaoMundial = 7000000000L; // Precisa colocar o "L" no final para especificar para o código saber que está usando o "long".
		System.out.println(populaçaoMundial);
		 
		
		

	}

}