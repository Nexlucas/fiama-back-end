package com.biolab.authsystem.Controllers;

import com.biolab.authsystem.DTO.UsuarioRequest;
import com.biolab.authsystem.DTO.UsuarioResponse;
import com.biolab.authsystem.Services.UsuarioServices;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    private final UsuarioServices usuarioServices;
    public UsuarioController(UsuarioServices usuarioServices) {
        this.usuarioServices = usuarioServices;
    }

    @PostMapping
    public ResponseEntity<?> criarUsuario (@Valid @RequestBody UsuarioRequest req){
        return ResponseEntity.ok("criado com sucesso" + usuarioServices.criarUsuario(req));
    }
    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> mostrar(){
        return ResponseEntity.ok(usuarioServices.mostrarUsuario());
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> buscarID(@PathVariable Long id){
        return ResponseEntity.ok(usuarioServices.buscarID(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> apagarID(@PathVariable Long id){
        return ResponseEntity.ok(usuarioServices.deletar(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(@Valid @PathVariable long id, @RequestBody UsuarioRequest request){
        return ResponseEntity.ok(usuarioServices.alterar(id,request));
    }

}
