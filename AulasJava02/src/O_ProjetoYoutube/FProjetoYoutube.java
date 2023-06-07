package O_ProjetoYoutube;

public class FProjetoYoutube {

	public static void main(String[] args) {

		BVideo v[] = new BVideo[3];
		
		v[0] = new BVideo("Encapsulamento");
		v[1] = new BVideo("Herança");
		v[2] = new BVideo("Polimorfismo");
		
		System.out.println(v[0].toString()); 
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println();
		
		DUsuario u[] = new DUsuario[2];
		
		u[0] = new DUsuario("Bruna", 15, 'F', 15896);
		u[1] = new DUsuario("Felipe", 17, 'M', 49627);
		
		System.out.println(u[0].toString()); 
		System.out.println(u[1].toString()); 
		System.out.println();
		
		EVizualização vis[] = new EVizualização[5];
		
		vis[0] = new EVizualização (u[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new EVizualização(u[0], v[1]);
		vis[0].avaliar(82.0f);
		System.out.println(vis[0].toString());
	}

}
