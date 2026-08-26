package com.biolab.carro.DTO;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class VeiculoRequest {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    private String modelo;
    private String tipo;
    private String marca;
    private String ano;
    private Double valor;

    public VeiculoRequest() {
    }

    public VeiculoRequest(String modelo, String tipo, String marca, String ano, Double valor) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public VeiculoRequest(long id, String modelo, String tipo, String marca, String ano, Double valor) {
        this.id = id;
        this.modelo = modelo;
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
