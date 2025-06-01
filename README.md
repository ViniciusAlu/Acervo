# Sistema Web - Biblioteca Universidade Cesumar 🎓:
Um sistema web desenvolvido em Java para gerenciar o acervo de Livros de uma Biblioteca

## 💽:Funcionalidades
- Cadastro de Livros com os campos:
  - Título;
  - Autor;
  - Ano de publicação;
  - ISBN
- Listagem dos Livros cadastrados;
- Exclusão de livros pelo ISBN;
- Interface web com JSP;
- Estrutura baseada no padrão MVC(Model-View-Controller);
- Validação de campos obrigatórios e tipos.

## 💻: Tecnologias utilizadas:
**Java 8**
**Apache Tomcat 9**
**Servlets (Javax.servlet)**
**NetBeans IDE*
**HTML**

## 📩:Estrutura de Diretórios:
BibliotecaCesumar/
│
├── src/
│ ├── controller/
│ │ └── LivroServlet.java
│ ├── model/
│ │ └── Livro.java
│
├── web/
│ ├── cadastro.jsp
│ ├── lista.jsp
│ ├── index.jsp
│ └── WEB-INF/
│ └── web.xml

## ⚙️ Como Executar:
1. Abra o projeto no **NetBeans**.
2. Verifique se o **Apache Tomcat 9** está configurado.
3. Execute o projeto como **"Run Project" (F6)**.
4. Acesse no navegador:
   http://localhost:8080/BibliotecaCesumar/index.jsp


## 💡 Observações

- Os dados são armazenados **em memória**, ou seja, se o servidor for reiniciado, os cadastros serão perdidos.
- O projeto foi desenvolvido como parte de uma atividade acadêmica, sem o uso de frameworks externos como Spring.


## 👨‍💻 Autor

Desenvolvido por Vinicius como parte do curso de Análise e Desenvolvimento de Sistemas da Universidade Cesumar.


## 📄 Licença

Este projeto é de uso educacional e não possui licença comercial.

