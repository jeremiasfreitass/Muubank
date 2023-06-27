package com.project.muubank.service;

import com.project.muubank.persistence.entity.Conta;

import java.util.List;

public interface ContaService {
    Conta criarConta(Conta conta);
    Conta editarConta(Conta conta);
    Conta listarPorId(String id);
    List<Conta> listarTodos();
    void excluir(String id);

}
