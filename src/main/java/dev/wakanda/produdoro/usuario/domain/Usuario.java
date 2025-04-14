package dev.wakanda.produdoro.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "usuario")
public class Usuario {
    private String IdUsuario;
    private String senha;
    private ConfiguraçaoUsuario configuraçao;
    private StatusUsuario status;
}
