package Aulas;

import java.util.Scanner;

public class K_OperadoresLogicos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Vamos descobrir seu IMC! Para isso, digite seu nome --> ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua altura --> ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite seu peso --> ");
		double peso = entrada.nextDouble();
		
		System.out.println("Se você for do sexo Masculino, digite 1;");
		System.out.println("Se você for do sexo Feminino, digite 2;");
		System.out.print("Digite aqui --> ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		//       A		&&		B         --> && (and) ; os dois resultados tem que estar certos para executar o ''' "System.out.println("Abaixo do peso.") ''', por exemplo.
	///	if (sexo == 'F' && imc < 19.1) {
	///		System.out.println("Abaixo do peso.");
	///	} else if (sexo == 'F' && imc <= 25.8) {
	///		System.out.println("Peso ideal.");
	///	} else if (sexo == 'F' && imc <= 27.3) {
	///		System.out.println("Um pouco acima do peso.");
	///	} else if (sexo == 'M' && imc < 20.7) {
	///		System.out.println("Abaixo do peso");
	///	} else if (sexo == 'M' && imc <= 26.4); {	
	///	}
		
		
		
		//_______________A_____________     ||	_____________B_____________ --> || (or) ; Um dos dois resultados tem que estar verdadeiro para executar o ''' "System.out.println("Abaixo do peso."); ''', por exemplo.
		if ((sexo == 'F' && imc < 19.1) 	||	(sexo == 'M' && imc < 20.7)) {
			System.out.println("Abaixo do peso.");
		} else if ((sexo == 'F' && imc <= 25.8)	||	(sexo == 'M' && imc <= 26.4)) {
			System.out.println("Peso ideal.");
		} else if ((sexo == 'F' && imc <= 27.3)	||	(sexo == 'M' && imc <= 27.8)) {
			System.out.println("Um pouco acima do peso.");
		}
		
		
			
			
	//	if (sexo == 'F') {
		//	if (imc < 19.1) {
			//	System.out.println("Abaixo do peso.");
		//	} else if (imc <= 25.8) {
		//		System.out.println("Peso ideal.");
		//	}
			
	//	} else {
	//		if (imc < 20.7) {
		//		System.out.println("Abaixo do peso.");
		//	} else {
		//		System.out.println("Peso ideal.");
		//	}
	//	}
		
		

	}

}