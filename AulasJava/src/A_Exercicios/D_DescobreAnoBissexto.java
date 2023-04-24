package A_Exercicios;

import java.util.Scanner;

public class D_DescobreAnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos descobrir se o ano é bissexto!");
				
		System.out.print("Digite um ano para descobrir se ele é ou se foi um ano bissexto --> ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) {
				System.out.println("O ano \"" + ano + "\" é um ano bissexto.");
		} else if (ano % 4 == 0) {
				if (ano % 100 != 0) {
					System.out.println("O ano \"" + ano + "\" é um ano bissexto.");
			} else {
					System.out.println("O ano \"" + ano + "\" não é um ano bissexto.");	
				  } 	
		}	else {
				System.out.println("O ano \"" + ano + "\" não é um ano bissexto.");
		}
			
		
		

	}

}
