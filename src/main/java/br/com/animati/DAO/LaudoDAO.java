package br.com.animati.DAO;

import br.com.animati.entity.Laudo;

import java.util.List;

public interface LaudoDAO {

    public void cadastrar(Laudo laudo);

    public void editar(Laudo laudo);

    public void deletar(long IdLaudo) throws Exception;

    public List<Laudo> listar();

    public Laudo findById(long IdLaudo);

    public void limparLista();

}
