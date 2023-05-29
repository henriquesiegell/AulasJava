package J_Leitura;

public class DVida {

	public static void main(String[] args) {

		APessoa p[] = new APessoa[2];
		
		p[0] = new APessoa("Henrique", 18, 'M');
		p[1] = new APessoa("Bruno", 16, 'F');
		
		
		CLivro l[] = new CLivro[3];
		
		l[0] = new CLivro("Diario de um banana", "Jeff Kinney", 200, 0, false, p[1]); 
		l[1] = new CLivro("Dom Casmurro", "Machado de Assis", 300, 0, false, p[0]);
		l[2] = new CLivro("Odisseia", "Homero", 600 , 0, false, p[1]);
		
		l[0].abrir();
		l[0].folhear(50);
		l[0].avançarPag();
		l[0].detalhes();
		
		
		
		
	}

}
