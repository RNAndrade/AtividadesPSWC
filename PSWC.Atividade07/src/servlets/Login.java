package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import basic.Usuario;
import negocio.UsuarioRN;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		String login, senha;

		login = request.getParameter("login");
		senha = request.getParameter("senha");

		HttpSession session = request.getSession(true);
		session.setAttribute(login, senha);
		
		if (new UsuarioRN().logar(new Usuario(login, senha))) {
			writer.print("<html><body>");
			writer.print("<center>");
			writer.print("<h3>Bem Vindo: " + login + "</h3>");
			writer.print("<h3>Sessão: " + session.getId() + "</h3>");
			writer.print("</html></body>");
		} else {
			writer.print("<html><body>");
			writer.print("<center>");
			writer.print("<h3>Acesso negado</h3>");
			writer.print("</html></body>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
