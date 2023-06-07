package O_ProjetoYoutube;

public class DUsuario extends CPessoa {

	// Construtor
	public DUsuario(String nome, int idade, char sexo, int login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	// Atributos
	private int login;
	private int totAssistido;
	
	
	// Métodos especiais
	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}


	// Métodos
	public void viuMaisUm() {
		
		
	}

	@Override
	public String toString() {
		return "DUsuario [nome=" + nome + ", idade=" + idade
				+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}

	
	
	
	
	
	
}
