package br.com.kavak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kavak.entity.Categoria;
import br.com.kavak.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> buscarTodos() {
		return categoriaRepository.findAll();
	}

	public Categoria inserir(Categoria objeto) {
		objeto.setDataCriacao(java.time.LocalDateTime.now());
		Categoria objetoNovo = categoriaRepository.saveAndFlush(objeto);
		return objetoNovo;
	}

	public Categoria alterar(Categoria objeto) {
		objeto.setDataAtualizacao(java.time.LocalDateTime.now());
		return categoriaRepository.saveAndFlush(objeto);
	}

	public void excluir(Long id) {
		Categoria objeto = categoriaRepository.findById(id).get();
		categoriaRepository.delete(objeto);
	}

}
