package com.patrickramosruas.pokedex.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Pokemon {

    @Id
    private String id;

    private String nome;

    private String categoria;

    private String habilidade;

    private Double peso;

}
