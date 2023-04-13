package Aulas;

import java.util.Scanner;

public class Q_ControleFor {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Ultimo número: ");
		int numeroFinal = entrada.nextInt();
		
		// for (iniciação;      condição;         incremento)
		for (int  i = 1;     i <= numeroFinal;        i++) {
			System.out.println(i);
		}
		
			

	}

}
