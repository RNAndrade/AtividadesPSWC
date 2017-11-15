package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basic.Contato;
import negocio.ContatoRN;

@WebServlet("/adicionaContato")
public class AdicionaContato extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdicionaContato() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("dataNascimento");
		Calendar dataNascimento = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return;
		}

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEndereco(endereco);
		contato.setEmail(email);
		contato.setDataNascimento(dataNascimento);

		ContatoRN rn = new ContatoRN();
		rn.novoContato(contato);

		out.println("<html>");
		out.println("<body>");
		out.println("Contato adicionado com sucesso!</br>");
		out.println("Nome: " + contato.getNome() + "</br>");
		out.println("E-mail: " + contato.getEmail() + "</br>");
		out.println("Endereço: " + contato.getEndereco() + "</br>");
		out.println("Data de Nascimento: " + contato.getDataNascimento().get(Calendar.DATE) + "/"
				+ contato.getDataNascimento().get(Calendar.MONTH) + "/"
				+ contato.getDataNascimento().get(Calendar.YEAR) + "</br>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
