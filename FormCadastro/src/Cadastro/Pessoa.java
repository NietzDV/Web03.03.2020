package Cadastro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pessoa
 */
@WebServlet("/Pessoa")
public class Pessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Pessoa() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			String nome;
			Integer idade;
			String email;
			String login;
			String senha;
			
			nome = request.getParameter("nome");
			idade = Integer.parseInt(request.getParameter("idade"));
			email = request.getParameter("email");
			login = request.getParameter("login");
			senha = request.getParameter("senha");
		
			response.getWriter().append(nome + "\t" + idade +  "\t" + email + "\t" + login + "\t" + senha + "\t");
		
		
	}

}
