package br.com.adatech.LocadoraKatiau.controller;

import br.com.adatech.LocadoraKatiau.model.Aluguel;
import br.com.adatech.LocadoraKatiau.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    @Autowired
    private AluguelService aluguelService;

    @PostMapping
    public Aluguel criarAluguel(@RequestBody Aluguel aluguel) {
        return aluguelService.criarAluguel(aluguel);
    }

    @PutMapping("/{id}/finalizar")
    public Aluguel finalizarAluguel(@PathVariable Long id, @RequestParam LocalDate dataConclusao) {
        return aluguelService.finalizarAluguel(id, dataConclusao);
    }
}