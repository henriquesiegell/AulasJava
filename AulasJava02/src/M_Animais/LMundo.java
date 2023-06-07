package M_Animais;

public class LMundo {

	public static void main(String[] args) {

		BMamifero m1 = new BMamifero(35.3f, 2, 4);
		m1.setCorPelo("Marrom");
		System.out.println(m1.toString());
		m1.alimentar();
		m1.locomover();
		m1.emitirSom();
		System.out.println();
		
		CReptil r1 = new CReptil(2.75f, 1, 4);
		r1.setCorEscama("Dourado");
		System.out.println(r1.toString());
		r1.alimentar();
		r1.locomover();
		r1.emitirSom();
		System.out.println();
		
		DPeixe p1 = new DPeixe(1.23f, 1, 0);
		System.out.println(p1.toString());
		p1.locomover();
		p1.alimentar();
		System.out.println();
		
		EAve a1 = new EAve(3.86f, 3, 2);
		System.out.println(a1.toString());
		a1.locomover();
		a1.fazerNinho();
		System.out.println();
		
		FCanguru c = new FCanguru(15.63f, 3, 4);
		c.locomover();
		c.emitirSom();
		System.out.println();
		
		GCachorro k = new GCachorro(8.12f, 5, 4);
		k.locomover();
		k.emitirSom();
		System.out.println();
		
		HCobra s = new HCobra(5.42f, 2, 0);
		s.locomover();
		System.out.println();
		
		ITartaruga t = new ITartaruga(9.27f, 10, 4);
		t.locomover();
		System.out.println();
		
		JGoldfish g = new JGoldfish(0.35f, 1, 0);
		g.alimentar();
		System.out.println();
		
		KArara a = new KArara(6.72f, 7, 2);
		a.fazerNinho();
		a.emitirSom();
		
		
		
		
		
	}

}
