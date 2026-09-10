package com.javanauta.agendadortarefas.infrastructure.client;

import com.javanauta.agendadortarefas.business.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "usuario", url = "${usuario.url}") // local para armazenar url e adicionar na properties
public interface UsuarioClient {

    //Apontar para a uri que vai trazer os dados do usuario
    @GetMapping
    // anotacao metodo get
    UsuarioDTO buscaUsuarioPorEmail(@RequestParam("email") String email,
                                    @RequestHeader("Authorization") String token);

}
