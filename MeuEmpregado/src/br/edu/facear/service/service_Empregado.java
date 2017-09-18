package br.edu.facear.service;

import java.util.List;

import org.hibernate.HibernateException;

import br.edu.facear.dao.EmpregadoDAO;
import br.edu.facear.model.Empregado;

public class service_Empregado {

	private EmpregadoDAO eDao;
	
	public service_Empregado() {
		eDao = new EmpregadoDAO();
	}
	
	public void cadastrarEmpregado(Empregado e) throws HibernateException{
		if(e!=null) {
			eDao.cadastrar(e);
		}else {
			System.out.println("Erro ao cadastrar");
		}
	}
	public void alterarEmpregado(Empregado e) throws HibernateException{
		if(e!=null) {
			eDao.alterar(e);
		}else {
			System.out.println("Erro ao alterar");
		}
	}
	public List<Empregado> listarEmpregados() throws HibernateException{
		return eDao.listar();
	}
	public Empregado filtrarEmpregado(Integer id) throws HibernateException{
		return eDao.filtrarEmpregado(id);
	}
	
}
