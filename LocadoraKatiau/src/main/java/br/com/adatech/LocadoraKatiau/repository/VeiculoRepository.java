package br.com.adatech.LocadoraKatiau.repository;

import br.com.adatech.LocadoraKatiau.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}