package B_Exercicios;

import java.util.Scanner;

public class H_ClassificaProdutos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int codigoProduto = 0;
		do {
			System.out.println("Digite o código do produto: ");
			codigoProduto = entrada.nextInt();
			if (codigoProduto != 0) {
				String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";
				
				for (int i = 8; i >= 1; i--) {
					if (codigoProduto % i == 0) {
						System.out.println("O produto de código " + codigoProduto + " ficará no corredor da " + corredor + " e na gaveta " + i + ".");
					}
				}
			}
			
			
		} while (codigoProduto != 0);
			
		
	}
}
