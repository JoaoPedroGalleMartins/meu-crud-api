package com.example.PrimeiraAPI.service;

import com.example.PrimeiraAPI.model.Produtos;
import com.example.PrimeiraAPI.repository.Reposityprodutos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serviceprodutos {

    public final Reposityprodutos reposityprodutos;

    public Serviceprodutos(Reposityprodutos reposityprodutos) {
        this.reposityprodutos = reposityprodutos;
    }

    public Produtos criar(Produtos produtos){return reposityprodutos.save(produtos);}

    public List<Produtos> listarprodutos(){return reposityprodutos.findAll();}

    public void deletarProdutos(Integer id){reposityprodutos.deleteById(id);}

    public Produtos atualizar(Integer id,Produtos request){
        Produtos produto = reposityprodutos.findById(id)
                .orElseThrow(() -> new RuntimeException("PRoduto nao encontrado"));
        produto.setName(request.getName());
        produto.setPreco(request.getPreco());
        produto.setQuantity(request.getQuantity());
        produto.setStatus(request.getStatus());
        return reposityprodutos.save(produto);
    }
}
