package br.com.kavak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kavak.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca,Long> {
	

}
