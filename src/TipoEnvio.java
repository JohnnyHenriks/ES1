public class TipoEnvio {
    private int TipoEnvio;
    private String Descricao;

    public TipoEnvio(int tipoEnvio, String descricao) {
        TipoEnvio = tipoEnvio;
        Descricao = descricao;
    }

    public int getTipoEnvio() {
        return TipoEnvio;
    }

    public void setTipoEnvio(int tipoEnvio) {
        TipoEnvio = tipoEnvio;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
