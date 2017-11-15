package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.Contato;
import dao.ContatoDAO;
import dao.DAOFactory;

@WebServlet("/terceiraQuestao")
public class ListarContatos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarContatos() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ContatoDAO dao = new ContatoDAO(DAOFactory.getInstance());

		PrintWriter out = response.getWriter();

		out.println("<table width=“100” height=“100” border=“0” cellpadding=“0”");

		for (Contato contato : dao.listar()) {
			out.println("<tr>");
			out.println("<td>" + contato.getNome() + "</td>");
			out.println("<td>" + contato.getEmail() + "</td>");
			out.println("<td>" + contato.getEndereco() + "</td>");
			out.println("<td>" + contato.getDataNascimento().get(Calendar.DATE) + "/"
					+ contato.getDataNascimento().get(Calendar.MONTH) + "/"
					+ contato.getDataNascimento().get(Calendar.YEAR) + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
