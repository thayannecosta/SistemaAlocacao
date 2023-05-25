package br.com.fafiretech.oo.ui;
import java.util.Scanner;
import br.com.fafiretech.oo.model.Curso;
import br.com.fafiretech.oo.model.Departamento;
import br.com.fafiretech.repository.RepositorioCurso;
public class CursoUi {
	
	public static void criarCurso() throws Exception {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Nome do curso: ");
	 String nomeCurso = sc.nextLine();
	 System.out.println("Sigla do curso: ");
	 String siglaCurso = sc.nextLine();
	 
	 Departamento dpt = DepartamentoUi.createDpt();
	 Curso curso = new Curso(nomeCurso, siglaCurso, dpt);
	 RepositorioCurso repoCurso = new RepositorioCurso();
	 System.out.println(repoCurso.addCurso(curso));
		
	}
}
