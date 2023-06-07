package M_Animais;

public abstract class AAnimal {

	// Atributos
	protected float peso;
	protected int idade;
	protected int membros;
	
	// Métodos Abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	// toString
	@Override
	public String toString() {
		return "AAnimal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}
	
	// Métodos Especiais
	public AAnimal(float peso, int idade, int membros) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	
	
	
}
