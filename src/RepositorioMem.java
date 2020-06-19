public class RepositorioMem implements Repositorio {

    public RepositorioMem(){

    }


    public void adicionaEncomenda(Encomenda encomenda){
        ListaEncomenda.add(encomenda);
    }

    public Encomenda devolveEncomenda(int id){
        for(Encomenda e: ListaEncomenda){
            if(e.getId() == id)
                return e;
        }
        return null;
    }

    public void adicionaItensEncomenda(ItensEncomenda itensEncomenda){
        ListaItensEncomenda.add(itensEncomenda);
    }

    public ItensEncomenda devolveItensEncomenda(int id){
        for(ItensEncomenda ie: ListaItensEncomenda){
            if(ie.getId() == id)
                return ie;
        }
        return null;
    }

    public void adicionaEntrega(Entrega entrega){
        ListaEntrega.add(entrega);
    }

    public Entrega devolveEntrega(int id){
        for(Entrega e: ListaEntrega){
            if(e.getId() == id)
                return e;
        }
        return null;
    }

    public void adicionaEnvio(Envio envio){
        ListaEnvio.add(envio);
    }

    public Envio devolveEnvio(int NumEnv){
        for(Envio e: ListaEnvio){
            if(e.getNumEnv() == NumEnv)
                return e;
        }
        return null;
    }

    public void adicionaEstadoEncomenda(EstadoEncomenda estadoEncomenda){
        ListaEstadoEncomenda.add(estadoEncomenda);
    }

    public EstadoEncomenda devolveEstadoEncomenda(int IdEstado){
        for(EstadoEncomenda ee: ListaEstadoEncomenda){
            if(ee.getIdEstado() == IdEstado)
                return ee;
        }
        return null;
    }

    public void adicionaFactura(Factura factura){
        ListaFactura.add(factura);
    }

    public Factura devolveFactura(String codFact){
        for(Factura f: ListaFactura){
            if(f.getCodFact().equals(codFact))
                return f;
        }
        return null;
    }

    public void adicionaFuncionario(Funcionario funcionario){
        ListaFuncionario.add(funcionario);
    }

    public Funcionario devolveFuncionario(String CodFunc){
        for(Funcionario f: ListaFuncionario){
            if(f.getCodFunc().equals(CodFunc))
                return f;
        }
        return null;
    }

    public void adicionaLivro(Livro livro){
        ListaLivro.add(livro);
    }

    public Livro devolveLivro(String ISBN){
        for(Livro l: ListaLivro){
            if(l.getISBN().equals(ISBN))
                return l;
        }
        return null;
    }

    public void adicionaNotificacaoEmail(NotificacaoEmail notificacaoEmail){
        ListaNotificacaoEmail.add(notificacaoEmail);
    }

    public NotificacaoEmail devolveNotificacaoEmail(int codigoNot){
        for(NotificacaoEmail ne: ListaNotificacaoEmail){
            if(ne.getCodigoNot() == codigoNot)
                return ne;
        }
        return null;
    }

    public void adicionaQuestionario(Questionario questionario){
        ListaQuestionario.add(questionario);
    }

    public Questionario devolveQuestionario(int Id){
        for(Questionario q: ListaQuestionario){
            if(q.getId() == Id)
                return q;
        }
        return null;
    }

    public void adicionaTipoEnvio(TipoEnvio tipoEnvio){
        ListaTipoEnvio.add(tipoEnvio);
    }

    public TipoEnvio devolveTipoEnvio(int TipoEnvio){
        for(TipoEnvio te: ListaTipoEnvio){
            if(te.getTipoEnvio() == TipoEnvio)
                return te;
        }
        return null;
    }

    public void adicionaTipoNotificacaoEmail(TipoNotificacaoEmail tipoNotificacaoEmail){
        ListaTipoNotificacaoEmail.add(tipoNotificacaoEmail);
    }

    public TipoNotificacaoEmail devolveTipoNotificacaoEmail(String CodigoTipo){
        for(TipoNotificacaoEmail tne: ListaTipoNotificacaoEmail){
            if(tne.getCodigoTipo().equals(CodigoTipo))
                return tne;
        }
        return null;
    }

    public void adicionaTransportadora(Transportadora transportadora){
        ListaTransportadora.add(transportadora);
    }

    public Transportadora devolveTransportadora(int IdTransp){
        for(Transportadora t: ListaTransportadora){
            if(t.getIdTransp() == IdTransp)
                return t;
        }
        return null;
    }

    public void adicionaUtilizador(Utilizador utilizador){
        ListaUtilizador.add(utilizador);
    }

    public Utilizador devolveUtilizador(int Id){
        for(Utilizador u: ListaUtilizador){
            if(u.getId() == Id)
                return u;
        }
        return null;
    }

    public void adicionaVoucher(Voucher voucher){
        ListaVoucher.add(voucher);
    }

    public Voucher devolveVoucher(int Id){
        for(Voucher v: ListaVoucher){
            if(v.getId() == Id)
                return v;
        }
        return null;
    }
}
