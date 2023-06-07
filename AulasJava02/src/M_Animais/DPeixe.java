package M_Animais;

public class DPeixe extends AAnimal {

	// Atributos
	private String corEscama;
	
	
	// Construtor
	public DPeixe(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}

	// Métodos
	@Override
	public void locomover() {
		System.out.println("Nadando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substancias!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe nao faz barulho!");
	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha!");
	}

	// Métodos Especiais
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
