package dev.wakanda.projeto.domain;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Projeto")
public class Projeto {
    @Id
    private UUID idProjeto;
    private String nome;
    private String descricao;
    private UUID idUsuario;
    private UUID idArea;
}