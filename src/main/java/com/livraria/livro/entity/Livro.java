package com.livraria.livro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    public enum Categoria {
        ADMINISTRACAO, MEDICINA, INFORMATICA, MATEMATICA, ECONOMIA
    }
    public enum Modelo {
        FISICO, EBOOK
    }


    @Id
    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;
    private Categoria categoria;
    private Modelo modelo;
}
