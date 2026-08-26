package com.biolab.authsystem.Controllers;

import com.biolab.authsystem.DTO.LoginDTO;
import com.biolab.authsystem.Services.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<?> logar(@RequestBody LoginDTO dto){
        return ResponseEntity.ok(loginService.login(dto));
    }

}
