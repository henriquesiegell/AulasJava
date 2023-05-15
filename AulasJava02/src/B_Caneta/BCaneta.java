package B_Caneta;

public class BCaneta {

	public static void main(String[] args) {
		
		ACaneta c1 = new ACaneta(); // Fiz o Instanciamento 
			// Criei o Objeto c1
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		
		ACaneta c2 = new ACaneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		

	}

}
