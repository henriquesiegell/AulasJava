package H_ControleRemoto;

public class CControleRemoto {

	public static void main(String[] args) {
		BControlador c = new BControlador(0, false, false);
		c.ligar();
		c.maisVolume();
		c.play();
		c.abrirMenu();
		c.fecharMenu();

	}

}
