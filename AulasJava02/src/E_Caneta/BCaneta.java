package E_Caneta;

public class BCaneta {

	public static void main(String[] args) {
		
		ACaneta c1 = new ACaneta();
		
// 		c1.modelo = "BIC"; --> Nesse caso daria certo, porque o Atributo está Publico
		c1.setModelo("BIC");
//		c1.ponta = 0.5f; --> Vai dar erro, porque o Atributo está Privado
		c1.setPonta(0.5f); // Nesse caso da certo, porque eu não mexo diretamente no Atributo
		
		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

	}

}
