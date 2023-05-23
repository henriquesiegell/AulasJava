package G_ContaBanco;

import java.util.Scanner;

public class BContaBanco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		AContaBanco p1 = new AContaBanco(0, false);
		p1.setDono("Lilia");
		p1.setNumConta(154172);
		p1.abrirConta();
		
		AContaBanco p2 = new AContaBanco(0, false);
		p2.setDono("Gabriela");
		p2.setNumConta(895641);
		p2.abrirConta();	
		
		
		p1.depositar();
		p2.depositar();
		
		p2.sacar();
		p2.fecharConta();
				
		p1.estadoAtual();
		p2.estadoAtual();
		
		

		
		
		

	}

}
