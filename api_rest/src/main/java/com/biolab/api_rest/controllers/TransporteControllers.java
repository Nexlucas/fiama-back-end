package com.biolab.api_rest.controllers;

import org.springframework.web.bind.annotation.*;
import com.biolab.api_rest.entities.Transporte;
import com.biolab.api_rest.repositories.Transportrepository;

import java.util.List;

@RestController
@RequestMapping
public class TransporteControllers {
    private final Transportrepository transportrepository;


    public TransporteControllers(Transportrepository transportrepository) {
        this.transportrepository = transportrepository;
    }

    @PostMapping
    public String criarTrasport(@RequestBody Transporte transporte){
        Transporte t = new Transporte(transporte.getNome(),transporte.getTipo(),transporte.getCapacidade(),transporte.getValor());
        transportrepository.save(t);
        return "Sucesso" ;
    }

    @GetMapping
    public List<Transporte> mostrarTransporte(){
        List<Transporte> listaTransporte = transportrepository.findAll();
        return listaTransporte;
    }

    @DeleteMapping(value ="/{id}")
    public String deletarTransporte(@PathVariable long id){
        Transporte transporte = transportrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transporte não encontrado"));
        transportrepository.deleteById(transporte.getId());
        return "Transporte excluido com sucesso!";
    }

    @PutMapping(value = "/{id}")
    public Transporte alterarTransporte(@PathVariable long id, @RequestBody Transporte tAtualizado) {
        Transporte transporte = transportrepository.findById(id).orElseThrow(() -> new RuntimeException("Transporte Não Encontrado"));
        transporte.setNome(tAtualizado.getNome());
        transporte.setCapacidade(tAtualizado.getCapacidade());
        transporte.setValor(tAtualizado.getValor());
        return transportrepository.save(transporte);
    }



}
