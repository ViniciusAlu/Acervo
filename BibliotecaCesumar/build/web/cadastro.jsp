<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Livro</title>
</head>
<body>
    <h2>Cadastrar Novo Livro</h2>

    <%-- Exibe mensagem de erro se houver --%>
    <c:if test="${not empty erro}">
        <p style="color:red">${erro}</p>
    </c:if>

    <form action="LivroServlet" method="post">
        <input type="hidden" name="acao" value="Cadastrar" />

        <label for="titulo">Título:</label><br>
        <input type="text" id="titulo" name="titulo" required><br><br>

        <label for="autor">Autor:</label><br>
        <input type="text" id="autor" name="autor" required><br><br>

        <label for="ano">Ano de Publicação:</label><br>
        <input type="number" id="ano" name="ano" required><br><br>

        <label for="isbn">ISBN:</label><br>
        <input type="text" id="isbn" name="isbn" required><br><br>

        <input type="submit" value="Cadastrar">
    </form>

    <br>
    <a href="index.jsp">Voltar ao Início</a>
</body>
</html>
