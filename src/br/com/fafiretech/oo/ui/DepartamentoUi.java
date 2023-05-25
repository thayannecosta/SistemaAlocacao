package br.com.fafiretech.oo.ui;
import java.util.Scanner;

import br.com.fafiretech.oo.business.ValidacaoDepartamento;
import br.com.fafiretech.oo.model.Area;
import br.com.fafiretech.oo.model.Departamento;
import br.com.fafiretech.repository.RepositorioDepartamento;

public class DepartamentoUi {

	public static Departamento createDpt() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do departamento: ");
		String nomeDpt = sc.nextLine();
		System.out.println("Sigla do departamento: ");
		String siglaDpt = sc.nextLine();
		
		int areaInt = 0;
		
			
		
		do {
			System.out.println("Area do departamento(digite 1,2,3): ");		
			areaInt = sc.nextInt();
			if(areaInt < 1 || areaInt > 3) {
				System.out.println("Area deve ser 1,2 ou 3 ");
			}
		}	
		while(areaInt < 1 || areaInt > 3);
		
		Area area = escolherArea(areaInt);
		
		Departamento dpt = new Departamento(nomeDpt,siglaDpt,area);
		
		RepositorioDepartamento repo = new RepositorioDepartamento();
		
		ValidacaoDepartamento validaDpt = new ValidacaoDepartamento(repo);
		
		System.out.println(validaDpt.addDepartamento(dpt));
		
		return dpt;
	}
	public static Area escolherArea(int numeroArea) {
		
		Area area = switch (numeroArea) {
	    case 1: {
	        yield Area.Biologicas;
	    }
	    case 2: {
	    	yield Area.Humanas;
	    }
	    case 3: {
	    	yield Area.Exatas;
	    }
	    default: 
	        throw new IllegalArgumentException("Unexpect value: " + numeroArea);
		};

		return area;
	}
}
