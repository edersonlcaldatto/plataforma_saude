package br.com.animati.service;

import br.com.animati.DAO.MedicoDAO;
import br.com.animati.DAO.MedicoDAOImpl;
import br.com.animati.entity.Medico;

import java.util.List;

public class MedicoServiceImpl implements MedicoService {

    private MedicoDAO medicoDAO;

    public MedicoServiceImpl() {
        this.medicoDAO = new MedicoDAOImpl();
    }

    @Override
    public void cadastrar(Medico Medico) {
        medicoDAO.cadastrar(Medico);
    }

    @Override
    public void editar(Medico Medico) {
        medicoDAO.editar(Medico);
    }

    @Override
    public void deletar(long idMedico) throws Exception {
        medicoDAO.deletar(idMedico);
    }

    @Override
    public List<Medico> listar() {
        return medicoDAO.listar();
    }

    @Override
    public Medico findById(long IdMedico) {
        return medicoDAO.findById(IdMedico);
    }

    @Override
    public void limparLista() {
        medicoDAO.limparLista();
    }
}
