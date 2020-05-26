public class Voucher {
    private int Id;
    private String Codigo;
    private String Descricao;

    public Voucher(int id, String codigo, String descricao) {
        Id = id;
        Codigo = codigo;
        Descricao = descricao;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
