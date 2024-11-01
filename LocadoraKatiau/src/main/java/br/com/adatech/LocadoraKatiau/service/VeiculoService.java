package br.com.adatech.LocadoraKatiau.service;

import br.com.adatech.LocadoraKatiau.model.Veiculo;
import br.com.adatech.LocadoraKatiau.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo atualizarQuantidadeDisponivel(Long id, int quantidadeDisponivel) {
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow();
        veiculo.setQuantidadeDisponivel(quantidadeDisponivel);
        return veiculoRepository.save(veiculo);
    }
}