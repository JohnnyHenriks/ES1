import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Utilizador utilizador = new Utilizador(1, "Ruberto", "Rua do Ruberto nº123", "Ruberto@email.como", 542178354);
        Funcionario funcionario = new Funcionario("1", "José", "Rua do José", "921546387", 314785214, "Jose@email.com");
        Livro livro = new Livro("Programação em Java", "Pedro Coelho", "FCA", 2016, "9789727228409" );
        Voucher voucher = new Voucher(1, "s5gfd89ds", "20% desconto");
        EstadoEncomenda estadoEncomenda = new EstadoEncomenda(1, "Submetida");
        Encomenda encomenda = new Encomenda(1, LocalDate.now(), estadoEncomenda, utilizador, funcionario, voucher, null);
        ItensEncomenda itensEncomenda = new ItensEncomenda(1, 1, encomenda, livro);
        TipoNotificacaoEmail tipoNotificacaoEmail = new TipoNotificacaoEmail("1", "Email");
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail(1, LocalDate.now(), utilizador.getEmail(),
                "Confirmada a receção da encomenda, data prevista de entrega: ..., link para acompanhamento: ...",
                encomenda, tipoNotificacaoEmail ,null);
        RepositorioMem repositorio = new RepositorioMem();
        repositorio.adicionaEncomenda(encomenda);
        repositorio.adicionaItensEncomenda(itensEncomenda);
        repositorio.adicionaNotificacaoEmail(notificacaoEmail);
    }
}
