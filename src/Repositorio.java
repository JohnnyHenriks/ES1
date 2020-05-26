import java.util.ArrayList;

public class Repositorio extends Object {
    private ArrayList<Encomenda> ListaEncomenda = new ArrayList<Encomenda>();
    private ArrayList<ItensEncomenda> ListaItensEncomenda = new ArrayList<ItensEncomenda>();
    private ArrayList<Entrega> ListaEntrega = new ArrayList<Entrega>();
    private ArrayList<Envio> ListaEnvio = new ArrayList<Envio>();
    private ArrayList<EstadoEncomenda> ListaEstadoEncomenda = new ArrayList<EstadoEncomenda>();
    private ArrayList<Factura> ListaFactura = new ArrayList<Factura>();
    private ArrayList<Funcionario> ListaFuncionario = new ArrayList<Funcionario>();
    private ArrayList<Livro> ListaLivro = new ArrayList<Livro>();
    private ArrayList<NotificacaoEmail> ListaNotificacaoEmail = new ArrayList<NotificacaoEmail>();
    private ArrayList<Questionario> ListaQuestionario = new ArrayList<Questionario>();
    private ArrayList<TipoEnvio> ListaTipoEnvio = new ArrayList<TipoEnvio>();
    private ArrayList<TipoNotificacaoEmail> ListaTipoNotificacaoEmail = new ArrayList<TipoNotificacaoEmail>();
    private ArrayList<Transportadora> ListaTransportadora = new ArrayList<Transportadora>();
    private ArrayList<Utilizador> ListaUtilizador = new ArrayList<Utilizador>();
    private ArrayList<Voucher> ListaVoucher = new ArrayList<Voucher>();

    public Repositorio(){

    }

    public void adicionaEncomenda(Encomenda encomenda){
        ListaEncomenda.add(encomenda);
    }

    public void adicionaItensEncomenda(ItensEncomenda itensEncomenda){
        ListaItensEncomenda.add(itensEncomenda);
    }

    public void adicionaEntrega(Entrega entrega){
        ListaEntrega.add(entrega);
    }

    public void adicionaEnvio(Envio envio){
        ListaEnvio.add(envio);
    }

    public void adicionaEstadoEncomenda(EstadoEncomenda estadoEncomenda){
        ListaEstadoEncomenda.add(estadoEncomenda);
    }

    public void adicionaFactura(Factura factura){
        ListaFactura.add(factura);
    }

    public void adicionaFuncionario(Funcionario funcionario){
        ListaFuncionario.add(funcionario);
    }

    public void adicionaLivro(Livro livro){
        ListaLivro.add(livro);
    }

    public void adicionaNotificacaoEmail(NotificacaoEmail notificacaoEmail){
        ListaNotificacaoEmail.add(notificacaoEmail);
    }

    public void adicionaQuestionario(Questionario questionario){
        ListaQuestionario.add(questionario);
    }

    public void adicionaTipoEnvio(TipoEnvio tipoEnvio){
        ListaTipoEnvio.add(tipoEnvio);
    }

    public void adicionaTipoNotificacaoEmail(TipoNotificacaoEmail tipoNotificacaoEmail){
        ListaTipoNotificacaoEmail.add(tipoNotificacaoEmail);
    }

    public void adicionaTransportadora(Transportadora transportadora){
        ListaTransportadora.add(transportadora);
    }

    public void adicionaUtilizador(Utilizador utilizador){
        ListaUtilizador.add(utilizador);
    }

    public void adicionaVoucher(Voucher voucher){
        ListaVoucher.add(voucher);
    }
}
