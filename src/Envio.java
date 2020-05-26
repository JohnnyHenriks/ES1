import java.time.LocalDate;

public class Envio {
    private int NumEnv;
    private LocalDate DataHoraEnv;
    private Funcionario Funcionario;
    private Transportadora Transportadora;
    private TipoEnvio TipoEnvio;

    public Envio(int numEnv, LocalDate dataHoraEnv, Funcionario funcionario, Transportadora transportadora, TipoEnvio tipoEnvio) {
        NumEnv = numEnv;
        DataHoraEnv = dataHoraEnv;
        Funcionario = funcionario;
        Transportadora = transportadora;
        TipoEnvio = tipoEnvio;
    }

    public int getNumEnv() {
        return NumEnv;
    }

    public void setNumEnv(int numEnv) {
        NumEnv = numEnv;
    }

    public LocalDate getDataHoraEnv() {
        return DataHoraEnv;
    }

    public void setDataHoraEnv(LocalDate dataHoraEnv) {
        DataHoraEnv = dataHoraEnv;
    }

    public Funcionario getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        Funcionario = funcionario;
    }

    public Transportadora getTransportadora() {
        return Transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        Transportadora = transportadora;
    }

    public TipoEnvio getTipoEnvio() {
        return TipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        TipoEnvio = tipoEnvio;
    }
}
