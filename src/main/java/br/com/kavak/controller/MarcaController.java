package br.com.kavak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kavak.entity.Marca;
import br.com.kavak.service.MarcaService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/")
	public List<Marca> buscarTodas(){
		return marcaService.buscarTodas();
		
	}

	@PostMapping("/")
	public Marca inserir(Marca marca) {
		return marcaService.inserir(marca);

	}

	@PutMapping("/")
	public Marca alterar(Marca marca) {
		return marcaService.alterar(marca);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathParam("id")Long id) {
		marcaService.excluir(id);
		return ResponseEntity.ok().build();

	}

}
