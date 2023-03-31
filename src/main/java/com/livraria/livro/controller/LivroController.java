package com.livraria.livro.controller;

import com.livraria.livro.entity.Livro;
import com.livraria.livro.repository.LivroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    public LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listar() {
        List<Livro> livros = livroRepository.findAll();
        return livros;
    }

    @PostMapping
    @Transactional
    public List<Livro> salvar(@RequestBody Livro livro) {
        livroRepository.save(livro);
        return Arrays.asList(livro);
    }

    @DeleteMapping({"{isbn}"})
    @Transactional
    public String deletar(@PathVariable Long isbn){
        final Optional<Livro> optLivro = livroRepository.findById(isbn);
        if (optLivro.isPresent()) {
            livroRepository.deleteById(isbn);
            return "Foi deletado livro com isbn:" + isbn;
        }
        return "Não foi encotrado o livro com isbn:" + isbn;
    }
}
