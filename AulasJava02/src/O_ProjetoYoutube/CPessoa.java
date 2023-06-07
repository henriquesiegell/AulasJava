package O_ProjetoYoutube;

public abstract class CPessoa {

	// Atributos
	protected String nome;
	protected int idade;
	protected char sexo;
	protected float experiencia;
	
	
	// Construtor
	public CPessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}

	
	// Métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}


	// Método
	protected void ganharExp() {
		
	}
	
}
