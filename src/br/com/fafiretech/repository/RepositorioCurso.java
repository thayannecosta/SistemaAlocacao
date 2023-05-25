package br.com.fafiretech.repository;
import java.util.ArrayList;
import br.com.fafiretech.oo.model.Curso;

public class RepositorioCurso {
	
	private ArrayList<Curso> arrayCurso = new ArrayList<Curso>();
	
	public Curso addCurso(Curso curso) {
		arrayCurso.add(curso);
		return curso;
	}
}
