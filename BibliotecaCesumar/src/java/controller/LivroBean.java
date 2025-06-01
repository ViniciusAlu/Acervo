package controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Livro;


public class LivroBean implements Serializable {

    private Livro livro = new Livro();
    private List<Livro> livros = new ArrayList<>();

    public String salvar() {
        livros.add(livro);
        livro = new Livro(); // limpa os campos após salvar
        return "listar.xhtml?faces-redirect=true";
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
