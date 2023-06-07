package K_ProjetoPessoas;

public class APessoa {
	
	// Atributos
	private String nome;
	private int idade;
	private char sexo;
	
	// Métodos
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}
	
	// toString
	@Override
	public String toString() {
		return "APessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}



	// Métodos Especiais
	public APessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

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
	
	
	
	
	
}
