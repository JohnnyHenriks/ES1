public class EstadoEncomenda {
    private int IdEstado;
    private String Descricao;

    public EstadoEncomenda(int idEstado, String descricao) {
        IdEstado = idEstado;
        Descricao = descricao;
    }

    public int getIdEstado() {
        return IdEstado;
    }

    public void setIdEstado(int idEstado) {
        IdEstado = idEstado;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
