package br.com.fafiretech.oo.business;

import br.com.fafiretech.oo.model.Departamento;
import br.com.fafiretech.repository.RepositorioDepartamento;

public class ValidacaoDepartamento {
	
	RepositorioDepartamento repo;
	
	public ValidacaoDepartamento(RepositorioDepartamento repoDpt) {
		
		this.repo = repoDpt;
		
	}
	
	public Departamento addDepartamento(Departamento dpt) throws Exception {
		
		if(dpt.getNome() == null || dpt.getNome().length() < 2) {
			throw new Exception("Nome deve ser preenchido e ter pelo menos 2 caracteres");
		}
		if(repo.procurarDepartamentoPorNomeEArea(dpt.getNome(), dpt.getArea()) != null) {
			throw new Exception("Não pode existir um departamento com nome e area iguais");
		}
		if(repo.procurarDepartamentoPorSigla(dpt.getSigla()) != null) {
			throw new Exception("Não pode existir uma sigla já cadastrada.");
		}
		return repo.addDepartamento(dpt);
		
	}
	
	
}
