package J_Leitura;

public class CLivro implements BPublicação {
	
	// Atributos
	private String titulo;
	private String autor;
	private int totalPags;
	private int PagAtual;
	private boolean aberto;
	private APessoa leitor;


	// Métodos
	public void detalhes() {
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Paginas: " + this.getTotalPags());
		System.out.println("Pagina atual: " + this.getPagAtual());
		System.out.println("Esta aberto? " + this.aberto);
		System.out.println("O leitor eh o " + getLeitor().getNome());
	}

	
	@Override
	public void abrir() {
		this.setAberto(true);
	}


	@Override
	public void fechar() {
		this.setAberto(false);
	}


	@Override
	public void folhear(int p) {
		if (p > this.totalPags) {
			this.PagAtual = 0;
		} else {
			this.PagAtual = p;
		}
	}


	@Override
	public void avançarPag() {
		this.setPagAtual(getPagAtual() + 1);
	}


	@Override
	public void voltarPag() {
		this.setPagAtual(getPagAtual() - 1);
	}

	
	


		public CLivro(String titulo, String autor, int totalPags, int pagAtual, boolean aberto, APessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPags = totalPags;
		PagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}


		// Métodos Especiais
		public String getTitulo() {
			return titulo;
		}



		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}



		public String getAutor() {
			return autor;
		}



		public void setAutor(String autor) {
			this.autor = autor;
		}



		public int getTotalPags() {
			return totalPags;
		}



		public void setTotalPags(int totalPags) {
			this.totalPags = totalPags;
		}



		public int getPagAtual() {
			return PagAtual;
		}



		public void setPagAtual(int pagAtual) {
			PagAtual = pagAtual;
		}



		public boolean isAberto() {
			return aberto;
		}



		public void setAberto(boolean aberto) {
			this.aberto = aberto;
		}



		public APessoa getLeitor() {
			return leitor;
		}



		public void setLeitor(APessoa leitor) {
			this.leitor = leitor;
		}
	
	
	
}
