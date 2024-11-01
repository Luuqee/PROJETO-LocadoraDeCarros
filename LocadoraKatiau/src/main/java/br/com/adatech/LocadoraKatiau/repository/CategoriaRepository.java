package br.com.adatech.LocadoraKatiau.repository;

import br.com.adatech.LocadoraKatiau.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}