public class ItensEncomenda {
    private int Id;
    private int Quantidade;
    private Encomenda Encomenda;
    private Livro Livro;

    public ItensEncomenda(int id, int quantidade, Encomenda encomenda, Livro livro) {
        Id = id;
        Quantidade = quantidade;
        Encomenda = encomenda;
        Livro = livro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public Encomenda getEncomenda() {
        return Encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        Encomenda = encomenda;
    }

    public Livro getLivro() {
        return Livro;
    }

    public void setLivro(Livro livro) {
        Livro = livro;
    }
}
