package com.project.muubank.service;

import com.project.muubank.persistence.entity.Conta;
import com.project.muubank.persistence.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaServiceImpl implements ContaService{
    @Autowired
    private ContaRepository contaRepository;

    @Override
    public Conta criarConta(Conta conta) {
        return this.contaRepository.save(conta);
    }

    @Override
    public Conta editarConta(Conta conta) {
        return this.contaRepository.save(conta);
    }

    @Override
    public Conta listarPorId(String id) {
        return null;
    }

    @Override
    public List<Conta> listarTodos() {
        return this.contaRepository.findAll();
    }

    @Override
    public void excluir(String id) {
        this.contaRepository.deleteById(id);
    }
}
