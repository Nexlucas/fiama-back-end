package com.biolab.copa.controllers;

import com.biolab.copa.entities.Selecao;
import com.biolab.copa.repositories.Selecaorepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SelecaoController {

    private final Selecaorepository selecaorepository;

    public SelecaoController(Selecaorepository selecaorepository) {
        this.selecaorepository = selecaorepository;
    }

    @PostMapping
    public String criarSelecao(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(),selecao.getUniforme(),selecao.getMascote());
        selecaorepository.save(s);
        return "Calvo com sucesso!!" ;
    }

    @PostMapping(value = "teste")
    public Selecao criarSelecao1(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(),selecao.getUniforme(),selecao.getMascote());
        selecaorepository.save(s);
        return s ;
    }


    @GetMapping(value = "teste")
    public List<Selecao> mostrarSelecao(){
        List<Selecao> listaSelecao = selecaorepository.findAll();
        return listaSelecao;
    }

    @DeleteMapping(value ="/{id}")
    public String deletarSelecao(@PathVariable long id){
        Selecao selecao = selecaorepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Seleção não encontrada"));
        selecaorepository.deleteById(selecao.getId());
        return "Seleção excluida com sucesso!!";
    }
}
