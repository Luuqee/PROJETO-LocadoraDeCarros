package br.com.adatech.LocadoraKatiau.service;

import br.com.adatech.LocadoraKatiau.model.Categoria;
import br.com.adatech.LocadoraKatiau.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}