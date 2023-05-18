package D_Caneta;

public class BCaneta {

	public static void main(String[] args) {

		ACaneta c1 = new ACaneta();
		
		c1.modelo = "BIC CRISTAL";
		c1.cor = "Azul";
//		c1.ponta = 0.5f;  --> Vai dar erro, porque ela é um Atributo privado
		c1.carga = 80; // Deu certo mesmo estando Protegido
//		c1.tampada = true; --> Vai dar erro, porque ela é um Atributo privado
		
		// Só da pra mexer no Atributo que é Privado ou Protegido
		c1.tampar(); // Só vai conseguir mexer o tampada dentro do Método(tampar e destampar), mas fora dele não (tampada)
		c1.status();
		c1.rabiscar();
		
		
	}

}
