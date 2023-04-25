package B_01POO;

public class B_03ComposiçãoDeObjetos {

	public static void main(String[] args) {
		B_02Proprietário dono = new B_02Proprietário();
		dono.nome = "João da Silva";
		dono.cpf = "000.000.000-00";
		dono.idade = 25;
		dono.logradouro = "Rua Sampaio Ferraz, 10";
		dono.bairro = "Centro";
//		dono.cidade = "Uberlândia"; (***)
		
		B_01Carro meuCarro = new B_01Carro();
		meuCarro.anoDeFabricaçao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.dono = dono;
		meuCarro.dono.cidade = "Uberlândia"; // (***) É possível escrever dessa maneira também
		
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricaçao);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Dono: " + meuCarro.dono.nome); // Os Objetos se ligam
		System.out.println("Cidade: " + meuCarro.dono.cidade);
				
				
	}

}
