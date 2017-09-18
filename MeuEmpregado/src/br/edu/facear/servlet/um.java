package br.edu.facear.servlet;

import java.util.ArrayList;
import java.util.List;

import br.edu.facear.model.Empregado;
import br.edu.facear.service.service_Empregado;

public class um {

	public static void main(String[] args) {
		service_Empregado se = new service_Empregado();
		Empregado e = new Empregado();
		e.setNome_completo("Leonardo");
		se.cadastrarEmpregado(e);
		
		Empregado e1 = new Empregado();
		e1.setNome_completo("Lorena");
		se.cadastrarEmpregado(e1);
		
		Empregado e2 = new Empregado();
		e2.setNome_completo("André");
		se.cadastrarEmpregado(e2);
		
		List<Empregado> listar = new ArrayList<>();
		listar = se.listarEmpregados();
		System.out.println(listar);
	}

}
