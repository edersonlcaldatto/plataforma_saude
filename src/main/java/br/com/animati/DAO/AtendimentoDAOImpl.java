package br.com.animati.DAO;

import br.com.animati.entity.Atendimento;

import java.util.ArrayList;
import java.util.List;

public class AtendimentoDAOImpl implements AtendimentoDAO {

    private List<Atendimento> atendimentoList;

    public AtendimentoDAOImpl() {
        atendimentoList = new ArrayList<Atendimento>();
    }

    @Override
    public void cadastrar(Atendimento atendimento) {
        atendimentoList.add(atendimento);
    }

    @Override
    public void editar(Atendimento atendimento) {
        int idx = atendimentoList.indexOf(atendimento);
        if (idx >= 0) {
            atendimentoList.set(idx, atendimento);
        }
    }

    @Override
    public void deletar(long IdAtendimento) throws Exception {
        try {
            Atendimento atendimento = findById(IdAtendimento);
            atendimentoList.remove(atendimento);
        } catch (Exception e) {
            throw new Exception("Atendimento não localizado");
        }

    }

    @Override
    public List<Atendimento> listar() {

        return atendimentoList;
    }

    @Override
    public Atendimento findById(long IdAtendimento) {
        for (Atendimento atendimento : atendimentoList) {
            if (atendimento.getIdAtendimento() == IdAtendimento) {
                return atendimento;
            }
        }
        return null;
    }

    @Override
    public void limparLista() {
        atendimentoList.clear();
        ;

    }
}
