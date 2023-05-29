package J_Leitura;

public class APessoa {
	
	// Atributos
	private String nome;
	private int idade;
	private char sexo;
	
	// Método
	public void fazerAniver() {
		this.setIdade(getIdade() + 1);
		
	}
	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
	}
	
	public APessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	// Métodos Especiais
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
