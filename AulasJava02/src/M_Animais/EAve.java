package M_Animais;

public class EAve extends AAnimal {
	
	// Atributos
	private String corPena;
	
	// Construtor
	public EAve(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}

	// Métodos
	@Override
	public void locomover() {
		System.out.println("Voando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave!");
	}

	public void fazerNinho() {
		System.out.println("Construiu um ninho!");
	}

	// Métodos Especiais
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
	
}
