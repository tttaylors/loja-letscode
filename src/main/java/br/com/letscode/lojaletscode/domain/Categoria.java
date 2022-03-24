package br.com.letscode.lojaletscode.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Categoria {

    @Column(name = "cat_tipo")
    private String tipo;
}
