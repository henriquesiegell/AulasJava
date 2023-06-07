package O_ProjetoYoutube;

public class BVideo implements AAcoesVideo {

	// Atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	
	// Construtor
	public BVideo(String titulo){
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "BVideo [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}


	// Métodos Especiais
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (this.avaliacao + avaliacao) / this.views;
		this.avaliacao = avaliacao;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int viws) {
		this.views = viws;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	@Override
	public void play() {
		this.reproduzindo = true;
	}
	@Override
	public void pause() {
		this.reproduzindo = false;
	}
	@Override
	public void like() {
		this.curtidas ++;
	}


	
}
