package br.com.animati.entity;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Medico {

    @Generated
    private long idMedico;
    private String nome;
    private String Uf;
    private String crm;

}
