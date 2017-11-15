package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.Usuario;
import negocio.UsuarioRN;

@WebServlet("/novoUsuario")
public class CadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroUsuario() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);

		UsuarioRN rn = new UsuarioRN();
		rn.novoUsuario(usuario);

		out.println("<html>");
		out.println("<body>");
		out.println("Usuário cadastrado com sucesso!</br>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
