import java.time.LocalDate;

public class Encomenda {
    private int Id;
    private LocalDate DataHora;
    private EstadoEncomenda EstadoEncomenda;
    private Utilizador Utilizador;
    private Funcionario Funcionario;
    private Voucher Voucher;
    private Questionario Questionario;

    public Encomenda(int id, LocalDate dataHora, EstadoEncomenda estadoEncomenda, Utilizador utilizador, Funcionario funcionario, Voucher voucher, Questionario questionario) {
        Id = id;
        DataHora = dataHora;
        EstadoEncomenda = estadoEncomenda;
        Utilizador = utilizador;
        Funcionario = funcionario;
        Voucher = voucher;
        Questionario = questionario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getDataHora() {
        return DataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        DataHora = dataHora;
    }

    public EstadoEncomenda getEstadoEncomenda() {
        return EstadoEncomenda;
    }

    public void setEstadoEncomenda(EstadoEncomenda estadoEncomenda) {
        EstadoEncomenda = estadoEncomenda;
    }

    public Utilizador getUtilizador() {
        return Utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        Utilizador = utilizador;
    }

    public Funcionario getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        Funcionario = funcionario;
    }

    public Voucher getVoucher() {
        return Voucher;
    }

    public void setVoucher(Voucher voucher) {
        Voucher = voucher;
    }

    public Questionario getQuestionario() {
        return Questionario;
    }

    public void setQuestionario(Questionario questionario) {
        Questionario = questionario;
    }
}
