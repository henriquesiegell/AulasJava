package D_Caneta;

public class ACaneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo); // THIS é o nome do Objeto que chamou, no caso é o c1 e c2
		System.out.println("Uma caneta " + this.cor); // Sempre que quiser modificar um atributo dentro da própria Classe, é pra colocar THIS
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
		
	}
	
	
	// Nesses dois Métodos Públicos abaixo o código vai funcionar mesmo o Atributo "tampada" estar Privado 
	// Só vai conseguir mexer o tampada dentro do Método(tampar e destampar), mas fora dele não (tampada)
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar.");
		} else {
			System.out.println("Estou rabiscando.");
		}
		
	}
	
	public void tampar() {
		this.tampada = true; 
		
	}
	
	private void destampar() {
		this.tampada = false;
	}

}

	
	
	

