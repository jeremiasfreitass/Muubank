package com.project.muubank.controller;

import com.project.muubank.persistence.entity.Conta;
import com.project.muubank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> listarTodos(){
        return ResponseEntity.ok(this.contaService.listarTodos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Conta> listarPorId(@PathVariable(name="id")String id){
        return ResponseEntity.ok(this.contaService.listarPorId(id));
    }
    @PostMapping()
    public ResponseEntity<Conta> cadastrar(@RequestBody Conta conta){
        return ResponseEntity.ok(this.contaService.criarConta(conta));
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Conta> editarConta(@PathVariable(name = "id")String id, @RequestBody Conta conta){
        conta.setId(id);
        return ResponseEntity.ok(this.contaService.editarConta(conta));
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Integer> excluir(@PathVariable(name = "id")String id){
        this.contaService.excluir(id);
        return ResponseEntity.ok(1);
    }



}
