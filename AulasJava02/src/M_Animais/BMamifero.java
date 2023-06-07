package M_Animais;

public class BMamifero extends AAnimal {
	
	// Atributos
	private String corPelo;

	// Construtor
	public BMamifero(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}

	// Métodos
	@Override
	public void locomover() {
		System.out.println("Correndo!");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero!");
	}
	
	// Métodos Especiais 
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	
}
