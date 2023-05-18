package F_Caneta;

public class BCaneta {

	public static void main(String[] args) {
		ACaneta c1 = new ACaneta("NIC", "Amarelo", 0.5f);
		c1.status();
		System.out.println();
		
		ACaneta c2 = new ACaneta("KKK", "Laranja", 2.0f);
		c2.status();
		System.out.println();
		
		ACaneta c3 = new ACaneta("BIC CRISTAL", "Preta", 0.7f);
		c3.status();
		
	}

}
