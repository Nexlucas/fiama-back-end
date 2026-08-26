package com.biolab.carro.Repositories;

import com.biolab.carro.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

//veiculorepository faz a conexão com o banco
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
}
