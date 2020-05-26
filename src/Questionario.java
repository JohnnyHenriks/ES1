public class Questionario {
    private int Id;
    private String Descricao;

    public Questionario(int id, String descricao) {
        Id = id;
        Descricao = descricao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
