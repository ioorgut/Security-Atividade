package com.example.demo.models;

import com.example.demo.enums.StatusProduto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PRODUTO")
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private StatusProduto status;

}
