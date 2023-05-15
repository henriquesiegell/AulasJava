package A_FundamentosDaLinguagem;

import java.util.Scanner;

public class G_ReceberEntradaDados {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	///	System.out.println("Digite seu nome");
	///	String nome = entrada.nextLine();
		
	///	System.out.println("Olá, " + nome);
		
		
		
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Olá, " + nome + ", vamos descobrir o seu IMC.");
		
		System.out.print("Qual o seu peso em Kg, " + nome + "?");
		double peso = entrada.nextDouble();
		
		System.out.print("Qual a sua altura em metros, " + nome + "?");
		double altura = entrada.nextDouble();
		
		
		double imc = peso / (altura * altura);
		System.out.println("O IMC de " + nome + " é de " + imc + ".");
		
				
		

	}

}
