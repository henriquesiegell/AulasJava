package K_ProjetoPessoas;

public class EProjetoPessoas {

	public static void main(String[] args) {

		APessoa p1 = new APessoa("Henrique", 18, 'M');
		BAluno p2 = new BAluno("Beatriz", 16, 'F');
		CProfessor p3 = new CProfessor("Geraldo", 69, 'M');
		DFuncionario p4 = new DFuncionario("Vanessa", 36, 'F');
		
		p2.setCurso("Informática");
		p3.setEspecialidade("Interfaces");
		p4.setSetor("Secretaria");
		 
		p3.setSalario(2500.75f);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}

}
