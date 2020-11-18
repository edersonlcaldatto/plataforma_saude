package br.com.animati.service;

import br.com.animati.entity.Atendimento;

import java.util.List;

public interface AtendimentoService {

    public void cadastrar(Atendimento atendimento);

    public void editar(Atendimento atendimento);

    public void deletar(long IdAtendimento) throws Exception;

    public List<Atendimento> listar();

    public Atendimento findById(long IdAtendimento);

    public void limparLista();
}
