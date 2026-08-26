package com.biolab.carro.controllers;

import com.biolab.carro.DTO.VeiculoRequest;
import com.biolab.carro.services.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controler aqui basicamente controla como adicionar um veiculo ou remove-lo//

@RestController
@RequestMapping("veiculo")
public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    //com o adicionarCarro eu
    @PostMapping
    public ResponseEntity<?> adicionarVeiculo (@RequestBody VeiculoRequest req){
        return ResponseEntity.ok("Adicionado com sucesso" + veiculoService.adicionarVeiculo(req));
    }

    //
    @GetMapping
    public ResponseEntity<List<VeiculoRequest>>mostrar(){
        return ResponseEntity.ok(veiculoService.mostrarVeiculos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoRequest> veiculoID(@PathVariable Long id){
        return ResponseEntity.ok(veiculoService.veiculoID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>deletar(@PathVariable long id){
        return ResponseEntity.ok(veiculoService.deletarID(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>alterar(@PathVariable long id,@RequestBody VeiculoRequest request){
        return ResponseEntity.ok(veiculoService.alterarVeiculo(id,request));
    }


}
