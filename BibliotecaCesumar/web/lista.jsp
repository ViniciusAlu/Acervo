<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, model.Livro" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Livros</title>
</head>
<body>
    <h1>Livros Cadastrados</h1>

    <%
        List<Livro> livros = (List<Livro>) application.getAttribute("livros");
        if (livros == null || livros.isEmpty()) {
    %>
        <p>Nenhum livro cadastrado.</p>
    <%
        } else {
    %>
        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>Título</th>
                <th>Autor</th>
                <th>Ano</th>
                <th>ISBN</th>
                <th>Ações</th>
            </tr>
            <% for (Livro livro : livros) { %>
                <tr>
                    <td><%= livro.getTitulo() %></td>
                    <td><%= livro.getAutor() %></td>
                    <td><%= livro.getAno() %></td>
                    <td><%= livro.getIsbn() %></td>
                    <td>
                        <form action="LivroServlet" method="post" style="display:inline;">
                            <input type="hidden" name="isbn" value="<%= livro.getIsbn() %>">
                            <input type="submit" name="acao" value="Excluir">
                        </form>
                    </td>
                </tr>
            <% } %>
        </table>
    <%
        }
    %>

    <br>
    <a href="cadastro.jsp">Voltar para cadastro</a>
</body>
</html>
