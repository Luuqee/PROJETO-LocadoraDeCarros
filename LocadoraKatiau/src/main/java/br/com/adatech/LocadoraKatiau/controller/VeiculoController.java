package br.com.adatech.LocadoraKatiau.controller;

import br.com.adatech.LocadoraKatiau.model.Veiculo;
import br.com.adatech.LocadoraKatiau.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoService.cadastrarVeiculo(veiculo);
    }

    @PutMapping("/{id}/quantidade-disponivel")
    public Veiculo atualizarQuantidadeDisponivel(@PathVariable Long id, @RequestParam int quantidadeDisponivel) {
        return veiculoService.atualizarQuantidadeDisponivel(id, quantidadeDisponivel);
    }
}