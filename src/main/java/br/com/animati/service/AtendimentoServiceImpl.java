package br.com.animati.service;

import br.com.animati.DAO.AtendimentoDAO;
import br.com.animati.DAO.AtendimentoDAOImpl;
import br.com.animati.entity.Atendimento;

import java.util.List;

public class AtendimentoServiceImpl implements  AtendimentoService {

    private AtendimentoDAO atendimentoDAO;

    public AtendimentoServiceImpl() {
        this.atendimentoDAO = new AtendimentoDAOImpl();
    }

    @Override
    public void cadastrar(Atendimento atendimento) {
        atendimentoDAO.cadastrar(atendimento);
    }

    @Override
    public void editar(Atendimento atendimento) {
        atendimentoDAO.editar(atendimento);
    }

    @Override
    public void deletar(long IdAtendimento) throws Exception {
        atendimentoDAO.deletar(IdAtendimento);
    }

    @Override
    public List<Atendimento> listar() {
        return atendimentoDAO.listar();
    }

    @Override
    public Atendimento findById(long IdAtendimento) {
        return atendimentoDAO.findById(IdAtendimento);
    }

    @Override
    public void limparLista() {
        atendimentoDAO.limparLista();
    }
}
