package dev.wakanda.produdoro.pomodoro.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "ConfiguracaoPomodoroPadrao")
@Getter
public class ConfiguraçaoPomodoroPadrao {

    private static final String CODIGO_DEFAULT = "Default";
    @MongoId(targetType = FieldType.STRING)
    @Getter
    private String codigo;
    private int tempoFoco;
    private int tempoPausaCurto;
    private int tempoPausaLonga;
    private int repetiçoesPausaLonga;
}
