package br.com.animati;

import br.com.animati.entity.Medico;
import br.com.animati.service.MedicoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedicoServiceImplTest {

    private MedicoServiceImpl medicoService;


    @Before
    public void init() {
        medicoService = new MedicoServiceImpl();
    }

    @Test
    public void cadastrar() {
        Medico medico1 = new Medico();
        medico1.setIdMedico(1);
        medico1.setNome("Joao");
        medico1.setCrm("787878");
        medico1.setUf("PR");

        this.medicoService.cadastrar(medico1);

        Assert.assertEquals(1, medicoService.listar().size());
    }

    @Test
    public void editar() {

        Medico medico1 = new Medico();
        medico1.setIdMedico(1);
        medico1.setNome("Joao");
        medico1.setCrm("787878");
        medico1.setUf("PR");

        Medico medico2 = new Medico();
        medico2.setIdMedico(2);
        medico2.setNome("Pedro");
        medico2.setCrm("9999999");
        medico2.setUf("SC");

        this.medicoService.cadastrar(medico1);
        this.medicoService.cadastrar(medico2);

        String nomeNovo = "Pedro 2";
        medico2.setNome(nomeNovo);

        this.medicoService.editar(medico2);

        Assert.assertTrue(this.medicoService.findById(2).getNome() == nomeNovo);

    }

    @Test
    public void deletar() {

        Medico medico1 = new Medico();
        medico1.setIdMedico(1);
        medico1.setNome("Joao");
        medico1.setCrm("787878");
        medico1.setUf("PR");

        this.medicoService.cadastrar(medico1);
        try {
            this.medicoService.deletar(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(this.medicoService.listar().isEmpty());

    }

    @Test
    public void listar() {
        for (int i = 1; i <= 5; i++) {
            this.medicoService.cadastrar(new Medico(i, "Medico" + i, "PR", "123" + i));
        }
        Assert.assertEquals(5, this.medicoService.listar().size());
    }

}
