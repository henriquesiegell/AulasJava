package N_Animais;

public class DCachorro extends BMamifero {

	@Override
	public void emitirSom() {
		System.out.println("Au! Au!");
	}
	
	
	public void reagir(String frase) {
		if (frase == "Toma comida" || frase == "Ola") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	} 
	
	
	public void reagir(int hora, int min) {
		if (hora < 12 ) {
			System.out.println("Abanar");
		} else if (hora >= 18){
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
		
	}

	
	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
	
	
}
