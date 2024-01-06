package br.com.kavak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.kavak.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
