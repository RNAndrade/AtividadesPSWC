package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/primeiraQuestao")
public class PrimeiraQuestao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrimeiraQuestao() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String data = request.getParameter("dataNascimento");

		out.println("<html>");
		out.println("<body>");
		out.println("Nome: " + nome + "</br>");
		out.println("E-mail: " + endereco + "</br>");
		out.println("Endereço: " + email + "</br>");
		out.println("Data de Nascimento: " + data + "</br>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
