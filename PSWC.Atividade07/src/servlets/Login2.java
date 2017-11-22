package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import basic.Usuario;
import negocio.UsuarioRN;

@WebServlet("/login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login2() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login, senha;

		login = request.getParameter("login");
		senha = request.getParameter("senha");

		HttpSession session = request.getSession(true);
		session.setAttribute("loginUsuario", login);
		
		if (new UsuarioRN().logar(new Usuario(login, senha))) {
			RequestDispatcher rd = request.getRequestDispatcher("/principal.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/setimaquestao.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
