package Aulas;

import java.util.Scanner;

public class I_EstruturasControle {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Olá, " + nome + ", vamos descobrir o seu IMC.");
		
		System.out.print("Qual o seu peso em Kg, " + nome + "? ");
		double peso = entrada.nextDouble();
		
		System.out.print("Qual a sua altura em metros, " + nome + "? ");
		double altura = entrada.nextDouble();
		
		
		double imc = peso / (altura * altura);
		System.out.println("O IMC de " + nome + " é de " + imc + ".");
		
		if (imc < 18.5) {
			  System.out.println("Você está abaixo do peso ideal.");
		}	else if (imc < 25) {
			  System.out.println("Você está no peso ideal.");
		}   else if (imc < 30) {
			  System.out.println("Você está acima do peso.");
		}	else if (imc < 40) {
			  System.out.println("Você está com obesidade grau 1 ou 2."); 
		}	else {
			  System.out.println("Você está com obesidade grau 3.");
			  System.out.println("Muito cuidado com o seu peso.");
		}
		
		

	}

}
