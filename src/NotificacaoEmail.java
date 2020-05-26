import java.time.LocalDate;

public class NotificacaoEmail {
    private int codigoNot;
    private LocalDate DataHoraNot;
    private String Email;
    private String Texto;
    private Encomenda Encomenda;
    private TipoNotificacaoEmail TipoNotificacaoEmail;
    private Entrega Entrega;

    public NotificacaoEmail(int codigoNot, LocalDate dataHoraNot, String email, String texto, Encomenda encomenda, TipoNotificacaoEmail tipoNotificacaoEmail, Entrega entrega) {
        this.codigoNot = codigoNot;
        DataHoraNot = dataHoraNot;
        Email = email;
        Texto = texto;
        Encomenda = encomenda;
        TipoNotificacaoEmail = tipoNotificacaoEmail;
        Entrega = entrega;
    }

    public int getCodigoNot() {
        return codigoNot;
    }

    public void setCodigoNot(int codigoNot) {
        this.codigoNot = codigoNot;
    }

    public LocalDate getDataHoraNot() {
        return DataHoraNot;
    }

    public void setDataHoraNot(LocalDate dataHoraNot) {
        DataHoraNot = dataHoraNot;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public Encomenda getEncomenda() {
        return Encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        Encomenda = encomenda;
    }

    public TipoNotificacaoEmail getTipoNotificacaoEmail() {
        return TipoNotificacaoEmail;
    }

    public void setTipoNotificacaoEmail(TipoNotificacaoEmail tipoNotificacaoEmail) {
        TipoNotificacaoEmail = tipoNotificacaoEmail;
    }

    public Entrega getEntrega() {
        return Entrega;
    }

    public void setEntrega(Entrega entrega) {
        Entrega = entrega;
    }
}
