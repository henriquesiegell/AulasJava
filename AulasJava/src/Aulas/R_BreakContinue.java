package Aulas;

import java.util.Scanner;

public class R_BreakContinue {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite um número --> ");
		int divisor = entrada.nextInt();
		
		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue; // Volta o laço repetindo as condições do "for". 
			}
			
			System.out.println(i);
		}
	
		System.out.println("Fim do programa!");
		
	/*	for (int i = 100; i <= 200; i++) {
			if (i % divisor == 0) {
				break; // Interrompe o laço.
			}
			
			System.out.println(i);
		} 
		
		System.out.println("Fim do programa!");	*/

	}

}
