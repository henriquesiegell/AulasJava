package Aulas;

import java.util.Scanner;

public class J_EscopoVariaveis {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;
		String nomePai = "";
		
		if (!podeDirigir) {
			System.out.println("Nome do pai: ");
			
			nomePai = entrada.next(); // Não pode esquecer de criar uma variável fora das estruturas de controle, senão pode dar erro.
		}
		
		System.out.println("Você pode dirigir?");
		
		if(podeDirigir) {
			System.out.println("Sim, claro!");
		}	else {
				System.out.println("Não, se fizer isso, seu pai" + nomePai + " vai preso.");
			}
		
		

	}

}
