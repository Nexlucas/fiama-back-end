package com.almoxarifado.situacao_problema.controllers;

import com.almoxarifado.situacao_problema.entities.Produto;
import com.almoxarifado.situacao_problema.entities.Saida;
import com.almoxarifado.situacao_problema.repositories.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class ProdutoController {
    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping(value = "/todosprodutos")
    public List<String> todosprodutos(){
        return produtoRepository.listarTodosProdutos();
    }

    @GetMapping(value = "/valortotal")
    public List<String> valortotal(){
        return produtoRepository.listarValorTotal();
    }

    @PostMapping
    public Produto addproduto(@RequestBody Produto produto){
        Produto p = new Produto(produto.getNome(),produto.getCategoria(),produto.getQuantidade(),produto.getValor_unitario());
        produtoRepository.save(p);
        return p;
    }


}
