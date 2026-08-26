package com.biolab.authsystem.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UsuarioRequest {

    @NotNull
    private String nome;
    @Email
    private String email;
    @Size(min = 6,max = 20, message = "Senha não atende aos requisitos")
    private String senha;
    private LocalDate dtCriacao;

    public UsuarioRequest() {
    }

    public UsuarioRequest(String nome, String email, String senha, LocalDate dtCriacao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dtCriacao = dtCriacao;
    }

    public UsuarioRequest(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }
}
