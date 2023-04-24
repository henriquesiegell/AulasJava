package A_Exercicios;

import java.util.Scanner;

public class E_SenhaCorreta {
	/*
	Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida	
	pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 X.	Devem	 ser	impressas	 as	
	seguintes	mensagens:	
	ACESSO	PERMITIDO	caso	a	senha	seja	válida.	
	ACESSO	NEGADO caso	a	senha	seja	inválida.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua nova senha: ");
		int senha = entrada.nextInt();
		
		System.out.println("Digite sua nova senha novamente: ");
		int senhaConfirma = entrada.nextInt();
		
		if (senhaConfirma != senha) {
			System.out.println("ACESSO NEGADO!");
		} else {
			System.out.println("ACESSO LIBERADO!");
		}

	}

}
