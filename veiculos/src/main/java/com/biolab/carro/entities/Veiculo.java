package com.biolab.carro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

//entidade do banco//

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String modelo;
    private String marca;
    private String tipo;
    private String ano;
    private Double valor;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, String tipo, String ano, Double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.ano = ano;
        this.valor = valor;
    }


    public Veiculo(long id, String modelo, String marca, String tipo, String ano, Double valor) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
