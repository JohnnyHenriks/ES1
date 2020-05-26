public class ItensEncomenda {
    private int Quantidade;
    private Encomenda Encomenda;
    private Livro Livro;

    public ItensEncomenda(int quantidade, Encomenda encomenda, Livro livro) {
        Quantidade = quantidade;
        Encomenda = encomenda;
        Livro = livro;
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
