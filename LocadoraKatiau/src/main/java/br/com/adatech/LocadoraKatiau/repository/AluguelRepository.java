package br.com.adatech.LocadoraKatiau.repository;

import br.com.adatech.LocadoraKatiau.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}