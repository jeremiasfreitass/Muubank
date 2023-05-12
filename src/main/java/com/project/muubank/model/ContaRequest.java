package com.project.muubank.model;

public class ContaRequest {
    private int numero;
    private double saldo;
    private String documentoDoTitular;
    private String nomeDoTitular;

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

    public String getDocumentoDoTitular() {
        return documentoDoTitular;
    }

    public void setDocumentoDoTitular(String documentoDoTitular) {
        this.documentoDoTitular = documentoDoTitular;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }
}
