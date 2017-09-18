package br.edu.facear.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.facear.model.Empregado;
import br.edu.facear.util.HibernateConexao;
import br.edu.facear.util.InterfaceDAO;

public class EmpregadoDAO implements InterfaceDAO<Empregado>{

	EntityManagerFactory emf = HibernateConexao.getInstance();
	
	@Override
	public void cadastrar(Empregado t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Empregado t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Empregado> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("from Empregado");
		return q.getResultList();
	}

	@Override
	public Empregado filtrarEmpregado(Integer id) {
		Empregado empregado = new Empregado();
		//Por enquanto desconhecido como fazer
		return empregado;
	}
}
