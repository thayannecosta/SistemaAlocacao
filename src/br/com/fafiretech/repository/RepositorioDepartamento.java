package br.com.fafiretech.repository;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.fafiretech.oo.model.Area;
import br.com.fafiretech.oo.model.Departamento;

public class RepositorioDepartamento {
	
	private ArrayList<Departamento> arrayDpt = new ArrayList<Departamento>();
	
	public Departamento addDepartamento(Departamento dpt) {
		
		arrayDpt.add(dpt);
		
		return dpt;
		
	}
	
	public Departamento procurarDepartamentoPorNomeEArea(String nome,Area area) {
		
		for(Departamento dpt : arrayDpt) {
			if(dpt.getNome().equals(nome) && dpt.getArea().equals(area)) {
				return dpt;
			}
		}
		
		return null;
	}
	
	public Departamento procurarDepartamentoPorSigla(String sigla) {
		for(Departamento dpt : arrayDpt) {
			if(dpt.getSigla().equals(sigla)) {
				return dpt;
			}
		}
			
			return null;
	}
}
