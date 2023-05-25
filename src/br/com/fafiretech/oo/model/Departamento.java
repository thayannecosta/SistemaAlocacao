package br.com.fafiretech.oo.model;

public class Departamento {
	private String nome,sigla;
	private Area area;
	
	public Departamento() {}
	
	public Departamento(String nome, String sigla, Area area) {
		this.nome = nome;
		this.sigla = sigla;
		this.area = area;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public Area getArea() {
		return area;
	}
	
	public void setArea(Area area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Departamento -> " + nome + " - Sigla -> " + sigla + " - Area ->" + area;
	}
	
}
