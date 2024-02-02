package com.products.crud.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity //determina que esta classe é uma representação de uma entidade dentro do banco de dados
@Table(name="tb_products") //informa o nome da tabela que será criada dentro do banco de dados
public class ProductModel {
    @Id //determina que o atributo abaixo representa a primary key da tabela citada acima
    @GeneratedValue(strategy = GenerationType.AUTO) //informa qual a forma que o id será criado dentro do bd
    private UUID idProduct; //atributo que é o responsavel por armazenar o id
    //demais atributos
    private String name;
    private BigDecimal value;

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
