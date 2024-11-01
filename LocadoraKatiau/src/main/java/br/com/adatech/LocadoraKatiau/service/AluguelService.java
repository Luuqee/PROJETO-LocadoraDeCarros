package br.com.adatech.LocadoraKatiau.service;

import br.com.adatech.LocadoraKatiau.model.Aluguel;
import br.com.adatech.LocadoraKatiau.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel criarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Aluguel finalizarAluguel(Long id, LocalDate dataConclusao) {
        Aluguel aluguel = aluguelRepository.findById(id).orElseThrow();
        aluguel.setDataConclusao(dataConclusao);
        return aluguelRepository.save(aluguel);
    }
}