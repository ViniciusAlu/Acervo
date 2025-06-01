package controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import model.Livro;

@WebServlet("/excluirLivro")
public class ExcluirLivro extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String isbnParaExcluir = request.getParameter("isbn");
        List<Livro> listaLivros = (List<Livro>) getServletContext().getAttribute("listaLivros");

        if (listaLivros != null && isbnParaExcluir != null) {
            listaLivros.removeIf(livro -> livro.getIsbn().equals(isbnParaExcluir));
        }

        response.sendRedirect("listar.jsp");
    }
}
