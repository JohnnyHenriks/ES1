public class Livro {
    private String Titulo;
    private String Autor;
    private String Editora;
    private int Ano;
    private String ISBN;

    public Livro(String titulo, String autor, String editora, int ano, String ISBN) {
        Titulo = titulo;
        Autor = autor;
        Editora = editora;
        Ano = ano;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
