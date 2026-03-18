package com.example.PrimeiraAPI.controller;

import com.example.PrimeiraAPI.model.Produtos;
import com.example.PrimeiraAPI.service.Serviceprodutos;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class Controllerprodutos {

    public final Serviceprodutos serviceprodutos;

    public Controllerprodutos(Serviceprodutos serviceprodutos) {
        this.serviceprodutos = serviceprodutos;
    }

    @GetMapping
    public List<Produtos> listarprodutos() {return serviceprodutos.listarprodutos();}

    @PostMapping
    public Produtos criar(@RequestBody Produtos produtos){return serviceprodutos.criar(produtos);}

    @DeleteMapping("/{id}")
    public void deletarProdutos(@PathVariable Integer id){serviceprodutos.deletarProdutos(id);}

    @PutMapping("/{id}")
    public Produtos atualizar(@PathVariable Integer id, @RequestBody Produtos request){return serviceprodutos.atualizar(id, request);}
}
