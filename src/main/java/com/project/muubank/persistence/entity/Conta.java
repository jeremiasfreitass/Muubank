package com.project.muubank.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Conta {
    @Id
    private String id ;

    private int numero;

    private double saldo;
    private String documentoDoTitular;

    private String nomeDoTitular;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getDocumentoDoTitular() {
        return documentoDoTitular;
    }

    public void setDocumentoDoTitular(String documentoDoTitular) {
        this.documentoDoTitular = documentoDoTitular;
    }
}