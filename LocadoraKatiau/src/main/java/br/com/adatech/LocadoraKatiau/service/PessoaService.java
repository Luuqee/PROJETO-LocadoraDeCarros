package br.com.adatech.LocadoraKatiau.service;

import br.com.adatech.LocadoraKatiau.model.Pessoa;
import br.com.adatech.LocadoraKatiau.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa consultarPessoaPorCpf(String cpf) {
        return pessoaRepository.findByCpf(cpf);
    }
}