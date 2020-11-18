package br.com.animati.DAO;

import br.com.animati.entity.Medico;

import java.util.ArrayList;
import java.util.List;


public class MedicoDAOImpl implements MedicoDAO {

    private List<Medico> medicoList;

    public MedicoDAOImpl() {
        this.medicoList = new ArrayList<Medico>();
    }

    @Override
    public void cadastrar(Medico medico) {
        medicoList.add(medico);
    }

    @Override
    public void editar(Medico medico) {
        int idx = medicoList.indexOf(medico);
        if (idx >= 0){
            medicoList.set(idx, medico);
        }
    }

    @Override
    public void deletar(long IdMedico) throws Exception {
        try {
            Medico medico = findById(IdMedico);
            medicoList.remove(medico);
        } catch (Exception e){
            throw new Exception("Médico não localizado");
        }
    }

    @Override
    public List<Medico> listar() {
        return medicoList;
    }

    @Override
    public Medico findById(long IdMedico) {
        for(Medico medico : medicoList){
            if (medico.getIdMedico() == IdMedico){
                return medico;
            }
        }
        return null;
    }

    @Override
    public void limparLista() {
        medicoList.clear();
    }
}
