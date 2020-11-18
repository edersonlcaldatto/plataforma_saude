package br.com.animati.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Atendimento {
    private long IdAtendimento;
    private Date dataHora;
    private String nomeProcedimento;
    private String modalidade;
    private Medico medico;

}
