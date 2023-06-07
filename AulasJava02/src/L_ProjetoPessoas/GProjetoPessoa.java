package L_ProjetoPessoas;

public class GProjetoPessoa {

	public static void main(String[] args) {

	//	APessoa p1 = new APessoa();  --> não pode ser Instanciada, porque a Classe Pessoa é Abstrata
		
		BVisitante v1 = new BVisitante("Jose", 19, 'F');
		System.out.println(v1.toString());
		System.out.println();
		
		CAluno a1 = new CAluno("Bruno", 16, 'M');
		a1.setCurso("Informatica");
		a1.setMatricula(30917);
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		System.out.println();
		
		DBolsista b1 = new DBolsista("Beatriz", 16, 'F');
		b1.setMatricula(11111);
		b1.setBolsa(12.75f);
		System.out.println(b1.toString());
		b1.pagarMensalidade();
		System.out.println();
		
		ETecnico t1 = new ETecnico("Alexandre", 16, 'M');
		t1.setRegistroProfissional(75632);
		t1.setCursoTecnico("Encanador");
		t1.praticar();
		System.out.println(t1.toString());
		System.out.println();
		
		FProfessor prof1 = new FProfessor("Artur", 36, 'M');
		prof1.setEspecialidde("Fisica");
		prof1.setSalario(13275.87f);
		prof1.receberAumento();
		System.out.println(prof1.toString());
		System.out.println("Seu salario eh " + prof1.getSalario());
		System.out.println();
		
		
		
		
		
		
		
	}

}
