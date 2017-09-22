package br.edu.facear.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.Empregado;
import br.edu.facear.service.EmpregadoService;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		redirecionar(request, response);
	}
       
	public void redirecionar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextpage = "/listarEmpregados.jsp";
		EmpregadoService se = new EmpregadoService();
		List<Empregado> lista = se.listarEmpregados();
		request.setAttribute("listaEmpregados", lista);
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextpage);
		rd.forward(request, response);
	}

}
