package N_Animais;

public class EMundo {

	public static void main(String[] args) {
		
		BMamifero m = new BMamifero();
		m.emitirSom();
		System.out.println();
		
		CLobo l = new CLobo();
		l.emitirSom();
		System.out.println();
		
		DCachorro c = new DCachorro();
		c.emitirSom();
		System.out.println();
		c.reagir(false);
		c.reagir(true);
		System.out.println();
		c.reagir("Ola");
		c.reagir("Seu feio");
		System.out.println();
		c.reagir(1, 39);
		c.reagir(15, 59);
		
		
	}

}
