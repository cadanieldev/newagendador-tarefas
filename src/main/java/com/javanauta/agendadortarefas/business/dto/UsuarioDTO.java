package com.javanauta.agendadortarefas.business.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder // ajuda a conversao dos dados

public class UsuarioDTO {


    //Não expor dados e transformar em entidades

    private String email;
    private String senha;


}
