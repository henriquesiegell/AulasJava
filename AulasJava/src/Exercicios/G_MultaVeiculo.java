package Exercicios;

import java.util.Scanner;

public class G_MultaVeiculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a velocidade máxima permitida da via --> ");
		int velMaxima = entrada.nextInt();
		
		System.out.print("Digite a velocidade do veículo --> ");
		double velVeiculo = entrada.nextDouble();
		
		System.out.println("Se o veículo for um carro de passeio, digite 1;");
		System.out.println("Se o veículo for um caminhão, digite 2;");
		System.out.print("Digite aqui, conforme descrito acima --> ");
		char veiculo = entrada.nextShort() == 1 ? 'P' : 'C' ;
		
		double veiculoPasseio = velMaxima + (10/100);
		double veiculoCaminhao = velMaxima + (5/100);
		
		if ((veiculo == 'P')	&&	(veiculoPasseio >= velVeiculo)) {
			System.out.println("Seu carro não foi multado. Parabéns por andar corretamente na via!");
		} else if ((veiculo == 'P')	&&	(veiculoPasseio < velVeiculo)) {
			System.out.println("A via tem velocidade permitida de " + velMaxima + "KM/H. Por você estar a " + velVeiculo + "KM/H você foi multado. Preste mais atenção!");
		} else if ((veiculo == 'C')	&& (veiculoCaminhao >= velVeiculo)) {
			System.out.println("Seu carro não foi multado. Parabéns por andar corretamente na via!");
		} else if ((veiculo == 'C') && (veiculoCaminhao < velVeiculo)) {
			System.out.println("A via tem velocidade permitida de " + velMaxima + "KM/H. Por você estar a " + velVeiculo + "KM/H você foi multado. Preste mais atenção!");
		}
		
		
		
	}

}
