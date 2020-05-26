import java.time.LocalDate;

public class Entrega {
    private int NumEnv;
    private LocalDate DataHoraEnv;
    private Transportadora Transportadora;

    public Entrega(int numEnv, LocalDate dataHoraEnv, Transportadora transportadora) {
        NumEnv = numEnv;
        DataHoraEnv = dataHoraEnv;
        Transportadora = transportadora;
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

    public Transportadora getTransportadora() {
        return Transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        Transportadora = transportadora;
    }
}
