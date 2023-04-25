package B_Exercícios;

public class A_02PetShop {

	public static void main(String[] args) {
		A_01Cachorro cachorro = new A_01Cachorro();
		
		cachorro.nome = "Tobby Weirich Dolbeth Siegel";
		cachorro.raça = "Golden Retriever";
		cachorro.sexo = 'M';
		cachorro.idade = 2;
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raça);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("Idade: " + cachorro.idade);
		

	}

}
