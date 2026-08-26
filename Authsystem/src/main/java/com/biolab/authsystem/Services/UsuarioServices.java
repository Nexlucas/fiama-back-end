package com.biolab.authsystem.Services;

import com.biolab.authsystem.DTO.UsuarioRequest;
import com.biolab.authsystem.DTO.UsuarioResponse;
import com.biolab.authsystem.Entities.Usuario;
import com.biolab.authsystem.Repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class UsuarioServices {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(UsuarioRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());
        usuario.setDtCriacao(LocalDate.now());
        usuarioRepository.save(usuario);
        return usuario;
    }public List<UsuarioResponse> mostrarUsuario(){
            return usuarioRepository.findAll().stream()
                    .map(usuario -> new UsuarioResponse(
                            usuario.getId(), usuario.getEmail(),
                            usuario.getNome(), usuario.getDtCriacao()))
                    .toList();
    }

    public UsuarioResponse buscarID(long id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        usuarioResponse.setNome(usuario.get().getNome());
        usuarioResponse.setId(usuario.get().getId());
        usuarioResponse.setEmail(usuario.get().getEmail());
        return usuarioResponse;
    }
    public String deletar(long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario == null){
            return "Usuário nao existe";
        }else {
            usuarioRepository.deleteById(id);
            return "Usuário DELETADO F";
        }
    }

    public String alterar(long id,UsuarioRequest request) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());

        usuarioRepository.save(usuario);
        return "alterado pai 😎👌";


    }

}
