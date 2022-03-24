package br.com.letscode.lojaletscode.domain;

import javax.persistence.*;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ds_nome")
    private String nome;

    @Embedded
    private Categoria categoria;

    private Long quantidadeEstoque;

    private BigDecimal preço;

//    private Venda venda;
}
