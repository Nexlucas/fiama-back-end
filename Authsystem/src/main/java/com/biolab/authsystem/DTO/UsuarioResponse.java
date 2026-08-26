package com.biolab.authsystem.DTO;

import java.time.LocalDate;

public class UsuarioResponse {
    private long id;
    private String nome;
    private String email;
    private LocalDate dtCriacao;

    public UsuarioResponse() {
    }

    public UsuarioResponse(String nome, String email, LocalDate dtCriacao) {
        this.nome = nome;
        this.email = email;
        this.dtCriacao = dtCriacao;
    }

    public UsuarioResponse(long id, String nome, String email, LocalDate dtCriacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dtCriacao = dtCriacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }
}
