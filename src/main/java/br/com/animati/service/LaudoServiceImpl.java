package br.com.animati.service;

import br.com.animati.DAO.LaudoDAO;
import br.com.animati.DAO.LaudoDAOImpl;
import br.com.animati.entity.Laudo;

import java.util.List;

public class LaudoServiceImpl implements LaudoService {

    private LaudoDAO laudoDAO;

    public LaudoServiceImpl() {
        this.laudoDAO = new LaudoDAOImpl();
    }

    @Override
    public void cadastrar(Laudo laudo) {
        laudoDAO.cadastrar(laudo);
    }

    @Override
    public void editar(Laudo laudo) {
        laudoDAO.editar(laudo);
    }

    @Override
    public void deletar(long idLaudo) throws Exception {
        laudoDAO.deletar(idLaudo);
    }

    @Override
    public List<Laudo> listar() {
        return laudoDAO.listar();
    }

    @Override
    public Laudo findById(long IdLaudo) {
        return laudoDAO.findById(IdLaudo);
    }

    @Override
    public void limparLista() {
        laudoDAO.limparLista();
    }    
}
