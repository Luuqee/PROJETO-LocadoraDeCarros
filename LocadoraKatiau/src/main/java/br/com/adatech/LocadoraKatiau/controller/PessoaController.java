package br.com.adatech.LocadoraKatiau.controller;

import br.com.adatech.LocadoraKatiau.model.Pessoa;
import br.com.adatech.LocadoraKatiau.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.cadastrarPessoa(pessoa);
    }

    @GetMapping("/{cpf}")
    public Pessoa consultarPessoaPorCpf(@PathVariable String cpf) {
        return pessoaService.consultarPessoaPorCpf(cpf);
    }
}