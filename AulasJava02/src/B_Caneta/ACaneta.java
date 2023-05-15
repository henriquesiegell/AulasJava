package B_Caneta;

public class ACaneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo); // THIS é o nome do Objeto que chamou, no caso é o c1 e c2
		System.out.println("Uma caneta " + this.cor); // Sempre que quiser modificar um atributo dentro da própria Classe, é pra colocar THIS
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
		
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar.");
		} else {
			System.out.println("Estou rabiscando.");
		}
		
	}
	
	void tampar() {
		this.tampada = true; 
		
	}
	
	void destampar() {
		this.tampada = false;
	}

}
