import java.time.LocalDate;

public class Factura {
    private String codFact;
    private LocalDate DataHora;
    private float Valor;
    private Encomenda Encomenda;
    private Envio Envio;

    public Factura(String codFact, LocalDate dataHora, float valor, Encomenda encomenda, Envio envio) {
        this.codFact = codFact;
        DataHora = dataHora;
        Valor = valor;
        Encomenda = encomenda;
        Envio = envio;
    }

    public String getCodFact() {
        return codFact;
    }

    public void setCodFact(String codFact) {
        this.codFact = codFact;
    }

    public LocalDate getDataHora() {
        return DataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        DataHora = dataHora;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        Valor = valor;
    }

    public Encomenda getEncomenda() {
        return Encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        Encomenda = encomenda;
    }

    public Envio getEnvio() {
        return Envio;
    }

    public void setEnvio(Envio envio) {
        Envio = envio;
    }
}
