package I_UEC;

public class DLutador {

	public static void main(String[] args) {

		BLutador l[] = new BLutador[6]; // Criando seis Vetores
		
		l[0] = new BLutador("Henrique", "Brasil", 31, 1.75f, 68.9f, 11, 3, 1);
		l[1] = new BLutador("Carlos", "Franca", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new BLutador("Gabriel", "Japao", 19, 1.77f, 67.9f, 1, 5, 2);
		l[3] = new BLutador("Felipe", "Australia", 21, 1.81f, 71.5f, 3, 1, 4);
		l[4] = new BLutador("Lucas", "EUA", 19, 1.74f, 68.2f, 3, 4, 1);
		l[5] = new BLutador("Gilberto", "Brasil", 20, 1.73f, 69.3f, 5, 0, 3);

		
		CLuta UEC01 = new CLuta();
		
		UEC01.marcarLuta(l[4], l[1]);
		UEC01.lutar();
		
		l[0].apresentar();
		System.out.println();
		l[1].apresentar();
				
		
		
				
				
	}

}
