package M_Animais;

public class HCobra extends CReptil {

	public HCobra(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando!");	}
	
}
