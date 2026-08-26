package com.biolab.carro.services;

import com.biolab.carro.DTO.VeiculoRequest;
import com.biolab.carro.Repositories.VeiculoRepository;
import com.biolab.carro.entities.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo adicionarVeiculo(VeiculoRequest request) {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(request.getMarca());
        veiculo.setModelo(request.getModelo());
        veiculo.setAno(request.getAno());
        veiculo.setValor(request.getValor());
        veiculo.setTipo(request.getTipo());
        veiculo.setId(request.getId());
        veiculoRepository.save(veiculo);
        return veiculo;
    }

    public List<VeiculoRequest> mostrarVeiculos(){
        return veiculoRepository.findAll().stream().map(veiculo -> new VeiculoRequest(veiculo.getId(), veiculo.getMarca(), veiculo.getTipo(), veiculo.getModelo(), veiculo.getAno(), veiculo.getValor())).toList();
    }

    public VeiculoRequest veiculoID(long id){
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        VeiculoRequest veiculoRequest = new VeiculoRequest();
        veiculoRequest.setMarca(veiculo.get().getMarca());
        veiculoRequest.setModelo(veiculo.get().getModelo());
        veiculoRequest.setAno(veiculo.get().getAno());
        veiculoRequest.setValor(veiculo.get().getValor());
        veiculoRequest.setId(veiculo.get().getId());
        veiculoRequest.setTipo(veiculo.get().getTipo());
        return veiculoRequest;
    }

    public String deletarID(long id){
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        if (veiculo == null){
            return "Veiculo não existe";
        }else {
            veiculoRepository.deleteById(id);
            return "veiculo deletado";
        }
    }

    public String alterarVeiculo(long id,VeiculoRequest request) {
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow();
        veiculo.setModelo(request.getModelo());
        veiculo.setMarca(request.getMarca());
        veiculo.setAno(request.getAno());
        veiculo.setValor(request.getValor());
        veiculoRepository.save(veiculo);
        return "alterado pai 😎👌";


    }

}
