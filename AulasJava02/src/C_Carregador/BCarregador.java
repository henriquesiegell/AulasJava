package C_Carregador;

public class BCarregador {

	public static void main(String[] args) {
		
		ACarregador c1 = new ACarregador(); // Instanciei o meu Objeto ACarregador
		
		c1.modelo = "Apple";
		c1.cor = "Branco";
		c1.voltagem = 20;
		c1.original = true;
				
		c1.status();
		System.out.println();
		
		c1.carregado = true;
		c1.carregar();
		System.out.println();
		
		
		
		ACarregador c2 = new ACarregador();
		
		c2.modelo = "Samsung";
		c2.cor = "Preto";
		c2.voltagem = 15;
		c2.original = true;
		
		c2.status();
		System.out.println();
		
		c1.carregado = false;
		c1.carregar();
		
		
		}

}
