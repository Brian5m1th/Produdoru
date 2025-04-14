package dev.wakanda.produdoro.usuario;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter
public class ConfiguraçaoUsuario {

    private int tempoFoco;
    private int tempoPausaCurto;
    private int tempoPausaLonga;
    private int repetiçoesPausaLonga;
}
