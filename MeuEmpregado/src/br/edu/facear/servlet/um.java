package br.edu.facear.servlet;

import java.util.ArrayList;
import java.util.List;

import br.edu.facear.model.Empregado;
import br.edu.facear.service.service_Empregado;

public class um {

	public static void main(String[] args) {
		service_Empregado se = new service_Empregado();
		Empregado e = new Empregado();
		
		List<Empregado> listar = new ArrayList<>();
		listar = se.listarEmpregados();
		System.out.println(listar);
	}

}
