package Exercicios;

import java.util.Scanner;

public class F_AnoVotoObrigatorio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano do seu nascimento: ");
		int anoNasc = entrada.nextInt();
		
		int idade = 2023 - anoNasc;
		
		System.out.println("Você tem " + idade + " anos.");
		if (idade < 16) {
			System.out.println("Você ainda não pode votar!");
		} else {
			if ((idade >= 16) && (idade < 18 ) || (idade > 70) ) {
				System.out.println("Seu voto não é obrigatório!");
			} else {
				System.out.println("Seu voto é obrigatório!");
			}
		}
						
							
				
		}
			

	}


