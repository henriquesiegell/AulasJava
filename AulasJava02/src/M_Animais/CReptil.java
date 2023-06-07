package M_Animais;

public class CReptil extends AAnimal {

	// Atributos
	private String corEscama;
	
	// Construtor
	public CReptil(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}

	// Métodos
	@Override
	public void locomover() {
		System.out.println("Rastejando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil!");
	}

	// Métodos Especiais 
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
