//FACADE

package br.edu.facear.util;

import java.util.List;

import br.edu.facear.model.Empregado;

public interface EmpregadoFacade<T> {

	public void cadastrar(T t);
	public void alterar(T t);
	public List<T> listar();
	public Empregado filtrarEmpregado(Integer id);
	public Empregado filtrarEmpregadoNome(String nome_completo);
	
}
