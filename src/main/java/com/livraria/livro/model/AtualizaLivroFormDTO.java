package com.livraria.livro.model;

import com.livraria.livro.entity.Livro;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

@AllArgsConstructor
public class AtualizaLivroFormDTO {
    private String categoria;
    private String modelo;

    public AtualizaLivroFormDTO(Livro livro) {
        livro.setCategoria(Livro.Categoria.valueOf(categoria));
        livro.setModelo(Livro.Modelo.valueOf(modelo));
    }
}
