public class TipoNotificacaoEmail {
    private String CodigoTipo;
    private String Texto;

    public TipoNotificacaoEmail(String codigoTipo, String texto) {
        CodigoTipo = codigoTipo;
        Texto = texto;
    }

    public String getCodigoTipo() {
        return CodigoTipo;
    }

    public void setCodigoTipo(String codigoTipo) {
        CodigoTipo = codigoTipo;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
}
