package com.livraria.livro.model;

import com.livraria.livro.entity.Livro;
import lombok.Data;

@Data
public class LivroDTO {
    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;

    public LivroDTO(Livro livro) {
       this.isbn= livro.getIsbn();
    }
}
