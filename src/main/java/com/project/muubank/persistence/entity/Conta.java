package com.project.muubank.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Conta {
    @Id
    private String id ;
    private int numero;
    private double saldo;
    private String documentoDoTitular;
    private String nomeDoTitular;

}