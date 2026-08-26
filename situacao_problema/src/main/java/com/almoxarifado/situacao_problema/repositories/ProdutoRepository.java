package com.almoxarifado.situacao_problema.repositories;

import com.almoxarifado.situacao_problema.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = "SELECT * FROM vw_estoque;", nativeQuery = true)
    List<String> listarValorTotal();

    @Query(value = "select nome,categoria,quantidade,valor_unitario from produto;", nativeQuery = true)
    List<String> listarTodosProdutos();
}
