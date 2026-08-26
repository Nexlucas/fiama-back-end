package com.biolab.authsystem.Services;

import com.biolab.authsystem.DTO.LoginDTO;
import com.biolab.authsystem.Entities.Usuario;
import com.biolab.authsystem.Repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final UsuarioRepository usuarioRepository;

    public LoginService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public String login(LoginDTO loginDTO){
        Usuario usuario = usuarioRepository.findByEmail(loginDTO.getEmail());

        if(usuario == null){
            return "Usuario não cadastrado";
        }
        if(usuario.getSenha().equals(loginDTO.getSenha())){
            return "Acesso liberado";
        }

        return "Senha ou e-mail incorretos";
    }
}
