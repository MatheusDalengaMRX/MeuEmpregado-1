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
 * Servlet implementation class filtrarEmpregado
 */
@WebServlet("/filtrarEmpregado")
public class filtrarEmpregado extends IndexServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filtrarEmpregado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome_completo = request.getParameter("nome_completo");
		String nextpage = "/listarEmpregados.jsp";
		
		EmpregadoService se = new EmpregadoService();
		Empregado e = se.filtrarEmpregadoNome(nome_completo);
		request.setAttribute("listaEmpregados", e);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextpage);
		rd.forward(request, response);
	}

}
