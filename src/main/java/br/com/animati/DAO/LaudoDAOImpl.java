package br.com.animati.DAO;

import br.com.animati.entity.Laudo;

import java.util.ArrayList;
import java.util.List;

public class LaudoDAOImpl implements LaudoDAO {

    private List<Laudo> LaudoList;

    public LaudoDAOImpl() {
        LaudoList = new ArrayList<Laudo>();
    }

    @Override
    public void cadastrar(Laudo Laudo) {
        LaudoList.add(Laudo);
    }

    @Override
    public void editar(Laudo Laudo) {
        int idx = LaudoList.indexOf(Laudo);
        if (idx >= 0){
            LaudoList.set(idx, Laudo);
        }
    }

    @Override
    public void deletar(long IdLaudo) throws Exception {
        try {
            Laudo Laudo = findById(IdLaudo);
            LaudoList.remove(Laudo);
        } catch (Exception e){
            throw new Exception("Laudo não localizado");
        }
    }

    @Override
    public List<Laudo> listar() {

        return LaudoList;
    }

    @Override
    public Laudo findById(long IdLaudo) {
        for(Laudo Laudo : LaudoList){
            if (Laudo.getIdLaudo() == IdLaudo){
                return Laudo;
            }
        }
        return null;
    }

    @Override
    public void limparLista() {
        LaudoList.clear();;

    }
}
