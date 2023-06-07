package M_Animais;

public class FCanguru extends BMamifero {

	public FCanguru(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando!");
	}
	
	public void usarBolsa() {
		System.out.println("Usando bolsa!");
	}
	
	
}
