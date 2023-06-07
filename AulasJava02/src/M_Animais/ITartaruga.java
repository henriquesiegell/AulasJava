package M_Animais;

public class ITartaruga extends CReptil {

	public ITartaruga(float peso, int idade, int membros) {
		super(peso, idade, membros);
	}
	
	@Override
	public void locomover() {
		System.out.println("Andando beeeeem devagar");
	}

}
