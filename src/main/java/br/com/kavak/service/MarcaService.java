package br.com.kavak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kavak.entity.Marca;
import br.com.kavak.repository.MarcaRepository;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodas() {
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca marca) {
        marca.setDataCriacao(java.time.LocalDateTime.now());  // Use a data atual ao inserir
        Marca marcaNova = marcaRepository.saveAndFlush(marca);
        return marcaNova;
    }

    public Marca alterar(Marca marca) {
        marca.setDataAtualizacao(java.time.LocalDateTime.now());  // Use a data atual ao alterar
        return marcaRepository.saveAndFlush(marca);
    }

    public void excluir(Long id) {
        Marca marca = marcaRepository.findById(id).orElse(null);
        if (marca != null) {
            marcaRepository.delete(marca);
        }
    }
}
