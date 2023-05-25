package br.com.fafiretech.oo.model;

public class Curso {
	private String nomeCurso,siglaCurso;
	private Departamento dptCurso;
	
	public Curso() {}

	public Curso(String nomeCurso, String siglaCurso, Departamento dptCurso) {
		super();
		this.nomeCurso = nomeCurso;
		this.siglaCurso = siglaCurso;
		this.dptCurso = dptCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getSiglaCurso() {
		return siglaCurso;
	}

	public void setSiglaCurso(String siglaCurso) {
		this.siglaCurso = siglaCurso;
	}

	public Departamento getDptCurso() {
		return dptCurso;
	}

	public void setDptCurso(Departamento dptCurso) {
		this.dptCurso = dptCurso;
	}

	@Override
	public String toString() {
		return "Nome do curso: " + nomeCurso + " - Sigla do curso: " + siglaCurso + " - Departamento do curso: " + dptCurso;
	}
	
}
