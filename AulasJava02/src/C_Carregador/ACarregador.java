package C_Carregador;

public class ACarregador {
	
	
	String modelo;
	String cor;
	int voltagem;
	boolean original;
	boolean carregado;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Voltagem: " + this.voltagem);
		System.out.println("Original: " + this.original);
	}
	
	
	void carregar() {
		if (carregado == true) {
			System.out.println("Não precisa de carregador! Já está carregado.");
		} else {
			System.out.println("Precisa de carregador! Não está carregado.");
		}
	}
	
	
	void tirar() {
		this.carregado = true;
	}
	
	void colocar() {
		this.carregado = false;
	}
	

}
