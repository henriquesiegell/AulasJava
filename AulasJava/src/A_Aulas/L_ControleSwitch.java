package A_Aulas;

import java.util.Scanner;

public class L_ControleSwitch {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o final da placa para descobrir o vencimento do seu IPVA --> ");
		int finalPlaca = entrada.nextInt();
		
		switch (finalPlaca) {
		case 1:	
			System.out.println("Vencimento dia 11 de Janeiro");
			break; // O "break" é usado para o "switch" parar de escrever os cases seguintes. 
		case 2:	   // Sem o "breake" a switch vai ler todos os cases, escrevendo-os.
			System.out.println("Vencimento dia 12 de Janeiro");
			break;
		default: // se não for o "case 1" e nem o "case 2", ele vai pro default.
			System.out.println("Vencimento sem data, desculpe o transtorno!");
			
		}
		
		

	}

}
