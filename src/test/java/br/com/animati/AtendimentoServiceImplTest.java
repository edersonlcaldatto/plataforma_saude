package br.com.animati;

import br.com.animati.entity.Atendimento;
import br.com.animati.entity.Medico;
import br.com.animati.service.AtendimentoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class AtendimentoServiceImplTest {

    private AtendimentoServiceImpl atendimentoService;


    @Before
    public void init() {
        atendimentoService = new AtendimentoServiceImpl();
    }

    @Test
    public void cadastrar() {
        Medico medico1 = new Medico();
        medico1.setIdMedico(1);
        medico1.setNome("Joao");
        medico1.setCrm("787878");
        medico1.setUf("PR");

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(1);
        atendimento.setDataHora(new Date());
        atendimento.setModalidade("Nao sei o que é");
        atendimento.setNomeProcedimento("Mamografia");
        atendimento.setMedico(medico1);

        this.atendimentoService.cadastrar(atendimento);

        Assert.assertEquals(1, atendimentoService.listar().size());
    }

    @Test
    public void editar() {

        Medico medico1 = new Medico();
        medico1.setIdMedico(1);
        medico1.setNome("Joao");
        medico1.setCrm("787878");
        medico1.setUf("PR");

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(1);
        atendimento.setDataHora(new Date());
        atendimento.setModalidade("Nao sei o que é");
        atendimento.setNomeProcedimento("Mamografia");
        atendimento.setMedico(medico1);

        this.atendimentoService.cadastrar(atendimento);

        String nomeProcedimento = "Radiografica";
        atendimento.setNomeProcedimento(nomeProcedimento);
        atendimentoService.editar(atendimento);

        Assert.assertTrue(this.atendimentoService.findById(1).getNomeProcedimento() == nomeProcedimento);

    }

    @Test
    public void deletar() {

        Medico medico1 = new Medico();
        medico1.setIdMedico(1);
        medico1.setNome("Joao");
        medico1.setCrm("787878");
        medico1.setUf("PR");

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(1);
        atendimento.setDataHora(new Date());
        atendimento.setModalidade("Nao sei o que é");
        atendimento.setNomeProcedimento("Mamografia");
        atendimento.setMedico(medico1);

        this.atendimentoService.cadastrar(atendimento);
        try {
            this.atendimentoService.deletar(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(this.atendimentoService.listar().isEmpty());

    }

    @Test
    public void listar() {
        for (int i = 1; i <= 5; i++) {
            this.atendimentoService.cadastrar(new Atendimento(i,new Date(),"Mamografia","SUS",null));
        }
        Assert.assertEquals(5, this.atendimentoService.listar().size());
    }
    
}
