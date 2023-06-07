package O_ProjetoYoutube;

public class EVizualização {
	// Atributos
	private DUsuario espectador;
	private BVideo filme;
	
	// Métodos 
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot = 0;
		if (tot <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <=90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
		
	}
	
	
	// Métodos especiais
	public DUsuario getEspectador() {
		return espectador;
	}

	public void setEspectador(DUsuario espectador) {
		this.espectador = espectador;
	}

	public BVideo getFilme() {
		return filme;
	}

	public void setFilme(BVideo filme) {
		this.filme = filme;
	}


	// Construtor
	public EVizualização(DUsuario espectador, BVideo filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	
	// toString
	@Override
	public String toString() {
		return "EVizualização [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
	
	
	
	
}
