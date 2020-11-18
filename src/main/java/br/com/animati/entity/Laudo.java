package br.com.animati.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Laudo {

    private long idLaudo;
    private String texto;
    private Medico medico;
    private Atendimento atendimento;

}
