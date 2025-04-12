package com.projeto.backend.CONTROLLER;

import com.projeto.backend.DTO.PessoaDTO;
import com.projeto.backend.MODEL.Pessoa;
import com.projeto.backend.REPOSITORY.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("/criar")
    public Pessoa criarPessoa (@RequestBody PessoaDTO dto){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(dto.getNome());
        pessoa.setCpf(dto.getCpf());
        pessoa.setIdade(dto.getIdade());
        return pessoaRepository.save(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa buscarPessoa(@PathVariable Long id){
        return pessoaRepository.findById(id).orElse(null);
    }

}

