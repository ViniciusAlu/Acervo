package controller;

import model.Livro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/LivroServlet")
public class LivroServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        if (context.getAttribute("livros") == null) {
            context.setAttribute("livros", new ArrayList<Livro>());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        ServletContext context = getServletContext();
        List<Livro> livros = (List<Livro>) context.getAttribute("livros");

        if ("Cadastrar".equals(acao)) {
            String titulo = request.getParameter("titulo");
            String autor = request.getParameter("autor");
            String anoStr = request.getParameter("ano");
            String isbn = request.getParameter("isbn");

            // Validação
            if (titulo == null || autor == null || anoStr == null || isbn == null ||
                titulo.isEmpty() || autor.isEmpty() || anoStr.isEmpty() || isbn.isEmpty()) {
                request.setAttribute("erro", "Todos os campos devem ser preenchidos.");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }

            int ano;
            try {
                ano = Integer.parseInt(anoStr);
            } catch (NumberFormatException e) {
                request.setAttribute("erro", "Ano deve ser um número válido.");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }

            Livro livro = new Livro(titulo, autor, ano, isbn);
            livros.add(livro);

            response.sendRedirect("lista.jsp");

        } else if ("Excluir".equals(acao)) {
            String isbn = request.getParameter("isbn");

            livros.removeIf(livro -> livro.getIsbn().equals(isbn));

            response.sendRedirect("lista.jsp");

        } else {
            response.sendRedirect("cadastro.jsp");
        }
    }
}
