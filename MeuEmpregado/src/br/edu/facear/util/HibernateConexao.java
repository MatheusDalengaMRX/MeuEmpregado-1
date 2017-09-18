package br.edu.facear.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateConexao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MeuEmpregado");

	public static EntityManagerFactory getInstance() {
		return emf;
	}
	
}
