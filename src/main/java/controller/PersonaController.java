package controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import entities.Persona;
import services.PersonaService;

@RestController
@RequestMapping(value="/persona")
public class PersonaController {

	@Autowired
	private PersonaService service;
	
	@PostMapping
	public ResponseEntity<Persona> create(@RequestBody Persona person){
		Persona newPerson = service.create(person);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newPerson.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Persona> findById(@PathVariable Integer id){
		Persona persona = this.service.findById(id);
		return ResponseEntity.ok().body(persona);
	}
	
	@GetMapping
	public ResponseEntity<List<Persona>> findAll(){
		List<Persona> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Persona> update(@PathVariable Integer id, @RequestBody Persona person){
		Persona newPersona = service.update(id, person);
		return ResponseEntity.ok().body(newPersona);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
	
}
