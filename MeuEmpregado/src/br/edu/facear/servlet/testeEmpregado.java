package br.edu.facear.servlet;

import java.util.List;

import org.junit.Test;

import br.edu.facear.model.Empregado;
import br.edu.facear.service.EmpregadoService;

public class testeEmpregado {

	@Test
	public void Testar() {
		EmpregadoService es = new EmpregadoService();
		//Empregado e = new Empregado("Daniel Klostermann", "01/01/1997", "11122233345", "111111111", "36221010", "999885566", "83750000", "Rua Cônego", 190, "Casa", "Barcelona", "Lapa", "danfosquerau@gmail.com", "danfosquerau", "PR", false);
		
		//es.cadastrarEmpregado(e);
		
		List<Empregado> empregados = es.listarEmpregados();
		
		System.out.println(empregados);
	}

}
