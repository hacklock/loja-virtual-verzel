package br.com.kavak.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categoria")
@Data
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String nome;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAtualizacao;
}
