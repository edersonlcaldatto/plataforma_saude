package br.com.animati.DAO;

import br.com.animati.entity.Atendimento;

import java.util.List;

public interface AtendimentoDAO  {

    public void cadastrar(Atendimento atendimento);

    public void editar(Atendimento atendimento);

    public void deletar(long IdAtendimento) throws Exception;

    public List<Atendimento> listar();

    public Atendimento findById(long IdAtendimento);

    public void limparLista();
}
