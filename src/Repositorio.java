import java.util.ArrayList;

public interface Repositorio{
    ArrayList<Encomenda> ListaEncomenda = new ArrayList<Encomenda>();
    ArrayList<ItensEncomenda> ListaItensEncomenda = new ArrayList<ItensEncomenda>();
    ArrayList<Entrega> ListaEntrega = new ArrayList<Entrega>();
    ArrayList<Envio> ListaEnvio = new ArrayList<Envio>();
    ArrayList<EstadoEncomenda> ListaEstadoEncomenda = new ArrayList<EstadoEncomenda>();
    ArrayList<Factura> ListaFactura = new ArrayList<Factura>();
    ArrayList<Funcionario> ListaFuncionario = new ArrayList<Funcionario>();
    ArrayList<Livro> ListaLivro = new ArrayList<Livro>();
    ArrayList<NotificacaoEmail> ListaNotificacaoEmail = new ArrayList<NotificacaoEmail>();
    ArrayList<Questionario> ListaQuestionario = new ArrayList<Questionario>();
    ArrayList<TipoEnvio> ListaTipoEnvio = new ArrayList<TipoEnvio>();
    ArrayList<TipoNotificacaoEmail> ListaTipoNotificacaoEmail = new ArrayList<TipoNotificacaoEmail>();
    ArrayList<Transportadora> ListaTransportadora = new ArrayList<Transportadora>();
    ArrayList<Utilizador> ListaUtilizador = new ArrayList<Utilizador>();
    ArrayList<Voucher> ListaVoucher = new ArrayList<Voucher>();


    void adicionaEncomenda(Encomenda encomenda);

    Encomenda devolveEncomenda(int id);

    void adicionaItensEncomenda(ItensEncomenda itensEncomenda);

    ItensEncomenda devolveItensEncomenda(int id);

    void adicionaEntrega(Entrega entrega);

    Entrega devolveEntrega(int id);

    void adicionaEnvio(Envio envio);

    Envio devolveEnvio(int NumEnv);

    void adicionaEstadoEncomenda(EstadoEncomenda estadoEncomenda);

    EstadoEncomenda devolveEstadoEncomenda(int IdEstado);

    void adicionaFactura(Factura factura);

    Factura devolveFactura(String codFact);

    void adicionaFuncionario(Funcionario funcionario);

    Funcionario devolveFuncionario(String CodFunc);

    void adicionaLivro(Livro livro);

    Livro devolveLivro(String ISBN);

    void adicionaNotificacaoEmail(NotificacaoEmail notificacaoEmail);

    NotificacaoEmail devolveNotificacaoEmail(int codigoNot);

    void adicionaQuestionario(Questionario questionario);

    Questionario devolveQuestionario(int Id);

    void adicionaTipoEnvio(TipoEnvio tipoEnvio);

    public TipoEnvio devolveTipoEnvio(int TipoEnvio);

    void adicionaTipoNotificacaoEmail(TipoNotificacaoEmail tipoNotificacaoEmail);

    TipoNotificacaoEmail devolveTipoNotificacaoEmail(String CodigoTipo);

    void adicionaTransportadora(Transportadora transportadora);

    Transportadora devolveTransportadora(int IdTransp);

    void adicionaUtilizador(Utilizador utilizador);

    Utilizador devolveUtilizador(int Id);

    void adicionaVoucher(Voucher voucher);

    Voucher devolveVoucher(int Id);
}
