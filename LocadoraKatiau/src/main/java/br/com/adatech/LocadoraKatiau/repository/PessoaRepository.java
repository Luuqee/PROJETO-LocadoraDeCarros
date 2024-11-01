package br.com.adatech.LocadoraKatiau.repository;

import br.com.adatech.LocadoraKatiau.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByCpf(String cpf);
}