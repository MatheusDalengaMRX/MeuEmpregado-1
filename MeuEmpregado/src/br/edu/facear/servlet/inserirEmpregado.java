package br.edu.facear.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.Empregado;
import br.edu.facear.service.EmpregadoService;

/**
 * Servlet implementation class inserirEmpregado
 */
@WebServlet("/inserirEmpregado")
public class inserirEmpregado extends IndexServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextpage = "/inserirEmpregado.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextpage);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data_nascimento = request.getParameter("data_nascimento");
		String nome_completo = request.getParameter("nome_completo");
		String cpf = request.getParameter("cpf");
		String rg = request.getParameter("rg");
		String telefone_fixo = request.getParameter("telefone_fixo");
		String telefone_celular = request.getParameter("telefone_celular");
		String cep = request.getParameter("cep");
		String endereco_rua = request.getParameter("endereco_rua");
		String numero = request.getParameter("numero");
		String complemento = request.getParameter("complemento");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String uf = request.getParameter("uf");
		String sexo = request.getParameter("sexo");
		
		EmpregadoService se = new EmpregadoService();
		Empregado e = new Empregado(nome_completo, data_nascimento, cpf, rg, telefone_fixo, telefone_celular, cep, endereco_rua, Integer.parseInt(numero), complemento, bairro, cidade, email, senha, uf, Boolean.parseBoolean(sexo));
		se.cadastrarEmpregado(e);
		
		redirecionar(request, response);
	}

}
