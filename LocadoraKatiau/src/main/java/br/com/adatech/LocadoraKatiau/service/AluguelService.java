package br.com.adatech.LocadoraKatiau.service;

import br.com.adatech.LocadoraKatiau.model.Aluguel;
import br.com.adatech.LocadoraKatiau.model.Veiculo;
import br.com.adatech.LocadoraKatiau.repository.AluguelRepository;
import br.com.adatech.LocadoraKatiau.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Aluguel criarAluguel(Aluguel aluguel) {
        Veiculo veiculo = veiculoRepository.findById(aluguel.getVeiculo().getId()).orElseThrow();
        double valor = veiculo.getCategoria().getPreco();
        return aluguelRepository.save(aluguel);
    }

    public Aluguel finalizarAluguel(Long id, LocalDate dataConclusao) {
        Aluguel aluguel = aluguelRepository.findById(id).orElseThrow();
        aluguel.setDataConclusao(dataConclusao);
        return aluguelRepository.save(aluguel);
    }
}