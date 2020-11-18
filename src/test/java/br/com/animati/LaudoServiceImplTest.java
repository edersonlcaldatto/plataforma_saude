package br.com.animati;

import br.com.animati.entity.Atendimento;
import br.com.animati.entity.Laudo;
import br.com.animati.entity.Medico;
import br.com.animati.service.LaudoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class LaudoServiceImplTest {

    private LaudoServiceImpl laudoService;


    @Before
    public void init() {
        laudoService = new LaudoServiceImpl();
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

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(1);
        laudo.setTexto("Tudo certo");
        laudo.setAtendimento(atendimento);
        laudo.setMedico(medico1);

        this.laudoService.cadastrar(laudo);

        Assert.assertEquals(1, laudoService.listar().size());
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

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(1);
        laudo.setTexto("Tudo certo");
        laudo.setAtendimento(atendimento);
        laudo.setMedico(medico1);

        this.laudoService.cadastrar(laudo);

        String texto = "Novo texto";
        laudo.setTexto(texto);
        laudoService.editar(laudo);

        Assert.assertTrue(this.laudoService.findById(2).getTexto() == texto);

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

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(1);
        laudo.setTexto("Tudo certo");
        laudo.setAtendimento(atendimento);
        laudo.setMedico(medico1);

        this.laudoService.cadastrar(laudo);
        try {
            this.laudoService.deletar(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(this.laudoService.listar().isEmpty());

    }

    @Test
    public void listar() {
        for (int i = 1; i <= 5; i++) {
            this.laudoService.cadastrar(new Laudo(i,"Valor de I = "+ i,null,null));
        }
        Assert.assertEquals(5, this.laudoService.listar().size());
    }

}
