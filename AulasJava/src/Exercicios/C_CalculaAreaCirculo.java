package Exercicios;

public class C_CalculaAreaCirculo {

	public static void main(String[] args) {
		
		float pi = 3.14F;
		float raio = 6F;	// A pessoa seleciona qual é o raio do circulo.
		
		String formulaCirculo = "\"pi * (raio * raio)\"";
		float areaCirculo = pi * (raio * raio);
		
		
		System.out.println("A fórmula utilizada para descobrir a área do circulo é " + formulaCirculo + "." );
		System.out.println("A área do circulo mostrando as casas decimais é " + areaCirculo + ".");
		System.out.println("A área do circulo mostrando sem as casas decimais é " + (int)areaCirculo + ".");
		
		
	}

}
