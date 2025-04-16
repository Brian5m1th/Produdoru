package dev.wakanda.produdoro.usuario.application.api;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@Getter

public class UsuarioController extends UsuarioAPI {

    public UsuarioCriadoRespose PostUsuario(UsuarioNovoRequest UsuarioNovo) {
        log.info("[start] UsuarioController - PostUsuario");
        return null;
    }
}
